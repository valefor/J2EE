
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrivalLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArrivalLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AIRPORT"/>
 *     &lt;enumeration value="CUSTOMER"/>
 *     &lt;enumeration value="CUSTOMS_BROKER"/>
 *     &lt;enumeration value="DELIVERY_LOCATION"/>
 *     &lt;enumeration value="DESTINATION_AIRPORT"/>
 *     &lt;enumeration value="DESTINATION_FEDEX_FACILITY"/>
 *     &lt;enumeration value="DROP_BOX"/>
 *     &lt;enumeration value="ENROUTE"/>
 *     &lt;enumeration value="FEDEX_FACILITY"/>
 *     &lt;enumeration value="FEDEX_OFFICE_LOCATION"/>
 *     &lt;enumeration value="INTERLINE_CARRIER"/>
 *     &lt;enumeration value="NON_FEDEX_FACILITY"/>
 *     &lt;enumeration value="ORIGIN_AIRPORT"/>
 *     &lt;enumeration value="ORIGIN_FEDEX_FACILITY"/>
 *     &lt;enumeration value="PICKUP_LOCATION"/>
 *     &lt;enumeration value="PLANE"/>
 *     &lt;enumeration value="PORT_OF_ENTRY"/>
 *     &lt;enumeration value="SHIP_AND_GET_LOCATION"/>
 *     &lt;enumeration value="SORT_FACILITY"/>
 *     &lt;enumeration value="TURNPOINT"/>
 *     &lt;enumeration value="VEHICLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ArrivalLocationType")
@XmlEnum
public enum ArrivalLocationType {

    AIRPORT,
    CUSTOMER,
    CUSTOMS_BROKER,
    DELIVERY_LOCATION,
    DESTINATION_AIRPORT,
    DESTINATION_FEDEX_FACILITY,
    DROP_BOX,
    ENROUTE,
    FEDEX_FACILITY,
    FEDEX_OFFICE_LOCATION,
    INTERLINE_CARRIER,
    NON_FEDEX_FACILITY,
    ORIGIN_AIRPORT,
    ORIGIN_FEDEX_FACILITY,
    PICKUP_LOCATION,
    PLANE,
    PORT_OF_ENTRY,
    SHIP_AND_GET_LOCATION,
    SORT_FACILITY,
    TURNPOINT,
    VEHICLE;

    public String value() {
        return name();
    }

    public static ArrivalLocationType fromValue(String v) {
        return valueOf(v);
    }

}
