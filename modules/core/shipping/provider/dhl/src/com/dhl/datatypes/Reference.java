//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:11:11 PM MSK 
//

package com.dhl.datatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Reference complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceID" type="{http://www.dhl.com/datatypes}ReferenceID"/>
 *         &lt;element name="ReferenceType" type="{http://www.dhl.com/datatypes}ReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = { "referenceID", "referenceType" })
public class Reference {

    @XmlElement(name = "ReferenceID", required = true)
    protected String referenceID;
    @XmlElement(name = "ReferenceType")
    protected String referenceType;

    /**
     * Gets the value of the referenceID property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the referenceType property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReferenceType(String value) {
        this.referenceType = value;
    }

}
