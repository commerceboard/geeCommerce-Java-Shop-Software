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
 * Java class for ChargeCardType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ChargeCardType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="2"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="DI"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="VI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeCardType")
@XmlEnum
public enum ChargeCardType {

    AM, DC, DI, MC, VI;

    public String value() {
        return name();
    }

    public static ChargeCardType fromValue(String v) {
        return valueOf(v);
    }

}