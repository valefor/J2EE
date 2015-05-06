
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMailNotificationFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMailNotificationFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="WIRELESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMailNotificationFormatType")
@XmlEnum
public enum EMailNotificationFormatType {

    HTML,
    TEXT,
    WIRELESS;

    public String value() {
        return name();
    }

    public static EMailNotificationFormatType fromValue(String v) {
        return valueOf(v);
    }

}
