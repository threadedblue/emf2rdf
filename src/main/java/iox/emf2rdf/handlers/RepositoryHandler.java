package iox.emf2rdf.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.eclipse.rdf4j.repository.Repository;

import com.google.common.base.Objects;

import iox.emf2rdf.streams.RepositoryInputStream;
import iox.emf2rdf.streams.RepositoryOutputStream;

@SuppressWarnings("all")
public class RepositoryHandler extends URIHandlerImpl {
  private final Repository repository;
  
  public RepositoryHandler(final Repository repository) {
    this.repository = repository;
  }
  
  @Override
  public boolean canHandle(final URI uri) {
    return true;
  }
  
  @Override
  public OutputStream createOutputStream(final URI uri, final Map<?, ?> options) throws IOException {
    RepositoryOutputStream _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.repository, null);
      if (_equals) {
        throw new IOException("Repository must be defined");
      }
      _xblockexpression = new RepositoryOutputStream(this.repository, uri);
    }
    return _xblockexpression;
  }
  
  @Override
  public InputStream createInputStream(final URI uri, final Map<?, ?> options) throws IOException {
    RepositoryInputStream _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.repository, null);
      if (_equals) {
        throw new IOException("Repository must be defined");
      }
      _xblockexpression = new RepositoryInputStream(this.repository, uri);
    }
    return _xblockexpression;
  }
}
