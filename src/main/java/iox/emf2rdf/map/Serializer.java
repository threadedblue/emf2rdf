package iox.emf2rdf.map;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.ValueFactory;
import org.eclipse.rdf4j.model.impl.SimpleIRI;
import org.eclipse.rdf4j.model.impl.SimpleValueFactory;
import org.eclipse.rdf4j.model.vocabulary.RDF;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Serializer {

	private static final Logger log = LogManager.getLogger(Serializer.class);

	@Extension
	private Extensions extensions = new Extensions();

	public Model to(final Resource resource,

			final Model graph) {
		log.trace("Resource was = " + resource.getURI());
		Model _xblockexpression = null;
		{
			EList<EObject> _contents = resource.getContents();

			final Consumer<EObject> _function = new Consumer<EObject>() {

				@Override

				public void accept(

						final EObject it) {
					SimpleValueFactory _instance = SimpleValueFactory.getInstance();
					Serializer.this.to(it, graph, _instance);
				}
			};
			_contents.forEach(_function);
			_xblockexpression = graph;
		}
		return _xblockexpression;
	}

	public Model to(final EObject eObject, final Model graph, final ValueFactory factory) {
		log.debug("EObject==>" + eObject.eClass().getName() + " hsh=" + eObject.hashCode());

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

			final SimpleIRI subject = this.extensions.toURI(eObject);
			final IRI predicate = RDF.TYPE;
			EClass _eClass = eObject.eClass();
			final SimpleIRI object = this.extensions.toURI(_eClass);
			_xblockexpression = graph.add(subject, predicate, object);
		}
		return _xblockexpression;
	}

	private Boolean serialize(final EAttribute attribute, final EObject eObject, final Model graph,
			final ValueFactory factory) {
		boolean _xblockexpression = false;
			boolean _isTransient = attribute.isTransient();
			boolean _eIsSet = eObject.eIsSet(attribute);
			log.debug("EAttribute=" + attribute.getName()
			+ " _isTransient=" + _isTransient 
			+ " _eIsSet=" + _eIsSet
			+ " isFeatureMap=" + FeatureMapUtil.isFeatureMap(attribute)
			+ " isMany=" + attribute.isMany());
			if (_isTransient || !_eIsSet) {
				return null;
			} else {

				final Object value = eObject.eGet(attribute);
				boolean _xifexpression = false;
				if (FeatureMapUtil.isFeatureMap(attribute)) {
//					log.trace("EAttribute was map = " + attribute.getName());
					Serializer.this.serialize(eObject, (FeatureMap) value, graph, factory);
				} else if (attribute.isMany()) {
//					log.trace("EAttribute was many = " + attribute.getName() + " " + value);

					final Consumer<Object> _function = new Consumer<Object>() {

						@Override
						public void accept(final Object it) {
							Serializer.this.extensions.add(graph, eObject, attribute, it, factory);
						}

					};
					((Collection<Object>) value).forEach(_function);
				} else {
					log.trace("EAttribute value= " + value);
					_xifexpression = this.extensions.add(graph, eObject, attribute, value, factory);
				}
				_xblockexpression = _xifexpression;
			}
		return Boolean.valueOf(_xblockexpression);
	}

	private Boolean serialize(final EReference reference, final EObject eObject, final Model graph,
			final ValueFactory factory) {
		log.debug("EReference=" + reference.getName() + " hsh=" + reference.hashCode() + " eObject=" + eObject.eClass().getName() + " hsh=" + eObject.hashCode());
		boolean _xblockexpression = false;
		{
			boolean _isTransient = reference.isTransient();
			boolean _eIsSet = eObject.eIsSet(reference);
			if (_isTransient || !_eIsSet) {
//				log.trace("returned null EReference= " + reference.getName() + " _isTransient=" + _isTransient + " _eIsSet=" + _eIsSet);
				return null;
			} // else {
//				EList<EObject> eList = eObject.eContents();
//				final Consumer<EObject> _function = new Consumer<EObject>() {
//
//					@Override
//					public void accept(final EObject it) {
//						if (it instanceof AnyType) {
////							log.trace("it was AnyType it=" + it.getClass());
//							Serializer.this.serialize(eObject, (AnyType) it, graph, factory);
//						} else {
////							log.warn("it was *NOT* AnyType it=" + it.getClass());
//							Serializer.this.to(it, graph, factory);
//						}
//					}
//				};
//				((Collection<EObject>) eList).forEach(_function);
//			}

			final Object value = eObject.eGet(reference);
			boolean _xifexpression = false;
			boolean _isMany = reference.isMany();
			if (_isMany) {
				log.debug("_isMany=" + _isMany);
				final Consumer<Object> _function = new Consumer<Object>() {

					@Override
					public void accept(final Object it) {
						serializeOne(eObject, reference, ((EObject) it), graph, factory);
					}
				};
				((Collection<Object>) value).forEach(_function);
			} else if (value instanceof FeatureMapUtil.FeatureEList) {
				log.debug("_isFeature=");
				FeatureMapUtil.FeatureEList features = (FeatureMapUtil.FeatureEList) value;
				List<AnyType> anys = features.basicList();
				for (AnyType any : anys) {
					for (FeatureMap.Entry entry : any.getMixed()) {
						EStructuralFeature feature = entry.getEStructuralFeature();
						if (feature instanceof EAttribute) {
							EAttribute eAttribute = (EAttribute) feature;
							_xifexpression = this.serialize(eAttribute, eObject, graph, factory);
						} else {
							EReference eReference = (EReference) feature;
							_xifexpression = this.serializeOne(eObject, eReference, feature, graph, factory);
						}
					}
				}
			} else {
				log.debug("_isMany=" + _isMany);
				_xifexpression = this.serializeOne(eObject, reference, ((EObject) value), graph, factory);
			}
			_xblockexpression = _xifexpression;
		}
		return Boolean.valueOf(_xblockexpression);
	}

	private Boolean serialize(final EObject eObject, final AnyType any, final Model graph, final ValueFactory factory) {
		log.debug("EObject=" + eObject.eClass().getName());
		boolean _xblockexpression = true;
		FeatureMap mapAny = any.getAny();
		Serializer.this.serialize(any, mapAny, graph, factory);
		FeatureMap mapMixed = any.getMixed();
		Serializer.this.serialize(any, mapMixed, graph, factory);
		return _xblockexpression;
	}

	private Boolean serialize(final EObject eObject, final FeatureMap mapFeature, final Model graph,
			final ValueFactory factory) {
		log.debug("EObject=" + eObject.eClass().getName());
		boolean _xblockexpression = false;

		final Consumer<FeatureMap.Entry> _function = new Consumer<FeatureMap.Entry>() {

			@Override
			public void accept(final FeatureMap.Entry it) {
				EStructuralFeature feature = it.getEStructuralFeature();
//				log.trace("EStructuralFeature was = " + feature.getName() + " " + feature.eClass().getName());
				if (feature instanceof EAttribute) {
					EDataType eDataType = ((EAttribute) feature).getEAttributeType();
					Serializer.this.serialize((EAttribute) feature, eObject, graph, factory);
				} else if (feature instanceof EReference) {
					Serializer.this.serialize((EReference) feature, eObject, graph, factory);
				} else {
					log.error("EStructuralFeature was else = " + feature.getName() + " " + mapFeature);
				}
			}

		};
		((Collection<FeatureMap.Entry>) mapFeature).forEach(_function);
		return _xblockexpression;
	}

	private boolean serializeOne(final EObject subject, final EReference reference, final EObject value,
			final Model graph, final ValueFactory factory) {
		log.debug("EObject=" + subject.eClass().getName() + " hsh=" + subject.hashCode() + " EReference=" + reference.getName() + " hsh=" + reference.hashCode());
		log.debug("=> value=" + value.eClass().getName() + " hsh=" + value.hashCode());
		boolean _xblockexpression = false;
//		{
			boolean _isContainment = reference.isContainment();
			if (_isContainment) {
				this.to(value, graph, factory);
			}
			_xblockexpression = this.extensions.add(graph, subject, reference, value);
//		}
		return _xblockexpression;
	}
}
