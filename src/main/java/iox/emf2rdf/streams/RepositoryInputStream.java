package iox.emf2rdf.streams;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.rdf4j.common.iteration.Iterations;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.model.impl.URIImpl;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;
import org.eclipse.rdf4j.repository.RepositoryResult;
import org.eclipse.xtext.xbase.lib.Exceptions;

import iox.emf2rdf.map.EObjectMapper;

@SuppressWarnings("all")
public class RepositoryInputStream extends InputStream implements URIConverter.Loadable {
  protected final Repository repository;
  
  protected final URI uri;
  
  public RepositoryInputStream(final Repository repository, final URI uri) {
    this.uri = uri;
    this.repository = repository;
  }
  
  @Override
  public int read() throws IOException {
    return 0;
  }
  
  @Override
  public void loadResource(final Resource resource) throws IOException {
    try {
      final String namedGraphURI = this.uri.toString();
      final EObjectMapper mapper = new EObjectMapper();
      final RepositoryConnection connection = this.repository.getConnection();
      try {
        URIImpl _uRIImpl = new URIImpl(namedGraphURI);
        final RepositoryResult<Statement> stmts = connection.getStatements(null, null, null, true, _uRIImpl);
        LinkedHashModel _linkedHashModel = new LinkedHashModel();
        final LinkedHashModel graph = Iterations.<Statement, RepositoryException, LinkedHashModel>addAll(stmts, _linkedHashModel);
        mapper.from(graph, resource);
        stmts.close();
      } finally {
        connection.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
