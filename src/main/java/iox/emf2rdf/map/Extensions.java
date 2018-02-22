package  iox.emf2rdf.map;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rdf4j.model.Literal;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleIRI;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.impl.URIImpl;

import com.google.common.base.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("all")
class Extensions {
    
    private static final Logger log = LogManager.getLogger(Extensions.class);
    
  public EObject getEObject(final ResourceSet resourceSet, final Value value) {
    URI _uRI = this.toURI(value);
    return resourceSet.getEObject(_uRI, true);
  }
  
  public URI toURI(final Value value) {
    String _stringValue = value.stringValue();
    return URI.createURI(_stringValue);
  }
  
  public SimpleIRI toURI(final EObject eObject) {
    URI _uRI = EcoreUtil.getURI(eObject);
    return this.toURI(_uRI);
  }
  
  public SimpleIRI toURI(final URI uri) {
    String _string = uri.toString();
    return (SimpleIRI) SimpleValueFactory.getInstance().createIRI(_string);
  }
  
  public Literal toLiteral(final Object value, final EAttribute attribute, final ValueFactory factory) {
    Literal _xblockexpression = null;
    {
      EDataType _eAttributeType = attribute.getEAttributeType();
      final String stringValue = EcoreUtil.convertToString(_eAttributeType, value);
      _xblockexpression = factory.createLiteral(stringValue);
    }
    return _xblockexpression;
  }
  
  public boolean add(final Model graph, final EObject eObject, final EAttribute feature, final Object value, final ValueFactory factory) {
	SimpleIRI _uRI = this.toURI(eObject);
	SimpleIRI _uRI_1 = this.toURI(feature);
    Literal _literal = this.toLiteral(value, feature, factory);
    return graph.add(_uRI, _uRI_1, _literal);
  }
  
  public boolean add(final Model graph, final EObject eObject, final EReference feature, final EObject value) {
	SimpleIRI _uRI = this.toURI(eObject);
	SimpleIRI _uRI_1 = this.toURI(feature);
	SimpleIRI _uRI_2 = this.toURI(value);
    return graph.add(_uRI, _uRI_1, _uRI_2);
  }
  
  public List<EObject> appendTo(final EObject object, final List<EObject> objects) {
    List<EObject> _xblockexpression = null;
    {
      boolean _notEquals = (!Objects.equal(object, null));
      if (_notEquals) {
        objects.add(object);
      }
      _xblockexpression = objects;
    }
    return _xblockexpression;
  }
}
