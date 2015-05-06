
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDeliveryLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackDeliveryLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APARTMENT_OFFICE"/>
 *     &lt;enumeration value="FEDEX_LOCATION"/>
 *     &lt;enumeration value="GATE_HOUSE"/>
 *     &lt;enumeration value="GUARD_OR_SECURITY_STATION"/>
 *     &lt;enumeration value="IN_BOND_OR_CAGE"/>
 *     &lt;enumeration value="LEASING_OFFICE"/>
 *     &lt;enumeration value="MAILROOM"/>
 *     &lt;enumeration value="MAIN_OFFICE"/>
 *     &lt;enumeration value="MANAGER_OFFICE"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="PHARMACY"/>
 *     &lt;enumeration value="RECEPTIONIST_OR_FRONT_DESK"/>
 *     &lt;enumeration value="RENTAL_OFFICE"/>
 *     &lt;enumeration value="RESIDENCE"/>
 *     &lt;enumeration value="SHIPPING_RECEIVING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackDeliveryLocationType")
@XmlEnum
public enum TrackDeliveryLocationType {

    APARTMENT_OFFICE,
    FEDEX_LOCATION,
    GATE_HOUSE,
    GUARD_OR_SECURITY_STATION,
    IN_BOND_OR_CAGE,
    LEASING_OFFICE,
    MAILROOM,
    MAIN_OFFICE,
    MANAGER_OFFICE,
    OTHER,
    PHARMACY,
    RECEPTIONIST_OR_FRONT_DESK,
    RENTAL_OFFICE,
    RESIDENCE,
    SHIPPING_RECEIVING;

    public String value() {
        return name();
    }

    public static TrackDeliveryLocationType fromValue(String v) {
        return valueOf(v);
    }

}
