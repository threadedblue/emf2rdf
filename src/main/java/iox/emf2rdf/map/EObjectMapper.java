package  iox.emf2rdf.map;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import iox.emf2rdf.map.Deserializer;
import iox.emf2rdf.map.Serializer;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.model.impl.LinkedHashModel;

@SuppressWarnings("all")
public class EObjectMapper {
  public Model to(final Resource resource) {
    ArrayList<Statement> _newArrayList = CollectionLiterals.<Statement>newArrayList();
    LinkedHashModel _linkedHashModel = new LinkedHashModel(_newArrayList);
    return this.to(_linkedHashModel, resource);
  }
  
  public Model to(final Model graph, final Resource resource) {
    Model _xblockexpression = null;
    {
      final Serializer serializer = new Serializer();
      Model _xifexpression = null;
      boolean _equals = Objects.equal(graph, null);
      if (_equals) {
        ArrayList<Statement> _newArrayList = CollectionLiterals.<Statement>newArrayList();
        _xifexpression = new LinkedHashModel(_newArrayList);
      } else {
        _xifexpression = graph;
      }
      _xblockexpression = serializer.to(resource, _xifexpression);
    }
    return _xblockexpression;
  }
  
  public void from(final Model graph, final Resource resource) {
    final Deserializer deserializer = new Deserializer();
    deserializer.from(graph, resource);
  }
}
