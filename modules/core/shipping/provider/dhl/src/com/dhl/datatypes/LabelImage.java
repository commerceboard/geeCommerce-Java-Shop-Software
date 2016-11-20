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
 * LabelImage
 * 
 * <p>
 * Java class for LabelImage complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="LabelImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutputFormat" type="{http://www.dhl.com/datatypes}OutputFormat" minOccurs="0"/>
 *         &lt;element name="OutputImage" type="{http://www.dhl.com/datatypes}OutputImage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelImage", propOrder = { "outputFormat", "outputImage" })
public class LabelImage {

    @XmlElement(name = "OutputFormat")
    protected OutputFormat outputFormat;
    @XmlElement(name = "OutputImage")
    protected byte[] outputImage;

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return possible object is {@link OutputFormat }
     * 
     */
    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *            allowed object is {@link OutputFormat }
     * 
     */
    public void setOutputFormat(OutputFormat value) {
        this.outputFormat = value;
    }

    /**
     * Gets the value of the outputImage property.
     * 
     * @return possible object is byte[]
     */
    public byte[] getOutputImage() {
        return outputImage;
    }

    /**
     * Sets the value of the outputImage property.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setOutputImage(byte[] value) {
        this.outputImage = value;
    }

}
