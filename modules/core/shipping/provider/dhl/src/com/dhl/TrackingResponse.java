//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:09:32 PM MSK 
//

package com.dhl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.dhl.datatypes.AWBInfo;
import com.dhl.datatypes.Fault;
import com.dhl.datatypes.Response;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{http://www.dhl.com/datatypes}Response"/>
 *         &lt;element name="AWBInfo" type="{http://www.dhl.com/datatypes}AWBInfo" maxOccurs="unbounded"/>
 *         &lt;element name="Fault" type="{http://www.dhl.com/datatypes}Fault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "response", "awbInfo", "fault" })
@XmlRootElement(name = "TrackingResponse")
public class TrackingResponse {

    @XmlElement(name = "Response", required = true)
    protected Response response;
    @XmlElement(name = "AWBInfo", required = true)
    protected List<AWBInfo> awbInfo;
    @XmlElement(name = "Fault")
    protected Fault fault;

    /**
     * Gets the value of the response property.
     * 
     * @return possible object is {@link Response }
     * 
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *            allowed object is {@link Response }
     * 
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the awbInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the awbInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAWBInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AWBInfo }
     * 
     * 
     */
    public List<AWBInfo> getAWBInfo() {
        if (awbInfo == null) {
            awbInfo = new ArrayList<AWBInfo>();
        }
        return this.awbInfo;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return possible object is {@link Fault }
     * 
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *            allowed object is {@link Fault }
     * 
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

}
