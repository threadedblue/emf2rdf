package iox.emf2rdf.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.rdf4j.model.Model;

import iox.emf2rdf.io.RDFReader;
import iox.emf2rdf.io.RDFWriter;
import iox.emf2rdf.map.EObjectMapper;

@SuppressWarnings("all")
public class RDFResource extends ResourceImpl {
  public RDFResource() {
  }
  
  public RDFResource(final URI uri) {
    super(uri);
  }
  
  @Override
  protected void doLoad(final InputStream inputStream, final Map<?, ?> options) throws IOException {
    if ((inputStream instanceof URIConverter.Loadable)) {
      ((URIConverter.Loadable) inputStream).loadResource(this);
    } else {
      final EObjectMapper mapper = new EObjectMapper();
      URI _uRI = this.getURI();
      Model _read = RDFReader.read(inputStream, null, _uRI);
      mapper.from(_read, this);
    }
  }
  
  @Override
  protected void doSave(final OutputStream outputStream, final Map<?, ?> options) throws IOException {
    if ((outputStream instanceof URIConverter.Saveable)) {
      ((URIConverter.Saveable) outputStream).saveResource(this);
    } else {
      final EObjectMapper mapper = new EObjectMapper();
      Model _to = mapper.to(this);
      this.write(outputStream, _to);
    }
  }
  
  protected void write(final OutputStream stream, final Model graph) {
    RDFWriter.write(stream, graph, null);
  }
}
