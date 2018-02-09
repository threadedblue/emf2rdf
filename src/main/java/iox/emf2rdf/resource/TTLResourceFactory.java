package  iox.emf2rdf.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class TTLResourceFactory extends RDFResourceFactory {
  @Override
  public Resource createResource(final URI uri) {
    return new TTLResource(uri);
  }
}
