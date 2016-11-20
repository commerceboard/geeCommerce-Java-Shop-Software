//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:11:11 PM MSK 
//

package com.dhl.dctresponsedatatypes;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SrvType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SrvType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlobalProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MrkSrv" type="{http://www.dhl.com/DCTResponsedatatypes}MrkSrvType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SBTP" type="{http://www.dhl.com/DCTResponsedatatypes}SBTPType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SrvType", propOrder = { "globalProductCode", "mrkSrv", "sbtp" })
public class SrvType {

    @XmlElement(name = "GlobalProductCode", required = true)
    protected String globalProductCode;
    @XmlElement(name = "MrkSrv")
    protected List<MrkSrvType> mrkSrv;
    @XmlElement(name = "SBTP")
    protected SBTPType sbtp;

    /**
     * Gets the value of the globalProductCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGlobalProductCode() {
        return globalProductCode;
    }

    /**
     * Sets the value of the globalProductCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setGlobalProductCode(String value) {
        this.globalProductCode = value;
    }

    /**
     * Gets the value of the mrkSrv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the mrkSrv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getMrkSrv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MrkSrvType }
     * 
     * 
     */
    public List<MrkSrvType> getMrkSrv() {
        if (mrkSrv == null) {
            mrkSrv = new ArrayList<MrkSrvType>();
        }
        return this.mrkSrv;
    }

    /**
     * Gets the value of the sbtp property.
     * 
     * @return possible object is {@link SBTPType }
     * 
     */
    public SBTPType getSBTP() {
        return sbtp;
    }

    /**
     * Sets the value of the sbtp property.
     * 
     * @param value
     *            allowed object is {@link SBTPType }
     * 
     */
    public void setSBTP(SBTPType value) {
        this.sbtp = value;
    }

}
