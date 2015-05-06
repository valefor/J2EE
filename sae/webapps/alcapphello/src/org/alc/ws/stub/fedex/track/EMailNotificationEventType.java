
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailNotificationEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailNotificationEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ON_DELIVERY"/>
 *     &lt;enumeration value="ON_EXCEPTION"/>
 *     &lt;enumeration value="ON_SHIPMENT"/>
 *     &lt;enumeration value="ON_TENDER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailNotificationEventType")
@XmlEnum
public enum EMailNotificationEventType {

    ON_DELIVERY,
    ON_EXCEPTION,
    ON_SHIPMENT,
    ON_TENDER;

    public String value() {
        return name();
    }

    public static EMailNotificationEventType fromValue(String v) {
        return valueOf(v);
    }

}
