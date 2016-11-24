//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:11:11 PM MSK 
//

package com.dhl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Standard routing header
 * 
 * <p>
 * Java class for ServiceHeader complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MessageReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SiteID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceHeader", propOrder = { "messageTime", "messageReference", "siteID" })
public class ServiceHeader {

    @XmlElement(name = "MessageTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageTime;
    @XmlElement(name = "MessageReference")
    protected String messageReference;
    @XmlElement(name = "SiteID", required = true)
    protected String siteID;

    /**
     * Gets the value of the messageTime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getMessageTime() {
        return messageTime;
    }

    /**
     * Sets the value of the messageTime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setMessageTime(XMLGregorianCalendar value) {
        this.messageTime = value;
    }

    /**
     * Gets the value of the messageReference property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMessageReference() {
        return messageReference;
    }

    /**
     * Sets the value of the messageReference property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMessageReference(String value) {
        this.messageReference = value;
    }

    /**
     * Gets the value of the siteID property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Sets the value of the siteID property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSiteID(String value) {
        this.siteID = value;
    }

}