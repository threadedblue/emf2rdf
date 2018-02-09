package iox.emf2rdf.streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.model.impl.URIImpl;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.xtext.xbase.lib.Exceptions;

import iox.emf2rdf.map.EObjectMapper;

@SuppressWarnings("all")
public class RepositoryOutputStream extends ByteArrayOutputStream implements URIConverter.Saveable {
  protected final Repository repository;
  
  protected final URI uri;
  
  public RepositoryOutputStream(final Repository repository, final URI uri) {
    this.uri = uri;
    this.repository = repository;
  }
  
  @Override
  public void saveResource(final Resource resource) throws IOException {
    try {
      final String namedGraphURI = this.uri.toString();
      final EObjectMapper mapper = new EObjectMapper();
      final LinkedHashModel graph = new LinkedHashModel();
      mapper.to(graph, resource);
      final RepositoryConnection connection = this.repository.getConnection();
      connection.begin();
      try {
        URIImpl _uRIImpl = new URIImpl(namedGraphURI);
        connection.add(graph, _uRIImpl);
        connection.commit();
      } finally {
        connection.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
