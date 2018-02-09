package iox.emf2rdf.resource;

import java.io.OutputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.rdf4j.model.Model;

import iox.emf2rdf.RDFFormat;
import iox.emf2rdf.io.RDFWriter;

@SuppressWarnings("all")
public class NTResource extends RDFResource {
  public NTResource() {
    super();
  }
  
  public NTResource(final URI uri) {
    super(uri);
  }
  
  @Override
  protected void write(final OutputStream stream, final Model graph) {
    RDFWriter.write(stream, graph, RDFFormat.NTRIPLES);
  }
}
