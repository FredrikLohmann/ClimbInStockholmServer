//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.17 at 01:29:23 PM CEST 
//


package org.my.schema.external.org.w3.atom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atomPersonConstruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atomPersonConstruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.w3.org/2005/Atom}name"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}uri"/>
 *         &lt;element ref="{http://www.w3.org/2005/Atom}email"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomPersonConstruct", propOrder = {
    "nameOrUriOrEmail"
})
public class AtomPersonConstruct {

    @XmlElementRefs({
        @XmlElementRef(name = "uri", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "email", namespace = "http://www.w3.org/2005/Atom", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> nameOrUriOrEmail;

    /**
     * Gets the value of the nameOrUriOrEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOrUriOrEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOrUriOrEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getNameOrUriOrEmail() {
        if (nameOrUriOrEmail == null) {
            nameOrUriOrEmail = new ArrayList<JAXBElement<String>>();
        }
        return this.nameOrUriOrEmail;
    }

}
