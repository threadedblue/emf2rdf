package iox.emf2rdf;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import iox.sds4emf.Deserialize;

public class EMF2Triple implements Runnable {

	@Override
	public void run() {
		String s = getFile("little.xml");
		try {
			StringReader reader = new StringReader(s);
			EObject eObject = Deserialize.it(reader, "http:///dummy.xml");
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource res = resourceSet.createResource(URI.createURI("http:///fom.rdf"));
			res.getContents().add(eObject);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			res.save(stream, null);
			System.out.println(stream.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	  private String getFile(String fileName) {

			StringBuilder result = new StringBuilder("");

			//Get file from resources folder
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource(fileName).getFile());

			try (Scanner scanner = new Scanner(file)) {

				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					result.append(line).append("\n");
				}

				scanner.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

			return result.toString();

		  }
	public static void main(String[] args) {
		EMF2Triple app = new EMF2Triple();
		app.run();
	}
}
