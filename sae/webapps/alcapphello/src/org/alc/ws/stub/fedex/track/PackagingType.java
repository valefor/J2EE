
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackagingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackagingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEDEX_10KG_BOX"/>
 *     &lt;enumeration value="FEDEX_25KG_BOX"/>
 *     &lt;enumeration value="FEDEX_BOX"/>
 *     &lt;enumeration value="FEDEX_ENVELOPE"/>
 *     &lt;enumeration value="FEDEX_EXTRA_LARGE_BOX"/>
 *     &lt;enumeration value="FEDEX_LARGE_BOX"/>
 *     &lt;enumeration value="FEDEX_MEDIUM_BOX"/>
 *     &lt;enumeration value="FEDEX_PAK"/>
 *     &lt;enumeration value="FEDEX_SMALL_BOX"/>
 *     &lt;enumeration value="FEDEX_TUBE"/>
 *     &lt;enumeration value="YOUR_PACKAGING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackagingType")
@XmlEnum
public enum PackagingType {

    @XmlEnumValue("FEDEX_10KG_BOX")
    FEDEX_10_KG_BOX("FEDEX_10KG_BOX"),
    @XmlEnumValue("FEDEX_25KG_BOX")
    FEDEX_25_KG_BOX("FEDEX_25KG_BOX"),
    FEDEX_BOX("FEDEX_BOX"),
    FEDEX_ENVELOPE("FEDEX_ENVELOPE"),
    FEDEX_EXTRA_LARGE_BOX("FEDEX_EXTRA_LARGE_BOX"),
    FEDEX_LARGE_BOX("FEDEX_LARGE_BOX"),
    FEDEX_MEDIUM_BOX("FEDEX_MEDIUM_BOX"),
    FEDEX_PAK("FEDEX_PAK"),
    FEDEX_SMALL_BOX("FEDEX_SMALL_BOX"),
    FEDEX_TUBE("FEDEX_TUBE"),
    YOUR_PACKAGING("YOUR_PACKAGING");
    private final String value;

    PackagingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackagingType fromValue(String v) {
        for (PackagingType c: PackagingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
