
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackSpecialHandlingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackSpecialHandlingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCESSIBLE_DANGEROUS_GOODS"/>
 *     &lt;enumeration value="ADULT_SIGNATURE_OPTION"/>
 *     &lt;enumeration value="AIRBILL_AUTOMATION"/>
 *     &lt;enumeration value="AIRBILL_DELIVERY"/>
 *     &lt;enumeration value="ALCOHOL"/>
 *     &lt;enumeration value="AM_DELIVERY_GUARANTEE"/>
 *     &lt;enumeration value="APPOINTMENT_DELIVERY"/>
 *     &lt;enumeration value="BILL_RECIPIENT"/>
 *     &lt;enumeration value="BROKER_SELECT_OPTION"/>
 *     &lt;enumeration value="CALL_BEFORE_DELIVERY"/>
 *     &lt;enumeration value="CALL_TAG"/>
 *     &lt;enumeration value="CALL_TAG_DAMAGE"/>
 *     &lt;enumeration value="CHARGEABLE_CODE"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="COLLECT"/>
 *     &lt;enumeration value="CONSOLIDATION"/>
 *     &lt;enumeration value="CONSOLIDATION_SMALLS_BAG"/>
 *     &lt;enumeration value="CURRENCY"/>
 *     &lt;enumeration value="CUT_FLOWERS"/>
 *     &lt;enumeration value="DATE_CERTAIN_DELIVERY"/>
 *     &lt;enumeration value="DELIVERY_ON_INVOICE_ACCEPTANCE"/>
 *     &lt;enumeration value="DELIVERY_REATTEMPT"/>
 *     &lt;enumeration value="DELIVERY_RECEIPT"/>
 *     &lt;enumeration value="DELIVER_WEEKDAY"/>
 *     &lt;enumeration value="DIRECT_SIGNATURE_OPTION"/>
 *     &lt;enumeration value="DOMESTIC"/>
 *     &lt;enumeration value="DO_NOT_BREAK_DOWN_PALLETS"/>
 *     &lt;enumeration value="DO_NOT_STACK_PALLETS"/>
 *     &lt;enumeration value="DRY_ICE"/>
 *     &lt;enumeration value="DRY_ICE_ADDED"/>
 *     &lt;enumeration value="EAST_COAST_SPECIAL"/>
 *     &lt;enumeration value="ELECTRONIC_COD"/>
 *     &lt;enumeration value="ELECTRONIC_SIGNATURE_SERVICE"/>
 *     &lt;enumeration value="EVENING_DELIVERY"/>
 *     &lt;enumeration value="EXCLUSIVE_USE"/>
 *     &lt;enumeration value="EXTENDED_DELIVERY"/>
 *     &lt;enumeration value="EXTENDED_PICKUP"/>
 *     &lt;enumeration value="EXTRA_LABOR"/>
 *     &lt;enumeration value="EXTREME_LENGTH"/>
 *     &lt;enumeration value="FOOD"/>
 *     &lt;enumeration value="FREIGHT_ON_VALUE_CARRIER_RISK"/>
 *     &lt;enumeration value="FREIGHT_ON_VALUE_OWN_RISK"/>
 *     &lt;enumeration value="FREIGHT_TO_COLLECT"/>
 *     &lt;enumeration value="FULLY_REGULATED_DANGEROUS_GOODS"/>
 *     &lt;enumeration value="GEL_PACKS_ADDED_OR_REPLACED"/>
 *     &lt;enumeration value="GROUND_SUPPORT_FOR_SMARTPOST"/>
 *     &lt;enumeration value="GUARANTEED_FUNDS"/>
 *     &lt;enumeration value="HAZMAT"/>
 *     &lt;enumeration value="HIGH_FLOOR"/>
 *     &lt;enumeration value="HOLD_AT_LOCATION"/>
 *     &lt;enumeration value="HOLIDAY_DELIVERY"/>
 *     &lt;enumeration value="INACCESSIBLE_DANGEROUS_GOODS"/>
 *     &lt;enumeration value="INDIRECT_SIGNATURE_OPTION"/>
 *     &lt;enumeration value="INSIDE_DELIVERY"/>
 *     &lt;enumeration value="INSIDE_PICKUP"/>
 *     &lt;enumeration value="INTERNATIONAL"/>
 *     &lt;enumeration value="INTERNATIONAL_CONTROLLED_EXPORT"/>
 *     &lt;enumeration value="INTERNATIONAL_MAIL_SERVICE"/>
 *     &lt;enumeration value="INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS"/>
 *     &lt;enumeration value="LIFTGATE"/>
 *     &lt;enumeration value="LIFTGATE_DELIVERY"/>
 *     &lt;enumeration value="LIFTGATE_PICKUP"/>
 *     &lt;enumeration value="LIMITED_ACCESS_DELIVERY"/>
 *     &lt;enumeration value="LIMITED_ACCESS_PICKUP"/>
 *     &lt;enumeration value="LIMITED_QUANTITIES_DANGEROUS_GOODS"/>
 *     &lt;enumeration value="MARKING_OR_TAGGING"/>
 *     &lt;enumeration value="NET_RETURN"/>
 *     &lt;enumeration value="NON_BUSINESS_TIME"/>
 *     &lt;enumeration value="NON_STANDARD_CONTAINER"/>
 *     &lt;enumeration value="ORDER_NOTIFY"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="OTHER_REGULATED_MATERIAL_DOMESTIC"/>
 *     &lt;enumeration value="PACKAGE_RETURN_PROGRAM"/>
 *     &lt;enumeration value="PIECE_COUNT_VERIFICATION"/>
 *     &lt;enumeration value="POISON"/>
 *     &lt;enumeration value="PREPAID"/>
 *     &lt;enumeration value="PRIORITY_ALERT"/>
 *     &lt;enumeration value="PRIORITY_ALERT_PLUS"/>
 *     &lt;enumeration value="PROTECTION_FROM_FREEZING"/>
 *     &lt;enumeration value="RAIL_MODE"/>
 *     &lt;enumeration value="RECONSIGNMENT_CHARGES"/>
 *     &lt;enumeration value="REROUTE_CROSS_COUNTRY_DEFERRED"/>
 *     &lt;enumeration value="REROUTE_CROSS_COUNTRY_EXPEDITED"/>
 *     &lt;enumeration value="REROUTE_LOCAL"/>
 *     &lt;enumeration value="RESIDENTIAL_DELIVERY"/>
 *     &lt;enumeration value="RESIDENTIAL_PICKUP"/>
 *     &lt;enumeration value="RETURNS_CLEARANCE"/>
 *     &lt;enumeration value="RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED"/>
 *     &lt;enumeration value="RETURN_MANAGER"/>
 *     &lt;enumeration value="SATURDAY_DELIVERY"/>
 *     &lt;enumeration value="SHIPMENT_PLACED_IN_COLD_STORAGE"/>
 *     &lt;enumeration value="SINGLE_SHIPMENT"/>
 *     &lt;enumeration value="SMALL_QUANTITY_EXCEPTION"/>
 *     &lt;enumeration value="SORT_AND_SEGREGATE"/>
 *     &lt;enumeration value="SPECIAL_DELIVERY"/>
 *     &lt;enumeration value="SPECIAL_EQUIPMENT"/>
 *     &lt;enumeration value="STANDARD_GROUND_SERVICE"/>
 *     &lt;enumeration value="STORAGE"/>
 *     &lt;enumeration value="SUNDAY_DELIVERY"/>
 *     &lt;enumeration value="THIRD_PARTY_BILLING"/>
 *     &lt;enumeration value="THIRD_PARTY_CONSIGNEE"/>
 *     &lt;enumeration value="TOP_LOAD"/>
 *     &lt;enumeration value="WEEKEND_DELIVERY"/>
 *     &lt;enumeration value="WEEKEND_PICKUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackSpecialHandlingType")
