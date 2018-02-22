package emf2rdf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.sail.SailRepository;
import org.eclipse.rdf4j.sail.memory.MemoryStore;
import org.junit.BeforeClass;
import org.junit.Test;

import iox.emf2rdf.handlers.RepositoryHandler;
import iox.emf2rdf.resource.RDFResourceFactory;
import iox.sds4emf.Registrar;
import littleints.theseints.Int1;
import littleints.theseints.impl.TheseintsFactoryImpl;
import model.Child;
import model.ModelFactory;
import model.ModelPackage;
import model.Parent;

public class LittleTest {

	private static final int CHILD_COUNT = 5;
	private static final int PARENT_COUNT = 3;
	static Int1 int1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Registrar.associateExtension("rdf", new RDFResourceFactory());
		int1 = TheseintsFactoryImpl.eINSTANCE.createInt1();
		int1.setBoolVal(true);
		int1.setDoubVal(123D);
		int1.setStrVal("AAA BBB CCC");
	}

	@Test
	public void testLittle() {
		Repository repo = new SailRepository(new MemoryStore());
		repo.initialize();

		try {
			ResourceSet resourceSet = Registrar.getResourceSet();
			resourceSet.getURIConverter().getURIHandlers().add(0, new RepositoryHandler(repo));
			Resource resource = resourceSet.createResource(URI.createURI("http:///dummy.rdf"));
			resource.getContents().add(int1);
			ByteArrayOutputStream stream1 = new ByteArrayOutputStream();
			resource.save(stream1, Collections.EMPTY_MAP);
			resource.getContents().clear();
			String rval1 = stream1.toString();
			System.out.println(rval1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testModel() {
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new RDFResourceFactory());

		System.out.println("Start ...");
		long startTime = System.currentTimeMillis();

		Repository repo = new SailRepository(new MemoryStore());
		repo.initialize();

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIHandlers().add(0, new RepositoryHandler(repo));

		Resource resource = resourceSet.createResource(URI.createURI("http://www.example.org/myResource"));

		for (int i = 0; i < PARENT_COUNT; i++) {
			if (i % 100 == 0)
				System.out.println();
			System.out.print(".");

			Parent parent = ModelFactory.eINSTANCE.createParent();
			parent.setId("parent_" + i);
			parent.setName("Parent " + i);
			resource.getContents().add(parent);

			for (int j = 0; j < CHILD_COUNT; j++) {
				Child child = ModelFactory.eINSTANCE.createChild();
				child.setId("child_" + i + "_" + j);
				child.setName("Child " + i + " " + j);
				parent.getChildren().add(child);
			}

			try {
				ByteArrayOutputStream stream1 = new ByteArrayOutputStream();
				resource.save(stream1, Collections.EMPTY_MAP);
				System.out.println(stream1.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resource.getContents().clear();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Time to create and store " + (PARENT_COUNT * CHILD_COUNT) + " objects: "
				+ ((endTime - startTime) / 1000.0) + " sec");

		startTime = System.currentTimeMillis();

		resource = resourceSet.createResource(URI.createURI("http://www.example.org/myResource"));
		try {
			resource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		endTime = System.currentTimeMillis();

		System.out
				.println("Time to load: " + (PARENT_COUNT * CHILD_COUNT) + " objects " + (endTime - startTime) + " ms");

		Parent parent = (Parent) resource.getContents().get(0);

		startTime = System.currentTimeMillis();

		System.out.println("first parent " + parent.getName() + " has " + parent.getChildren().size() + " children");
		for (Child child : parent.getChildren()) {
			child.getName();
		}

		endTime = System.currentTimeMillis();
		System.out
				.println("Time to walk " + CHILD_COUNT + " children of first parent: " + (endTime - startTime) + " ms");
	}
}
