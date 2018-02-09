package iox.emf2rdf.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

@SuppressWarnings("all")
public class RDFResourceFactory extends ResourceFactoryImpl {
  @Override
  public Resource createResource(final URI uri) {
    return new RDFResource(uri);
  }
}
