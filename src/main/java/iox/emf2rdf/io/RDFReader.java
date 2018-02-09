package iox.emf2rdf.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFHandlerException;
import org.eclipse.rdf4j.rio.RDFParseException;
import org.eclipse.rdf4j.rio.RDFParser;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.rdf4j.rio.helpers.StatementCollector;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class RDFReader {
  public static Model read(final InputStream stream, final RDFFormat format, final URI uri) {
    LinkedHashModel _linkedHashModel = new LinkedHashModel();
    return RDFReader.read(stream, _linkedHashModel, format, uri);
  }
  
  public static Model read(final InputStream stream, final Model graph, final RDFFormat format, final URI uri) {
    RDFParser _reader = RDFReader.getReader(format);
    return RDFReader.doRead(_reader, stream, graph, uri);
  }
  
  private static RDFParser getReader(final RDFFormat format) {
    RDFParser _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equals(format, RDFFormat.TURTLE)) {
        _matched=true;
        _switchResult = Rio.createParser(RDFFormat.TURTLE);
      }
    }
    if (!_matched) {
      if (Objects.equals(format, RDFFormat.NTRIPLES)) {
        _matched=true;
        _switchResult = Rio.createParser(RDFFormat.NTRIPLES);
      }
    }
    if (!_matched) {
      _switchResult = Rio.createParser(RDFFormat.RDFXML);
    }
    return _switchResult;
  }
  
  private static Model doRead(final RDFParser reader, final InputStream stream, final Model graph, final URI uri) {
    try {
      Model _xblockexpression = null;
      {
        final StatementCollector collector = new StatementCollector(graph);
        reader.setRDFHandler(collector);
        try {
          String _string = uri.toString();
          reader.parse(stream, _string);
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException e = (IOException)_t;
            throw e;
          } else if (_t instanceof RDFParseException) {
            final RDFParseException e_1 = (RDFParseException)_t;
            throw e_1;
          } else if (_t instanceof RDFHandlerException) {
            final RDFHandlerException e_2 = (RDFHandlerException)_t;
            throw e_2;
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        _xblockexpression = graph;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
