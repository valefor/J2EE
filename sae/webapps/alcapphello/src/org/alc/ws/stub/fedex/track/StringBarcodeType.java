
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StringBarcodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StringBarcodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="ASTRA"/>
 *     &lt;enumeration value="FEDEX_1D"/>
 *     &lt;enumeration value="GROUND"/>
 *     &lt;enumeration value="POSTAL"/>
 *     &lt;enumeration value="USPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StringBarcodeType")
@XmlEnum
public enum StringBarcodeType {

    ADDRESS("ADDRESS"),
    ASTRA("ASTRA"),
    @XmlEnumValue("FEDEX_1D")
    FEDEX_1_D("FEDEX_1D"),
    GROUND("GROUND"),
    POSTAL("POSTAL"),
    USPS("USPS");
    private final String value;

    StringBarcodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StringBarcodeType fromValue(String v) {
        for (StringBarcodeType c: StringBarcodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
