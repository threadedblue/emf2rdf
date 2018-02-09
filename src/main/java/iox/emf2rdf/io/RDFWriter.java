package iox.emf2rdf.io;

import java.io.OutputStream;
import java.util.function.Consumer;

import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.rio.RDFHandlerException;
import org.eclipse.rdf4j.rio.Rio;
import org.eclipse.xtext.xbase.lib.Exceptions;

import iox.emf2rdf.RDFFormat;

@SuppressWarnings("all")
public class RDFWriter {
  public static void write(final OutputStream stream, final Model graph, final RDFFormat format) {
	org.eclipse.rdf4j.rio.RDFWriter _writer = RDFWriter.getWriter(format, stream);
    RDFWriter.doWrite(_writer, graph);
  }
  
  private static org.eclipse.rdf4j.rio.RDFWriter getWriter(final RDFFormat format, final OutputStream stream) {
	  org.eclipse.rdf4j.rio.RDFWriter _switchResult = null;
	  
    if (format != null) {
      switch (format) {
        case TURTLE:
          _switchResult = Rio.createWriter(org.eclipse.rdf4j.rio.RDFFormat.TURTLE, stream);
          break;
        case NTRIPLES:
          _switchResult = Rio.createWriter(org.eclipse.rdf4j.rio.RDFFormat.NTRIPLES, stream);
          break;
        default:
          _switchResult = Rio.createWriter(org.eclipse.rdf4j.rio.RDFFormat.RDFXML, stream);
          break;
      }
    } else {
      _switchResult = Rio.createWriter(org.eclipse.rdf4j.rio.RDFFormat.RDFXML, stream);
    }
    return _switchResult;
  }
  
  private static void doWrite(final org.eclipse.rdf4j.rio.RDFWriter writer, final Model graph) {
    try {
      writer.startRDF();
      final Consumer<Statement> _function = new Consumer<Statement>() {
        @Override
        public void accept(final Statement it) {
          try {
            writer.handleStatement(it);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      graph.forEach(_function);
      writer.endRDF();
    } catch (final Throwable _t) {
      if (_t instanceof RDFHandlerException) {
        final RDFHandlerException e = (RDFHandlerException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
