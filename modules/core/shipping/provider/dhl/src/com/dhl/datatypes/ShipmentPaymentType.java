//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:11:11 PM MSK 
//

package com.dhl.datatypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ShipmentPaymentType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ShipmentPaymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="1"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="C"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentPaymentType")
@XmlEnum
public enum ShipmentPaymentType {

    S, R, T, C;

    public String value() {
        return name();
    }

    public static ShipmentPaymentType fromValue(String v) {
        return valueOf(v);
    }

}
