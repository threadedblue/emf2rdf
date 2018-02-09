package iox.emf2rdf.map;

import java.util.Collection;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.URI;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.URIImpl;
import org.eclipse.rdf4j.model.impl.ValueFactoryImpl;
import org.eclipse.rdf4j.model.vocabulary.RDF;

@SuppressWarnings("all")
public class Serializer {
  @Extension
  private Extensions extensions = new Extensions();
  
  public Model to(final Resource resource, final Model graph) {
    Model _xblockexpression = null;
    {
      EList<EObject> _contents = resource.getContents();
      final Consumer<EObject> _function = new Consumer<EObject>() {
        @Override
        public void accept(final EObject it) {
          ValueFactoryImpl _instance = ValueFactoryImpl.getInstance();
          Serializer.this.to(it, graph, _instance);
        }
      };
      _contents.forEach(_function);
      _xblockexpression = graph;
    }
    return _xblockexpression;
  }
  
  public Model to(final EObject eObject, final Model graph, final ValueFactory factory) {
    Model _xblockexpression = null;
    {
      this.createTypeStatement(eObject, graph, factory);
      EClass _eClass = eObject.eClass();
      EList<EAttribute> _eAllAttributes = _eClass.getEAllAttributes();
      final Consumer<EAttribute> _function = new Consumer<EAttribute>() {
        @Override
        public void accept(final EAttribute it) {
          Serializer.this.serialize(it, eObject, graph, factory);
        }
      };
      _eAllAttributes.forEach(_function);
      EClass _eClass_1 = eObject.eClass();
      EList<EReference> _eAllReferences = _eClass_1.getEAllReferences();
      final Consumer<EReference> _function_1 = new Consumer<EReference>() {
        @Override
        public void accept(final EReference it) {
          Serializer.this.serialize(it, eObject, graph, factory);
        }
      };
      _eAllReferences.forEach(_function_1);
      _xblockexpression = graph;
    }
    return _xblockexpression;
  }
  
  protected boolean createTypeStatement(final EObject eObject, final Model graph, final ValueFactory factory) {
    boolean _xblockexpression = false;
    {
      final URIImpl subject = this.extensions.toURI(eObject);
      final URI predicate = RDF.TYPE;
      EClass _eClass = eObject.eClass();
      final URIImpl object = this.extensions.toURI(_eClass);
      _xblockexpression = graph.add(subject, predicate, object);
    }
    return _xblockexpression;
  }
  
  private Boolean serialize(final EAttribute attribute, final EObject eObject, final Model graph, final ValueFactory factory) {
    boolean _xblockexpression = false;
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _isDerived = attribute.isDerived();
      if (_isDerived) {
        _or_1 = true;
      } else {
        boolean _isTransient = attribute.isTransient();
        _or_1 = _isTransient;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _eIsSet = eObject.eIsSet(attribute);
        boolean _not = (!_eIsSet);
        _or = _not;
      }
      if (_or) {
        return null;
      }
      final Object value = eObject.eGet(attribute);
      boolean _xifexpression = false;
      boolean _isMany = attribute.isMany();
      if (_isMany) {
        final Consumer<Object> _function = new Consumer<Object>() {
          @Override
          public void accept(final Object it) {
            Serializer.this.extensions.add(graph, eObject, attribute, it, factory);
          }
        };
        ((Collection<Object>) value).forEach(_function);
      } else {
        _xifexpression = this.extensions.add(graph, eObject, attribute, value, factory);
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  private Boolean serialize(final EReference reference, final EObject eObject, final Model graph, final ValueFactory factory) {
    boolean _xblockexpression = false;
    {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _isDerived = reference.isDerived();
      if (_isDerived) {
        _or_1 = true;
      } else {
        boolean _isTransient = reference.isTransient();
        _or_1 = _isTransient;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _eIsSet = eObject.eIsSet(reference);
        boolean _not = (!_eIsSet);
        _or = _not;
      }
      if (_or) {
        return null;
      }
      final Object value = eObject.eGet(reference);
      boolean _xifexpression = false;
      boolean _isMany = reference.isMany();
      if (_isMany) {
        final Consumer<Object> _function = new Consumer<Object>() {
          @Override
          public void accept(final Object it) {
            Serializer.this.serializeOne(eObject, reference, ((EObject) it), graph, factory);
          }
        };
        ((Collection<Object>) value).forEach(_function);
      } else {
        _xifexpression = this.serializeOne(eObject, reference, ((EObject) value), graph, factory);
      }
      _xblockexpression = _xifexpression;
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  private boolean serializeOne(final EObject subject, final EReference reference, final EObject value, final Model graph, final ValueFactory factory) {
    boolean _xblockexpression = false;
    {
      boolean _isContainment = reference.isContainment();
      if (_isContainment) {
        this.to(value, graph, factory);
      }
      _xblockexpression = this.extensions.add(graph, subject, reference, value);
    }
    return _xblockexpression;
  }
}
