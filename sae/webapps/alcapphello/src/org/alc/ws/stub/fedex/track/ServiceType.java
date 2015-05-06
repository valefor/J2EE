
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EUROPE_FIRST_INTERNATIONAL_PRIORITY"/>
 *     &lt;enumeration value="FEDEX_1_DAY_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_2_DAY"/>
 *     &lt;enumeration value="FEDEX_2_DAY_AM"/>
 *     &lt;enumeration value="FEDEX_2_DAY_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_3_DAY_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_CARGO_AIRPORT_TO_AIRPORT"/>
 *     &lt;enumeration value="FEDEX_CARGO_FREIGHT_FORWARDING"/>
 *     &lt;enumeration value="FEDEX_CARGO_INTERNATIONAL_EXPRESS_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_CARGO_INTERNATIONAL_PREMIUM"/>
 *     &lt;enumeration value="FEDEX_CARGO_MAIL"/>
 *     &lt;enumeration value="FEDEX_CARGO_REGISTERED_MAIL"/>
 *     &lt;enumeration value="FEDEX_CARGO_SURFACE_MAIL"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE_EXCLUSIVE_USE"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE_NETWORK"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_CHARTER_AIR"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_POINT_TO_POINT"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_SURFACE_EXPEDITE"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_SURFACE_EXPEDITE_EXCLUSIVE_USE"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_TEMP_ASSURE_AIR"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_TEMP_ASSURE_VALIDATED_AIR"/>
 *     &lt;enumeration value="FEDEX_CUSTOM_CRITICAL_WHITE_GLOVE_SERVICES"/>
 *     &lt;enumeration value="FEDEX_DISTANCE_DEFERRED"/>
 *     &lt;enumeration value="FEDEX_EXPRESS_SAVER"/>
 *     &lt;enumeration value="FEDEX_FIRST_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_FREIGHT_ECONOMY"/>
 *     &lt;enumeration value="FEDEX_FREIGHT_PRIORITY"/>
 *     &lt;enumeration value="FEDEX_GROUND"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_AFTERNOON"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_EARLY_MORNING"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_END_OF_DAY"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_FREIGHT"/>
 *     &lt;enumeration value="FEDEX_NEXT_DAY_MID_MORNING"/>
 *     &lt;enumeration value="FIRST_OVERNIGHT"/>
 *     &lt;enumeration value="GROUND_HOME_DELIVERY"/>
 *     &lt;enumeration value="INTERNATIONAL_DISTRIBUTION_FREIGHT"/>
 *     &lt;enumeration value="INTERNATIONAL_ECONOMY"/>
 *     &lt;enumeration value="INTERNATIONAL_ECONOMY_DISTRIBUTION"/>
 *     &lt;enumeration value="INTERNATIONAL_ECONOMY_FREIGHT"/>
 *     &lt;enumeration value="INTERNATIONAL_FIRST"/>
 *     &lt;enumeration value="INTERNATIONAL_PRIORITY"/>
 *     &lt;enumeration value="INTERNATIONAL_PRIORITY_DISTRIBUTION"/>
 *     &lt;enumeration value="INTERNATIONAL_PRIORITY_FREIGHT"/>
 *     &lt;enumeration value="PRIORITY_OVERNIGHT"/>
 *     &lt;enumeration value="SAME_DAY"/>
 *     &lt;enumeration value="SAME_DAY_CITY"/>
 *     &lt;enumeration value="SMART_POST"/>
 *     &lt;enumeration value="STANDARD_OVERNIGHT"/>
 *     &lt;enumeration value="TRANSBORDER_DISTRIBUTION_CONSOLIDATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceType")
@XmlEnum
public enum ServiceType {

    EUROPE_FIRST_INTERNATIONAL_PRIORITY,
    FEDEX_1_DAY_FREIGHT,
    FEDEX_2_DAY,
    FEDEX_2_DAY_AM,
    FEDEX_2_DAY_FREIGHT,
    FEDEX_3_DAY_FREIGHT,
    FEDEX_CARGO_AIRPORT_TO_AIRPORT,
    FEDEX_CARGO_FREIGHT_FORWARDING,
    FEDEX_CARGO_INTERNATIONAL_EXPRESS_FREIGHT,
    FEDEX_CARGO_INTERNATIONAL_PREMIUM,
    FEDEX_CARGO_MAIL,
    FEDEX_CARGO_REGISTERED_MAIL,
    FEDEX_CARGO_SURFACE_MAIL,
    FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE,
    FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE_EXCLUSIVE_USE,
    FEDEX_CUSTOM_CRITICAL_AIR_EXPEDITE_NETWORK,
    FEDEX_CUSTOM_CRITICAL_CHARTER_AIR,
    FEDEX_CUSTOM_CRITICAL_POINT_TO_POINT,
    FEDEX_CUSTOM_CRITICAL_SURFACE_EXPEDITE,
    FEDEX_CUSTOM_CRITICAL_SURFACE_EXPEDITE_EXCLUSIVE_USE,
    FEDEX_CUSTOM_CRITICAL_TEMP_ASSURE_AIR,
    FEDEX_CUSTOM_CRITICAL_TEMP_ASSURE_VALIDATED_AIR,
    FEDEX_CUSTOM_CRITICAL_WHITE_GLOVE_SERVICES,
    FEDEX_DISTANCE_DEFERRED,
    FEDEX_EXPRESS_SAVER,
    FEDEX_FIRST_FREIGHT,
    FEDEX_FREIGHT_ECONOMY,
    FEDEX_FREIGHT_PRIORITY,
    FEDEX_GROUND,
    FEDEX_NEXT_DAY_AFTERNOON,
    FEDEX_NEXT_DAY_EARLY_MORNING,
    FEDEX_NEXT_DAY_END_OF_DAY,
    FEDEX_NEXT_DAY_FREIGHT,
    FEDEX_NEXT_DAY_MID_MORNING,
    FIRST_OVERNIGHT,
    GROUND_HOME_DELIVERY,
    INTERNATIONAL_DISTRIBUTION_FREIGHT,
    INTERNATIONAL_ECONOMY,
    INTERNATIONAL_ECONOMY_DISTRIBUTION,
    INTERNATIONAL_ECONOMY_FREIGHT,
    INTERNATIONAL_FIRST,
    INTERNATIONAL_PRIORITY,
    INTERNATIONAL_PRIORITY_DISTRIBUTION,
    INTERNATIONAL_PRIORITY_FREIGHT,
    PRIORITY_OVERNIGHT,
    SAME_DAY,
    SAME_DAY_CITY,
    SMART_POST,
    STANDARD_OVERNIGHT,
    TRANSBORDER_DISTRIBUTION_CONSOLIDATION;

    public String value() {
        return name();
    }

    public static ServiceType fromValue(String v) {
        return valueOf(v);
    }

}
