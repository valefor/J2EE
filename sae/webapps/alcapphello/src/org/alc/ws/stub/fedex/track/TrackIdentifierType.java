
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackIdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackIdentifierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BILL_OF_LADING"/>
 *     &lt;enumeration value="COD_RETURN_TRACKING_NUMBER"/>
 *     &lt;enumeration value="CUSTOMER_AUTHORIZATION_NUMBER"/>
 *     &lt;enumeration value="CUSTOMER_REFERENCE"/>
 *     &lt;enumeration value="DEPARTMENT"/>
 *     &lt;enumeration value="DOCUMENT_AIRWAY_BILL"/>
 *     &lt;enumeration value="FREE_FORM_REFERENCE"/>
 *     &lt;enumeration value="GROUND_INTERNATIONAL"/>
 *     &lt;enumeration value="GROUND_SHIPMENT_ID"/>
 *     &lt;enumeration value="GROUP_MPS"/>
 *     &lt;enumeration value="INVOICE"/>
 *     &lt;enumeration value="JOB_GLOBAL_TRACKING_NUMBER"/>
 *     &lt;enumeration value="ORDER_GLOBAL_TRACKING_NUMBER"/>
 *     &lt;enumeration value="ORDER_TO_PAY_NUMBER"/>
 *     &lt;enumeration value="OUTBOUND_LINK_TO_RETURN"/>
 *     &lt;enumeration value="PARTNER_CARRIER_NUMBER"/>
 *     &lt;enumeration value="PART_NUMBER"/>
 *     &lt;enumeration value="PURCHASE_ORDER"/>
 *     &lt;enumeration value="REROUTE_TRACKING_NUMBER"/>
 *     &lt;enumeration value="RETURNED_TO_SHIPPER_TRACKING_NUMBER"/>
 *     &lt;enumeration value="RETURN_MATERIALS_AUTHORIZATION"/>
 *     &lt;enumeration value="SHIPPER_REFERENCE"/>
 *     &lt;enumeration value="STANDARD_MPS"/>
 *     &lt;enumeration value="TRACKING_NUMBER_OR_DOORTAG"/>
 *     &lt;enumeration value="TRANSPORTATION_CONTROL_NUMBER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackIdentifierType")
@XmlEnum
public enum TrackIdentifierType {

    BILL_OF_LADING,
    COD_RETURN_TRACKING_NUMBER,
    CUSTOMER_AUTHORIZATION_NUMBER,
    CUSTOMER_REFERENCE,
    DEPARTMENT,
    DOCUMENT_AIRWAY_BILL,
    FREE_FORM_REFERENCE,
    GROUND_INTERNATIONAL,
    GROUND_SHIPMENT_ID,
    GROUP_MPS,
    INVOICE,
    JOB_GLOBAL_TRACKING_NUMBER,
    ORDER_GLOBAL_TRACKING_NUMBER,
    ORDER_TO_PAY_NUMBER,
    OUTBOUND_LINK_TO_RETURN,
    PARTNER_CARRIER_NUMBER,
    PART_NUMBER,
    PURCHASE_ORDER,
    REROUTE_TRACKING_NUMBER,
    RETURNED_TO_SHIPPER_TRACKING_NUMBER,
    RETURN_MATERIALS_AUTHORIZATION,
    SHIPPER_REFERENCE,
    STANDARD_MPS,
    TRACKING_NUMBER_OR_DOORTAG,
    TRANSPORTATION_CONTROL_NUMBER;

    public String value() {
        return name();
    }

    public static TrackIdentifierType fromValue(String v) {
        return valueOf(v);
    }

}
