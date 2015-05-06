
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDeliveryOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackDeliveryOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPOINTMENT"/>
 *     &lt;enumeration value="DATE_CERTAIN"/>
 *     &lt;enumeration value="ELECTRONIC_SIGNATURE_RELEASE"/>
 *     &lt;enumeration value="EVENING"/>
 *     &lt;enumeration value="REDIRECT_TO_HOLD_AT_LOCATION"/>
 *     &lt;enumeration value="REROUTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackDeliveryOptionType")
@XmlEnum
public enum TrackDeliveryOptionType {

    APPOINTMENT,
    DATE_CERTAIN,
    ELECTRONIC_SIGNATURE_RELEASE,
    EVENING,
    REDIRECT_TO_HOLD_AT_LOCATION,
    REROUTE;

    public String value() {
        return name();
    }

    public static TrackDeliveryOptionType fromValue(String v) {
        return valueOf(v);
    }

}