@XmlEnum
public enum TrackSpecialHandlingType {

    ACCESSIBLE_DANGEROUS_GOODS,
    ADULT_SIGNATURE_OPTION,
    AIRBILL_AUTOMATION,
    AIRBILL_DELIVERY,
    ALCOHOL,
    AM_DELIVERY_GUARANTEE,
    APPOINTMENT_DELIVERY,
    BILL_RECIPIENT,
    BROKER_SELECT_OPTION,
    CALL_BEFORE_DELIVERY,
    CALL_TAG,
    CALL_TAG_DAMAGE,
    CHARGEABLE_CODE,
    COD,
    COLLECT,
    CONSOLIDATION,
    CONSOLIDATION_SMALLS_BAG,
    CURRENCY,
    CUT_FLOWERS,
    DATE_CERTAIN_DELIVERY,
    DELIVERY_ON_INVOICE_ACCEPTANCE,
    DELIVERY_REATTEMPT,
    DELIVERY_RECEIPT,
    DELIVER_WEEKDAY,
    DIRECT_SIGNATURE_OPTION,
    DOMESTIC,
    DO_NOT_BREAK_DOWN_PALLETS,
    DO_NOT_STACK_PALLETS,
    DRY_ICE,
    DRY_ICE_ADDED,
    EAST_COAST_SPECIAL,
    ELECTRONIC_COD,
    ELECTRONIC_SIGNATURE_SERVICE,
    EVENING_DELIVERY,
    EXCLUSIVE_USE,
    EXTENDED_DELIVERY,
    EXTENDED_PICKUP,
    EXTRA_LABOR,
    EXTREME_LENGTH,
    FOOD,
    FREIGHT_ON_VALUE_CARRIER_RISK,
    FREIGHT_ON_VALUE_OWN_RISK,
    FREIGHT_TO_COLLECT,
    FULLY_REGULATED_DANGEROUS_GOODS,
    GEL_PACKS_ADDED_OR_REPLACED,
    GROUND_SUPPORT_FOR_SMARTPOST,
    GUARANTEED_FUNDS,
    HAZMAT,
    HIGH_FLOOR,
    HOLD_AT_LOCATION,
    HOLIDAY_DELIVERY,
    INACCESSIBLE_DANGEROUS_GOODS,
    INDIRECT_SIGNATURE_OPTION,
    INSIDE_DELIVERY,
    INSIDE_PICKUP,
    INTERNATIONAL,
    INTERNATIONAL_CONTROLLED_EXPORT,
    INTERNATIONAL_MAIL_SERVICE,
    INTERNATIONAL_TRAFFIC_IN_ARMS_REGULATIONS,
    LIFTGATE,
    LIFTGATE_DELIVERY,
    LIFTGATE_PICKUP,
    LIMITED_ACCESS_DELIVERY,
    LIMITED_ACCESS_PICKUP,
    LIMITED_QUANTITIES_DANGEROUS_GOODS,
    MARKING_OR_TAGGING,
    NET_RETURN,
    NON_BUSINESS_TIME,
    NON_STANDARD_CONTAINER,
    ORDER_NOTIFY,
    OTHER,
    OTHER_REGULATED_MATERIAL_DOMESTIC,
    PACKAGE_RETURN_PROGRAM,
    PIECE_COUNT_VERIFICATION,
    POISON,
    PREPAID,
    PRIORITY_ALERT,
    PRIORITY_ALERT_PLUS,
    PROTECTION_FROM_FREEZING,
    RAIL_MODE,
    RECONSIGNMENT_CHARGES,
    REROUTE_CROSS_COUNTRY_DEFERRED,
    REROUTE_CROSS_COUNTRY_EXPEDITED,
    REROUTE_LOCAL,
    RESIDENTIAL_DELIVERY,
    RESIDENTIAL_PICKUP,
    RETURNS_CLEARANCE,
    RETURNS_CLEARANCE_SPECIAL_ROUTING_REQUIRED,
    RETURN_MANAGER,
    SATURDAY_DELIVERY,
    SHIPMENT_PLACED_IN_COLD_STORAGE,
    SINGLE_SHIPMENT,
    SMALL_QUANTITY_EXCEPTION,
    SORT_AND_SEGREGATE,
    SPECIAL_DELIVERY,
    SPECIAL_EQUIPMENT,
    STANDARD_GROUND_SERVICE,
    STORAGE,
    SUNDAY_DELIVERY,
    THIRD_PARTY_BILLING,
    THIRD_PARTY_CONSIGNEE,
    TOP_LOAD,
    WEEKEND_DELIVERY,
    WEEKEND_PICKUP;

    public String value() {
        return name();
    }

    public static TrackSpecialHandlingType fromValue(String v) {
        return valueOf(v);
    }

}
