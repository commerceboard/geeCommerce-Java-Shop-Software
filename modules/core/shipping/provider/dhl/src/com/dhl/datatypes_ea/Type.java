//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 05:07:03 PM MSK 
//

package com.dhl.datatypes_ea;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;length value="3"/>
 *     &lt;enumeration value="HWB"/>
 *     &lt;enumeration value="INV"/>
 *     &lt;enumeration value="PNV"/>
 *     &lt;enumeration value="COO"/>
 *     &lt;enumeration value="NAF"/>
 *     &lt;enumeration value="CIN"/>
 *     &lt;enumeration value="DCL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Type")
@XmlEnum
public enum Type {

    HWB, INV, PNV, COO, NAF, CIN, DCL;

    public String value() {
        return name();
    }

    public static Type fromValue(String v) {
        return valueOf(v);
    }

}
