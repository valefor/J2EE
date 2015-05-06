
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailNotificationRecipientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailNotificationRecipientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BROKER"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="RECIPIENT"/>
 *     &lt;enumeration value="SHIPPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailNotificationRecipientType")
@XmlEnum
public enum EMailNotificationRecipientType {

    BROKER,
    OTHER,
    RECIPIENT,
    SHIPPER;

    public String value() {
        return name();
    }

    public static EMailNotificationRecipientType fromValue(String v) {
        return valueOf(v);
    }

}
