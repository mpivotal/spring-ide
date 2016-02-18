//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.05 at 05:47:27 PM CET 
//

package org.springframework.ide.eclipse.osgi.blueprint.internal.jaxb;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3c.dom.Element;

/**
 * 
 * 
 * An argument used to create an object defined by a <bean> component. The
 * <argument> elements are the arguments for the bean class constructor or
 * passed to the bean factory method.
 * 
 * The type, if specified, is used to disambiguate the constructor or method
 * signature. Arguments may also be matched up with arguments by explicitly
 * specifying the index position. If the index is used, then all
 * <argument> elements for the bean must also specify the index.
 * 
 * The value and ref attributes are convenience shortcuts to make the
 * <argument> tag easier to code. A fuller set of injected values and types can
 * be specified using one of the "value" type elements.
 * 
 * 
 * 
 * <p>
 * Java class for Targument complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Targument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Tdescription" minOccurs="0"/>
 *         &lt;group ref="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Gvalue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="type" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Ttype" />
 *       &lt;attribute name="ref" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Tidref" />
 *       &lt;attribute name="value" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}TstringValue" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Targument", propOrder = { "description", "service", "referenceList", "bean", "reference", "targetRef",
		"any", "idref", "value", "list", "set", "map", "array", "props", "_null" })
public class Targument {

	protected Tdescription description;
	protected TinlinedService service;
	@XmlElement(name = "reference-list")
	protected TinlinedReferenceList referenceList;
	protected TinlinedBean bean;
	protected TinlinedReference reference;
	@XmlElement(name = "ref")
	protected Tref targetRef;
	@XmlAnyElement(lax = true)
	protected Object any;
	protected Tref idref;
	protected Tvalue value;
	protected Tcollection list;
	protected Tcollection set;
	protected Tmap map;
	protected Tcollection array;
	protected Tprops props;
	@XmlElement(name = "null")
	protected Tnull _null;
	@XmlAttribute(name = "index")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected BigInteger index;
	@XmlAttribute(name = "type")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String type;
	@XmlAttribute(name = "ref")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String ref;
	@XmlAttribute(name = "value")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String argumentValue;

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link Tdescription }
	 * 
	 */
	public Tdescription getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link Tdescription }
	 * 
	 */
	public void setDescription(Tdescription value) {
		this.description = value;
	}

	/**
	 * Gets the value of the service property.
	 * 
	 * @return possible object is {@link TinlinedService }
	 * 
	 */
	public TinlinedService getService() {
		return service;
	}

	/**
	 * Sets the value of the service property.
	 * 
	 * @param value
	 *            allowed object is {@link TinlinedService }
	 * 
	 */
	public void setService(TinlinedService value) {
		this.service = value;
	}

	/**
	 * Gets the value of the referenceList property.
	 * 
	 * @return possible object is {@link TinlinedReferenceList }
	 * 
	 */
	public TinlinedReferenceList getReferenceList() {
		return referenceList;
	}

	/**
	 * Sets the value of the referenceList property.
	 * 
	 * @param value
	 *            allowed object is {@link TinlinedReferenceList }
	 * 
	 */
	public void setReferenceList(TinlinedReferenceList value) {
		this.referenceList = value;
	}

	/**
	 * Gets the value of the bean property.
	 * 
	 * @return possible object is {@link TinlinedBean }
	 * 
	 */
	public TinlinedBean getBean() {
		return bean;
	}

	/**
	 * Sets the value of the bean property.
	 * 
	 * @param value
	 *            allowed object is {@link TinlinedBean }
	 * 
	 */
	public void setBean(TinlinedBean value) {
		this.bean = value;
	}

	/**
	 * Gets the value of the reference property.
	 * 
	 * @return possible object is {@link TinlinedReference }
	 * 
	 */
	public TinlinedReference getReference() {
		return reference;
	}

	/**
	 * Sets the value of the reference property.
	 * 
	 * @param value
	 *            allowed object is {@link TinlinedReference }
	 * 
	 */
	public void setReference(TinlinedReference value) {
		this.reference = value;
	}

	/**
	 * Gets the value of the targetRef property.
	 * 
	 * @return possible object is {@link Tref }
	 * 
	 */
	public Tref getTargetRef() {
		return targetRef;
	}

	/**
	 * Sets the value of the targetRef property.
	 * 
	 * @param value
	 *            allowed object is {@link Tref }
	 * 
	 */
	public void setTargetRef(Tref value) {
		this.targetRef = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * @return possible object is {@link Element } {@link Object }
	 * 
	 */
	public Object getAny() {
		return any;
	}

	/**
	 * Sets the value of the any property.
	 * 
	 * @param value
	 *            allowed object is {@link Element } {@link Object }
	 * 
	 */
	public void setAny(Object value) {
		this.any = value;
	}

	/**
	 * Gets the value of the idref property.
	 * 
	 * @return possible object is {@link Tref }
	 * 
	 */
	public Tref getIdref() {
		return idref;
	}

	/**
	 * Sets the value of the idref property.
	 * 
	 * @param value
	 *            allowed object is {@link Tref }
	 * 
	 */
	public void setIdref(Tref value) {
		this.idref = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link Tvalue }
	 * 
	 */
	public Tvalue getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link Tvalue }
	 * 
	 */
	public void setValue(Tvalue value) {
		this.value = value;
	}

	/**
	 * Gets the value of the list property.
	 * 
	 * @return possible object is {@link Tcollection }
	 * 
	 */
	public Tcollection getList() {
		return list;
	}

	/**
	 * Sets the value of the list property.
	 * 
	 * @param value
	 *            allowed object is {@link Tcollection }
	 * 
	 */
	public void setList(Tcollection value) {
		this.list = value;
	}

	/**
	 * Gets the value of the set property.
	 * 
	 * @return possible object is {@link Tcollection }
	 * 
	 */
	public Tcollection getSet() {
		return set;
	}

	/**
	 * Sets the value of the set property.
	 * 
	 * @param value
	 *            allowed object is {@link Tcollection }
	 * 
	 */
	public void setSet(Tcollection value) {
		this.set = value;
	}

	/**
	 * Gets the value of the map property.
	 * 
	 * @return possible object is {@link Tmap }
	 * 
	 */
	public Tmap getMap() {
		return map;
	}

	/**
	 * Sets the value of the map property.
	 * 
	 * @param value
	 *            allowed object is {@link Tmap }
	 * 
	 */
	public void setMap(Tmap value) {
		this.map = value;
	}

	/**
	 * Gets the value of the array property.
	 * 
	 * @return possible object is {@link Tcollection }
	 * 
	 */
	public Tcollection getArray() {
		return array;
	}

	/**
	 * Sets the value of the array property.
	 * 
	 * @param value
	 *            allowed object is {@link Tcollection }
	 * 
	 */
	public void setArray(Tcollection value) {
		this.array = value;
	}

	/**
	 * Gets the value of the props property.
	 * 
	 * @return possible object is {@link Tprops }
	 * 
	 */
	public Tprops getProps() {
		return props;
	}

	/**
	 * Sets the value of the props property.
	 * 
	 * @param value
	 *            allowed object is {@link Tprops }
	 * 
	 */
	public void setProps(Tprops value) {
		this.props = value;
	}

	/**
	 * Gets the value of the null property.
	 * 
	 * @return possible object is {@link Tnull }
	 * 
	 */
	public Tnull getNull() {
		return _null;
	}

	/**
	 * Sets the value of the null property.
	 * 
	 * @param value
	 *            allowed object is {@link Tnull }
	 * 
	 */
	public void setNull(Tnull value) {
		this._null = value;
	}

	/**
	 * Gets the value of the index property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public BigInteger getIndex() {
		return index;
	}

	/**
	 * Sets the value of the index property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setIndex(BigInteger value) {
		this.index = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value) {
		this.type = value;
	}

	/**
	 * Gets the value of the ref property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * Sets the value of the ref property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRef(String value) {
		this.ref = value;
	}

	/**
	 * Gets the value of the argumentValue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArgumentValue() {
		return argumentValue;
	}

	/**
	 * Sets the value of the argumentValue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArgumentValue(String value) {
		this.argumentValue = value;
	}

}
