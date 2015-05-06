
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackChargeDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackChargeDetailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ORIGINAL_CHARGES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackChargeDetailType")
@XmlEnum
public enum TrackChargeDetailType {

    ORIGINAL_CHARGES;

    public String value() {
        return name();
    }

    public static TrackChargeDetailType fromValue(String v) {
        return valueOf(v);
    }

}
