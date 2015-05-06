
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialInstructionsStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialInstructionsStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="DENIED"/>
 *     &lt;enumeration value="HELD"/>
 *     &lt;enumeration value="MODIFIED"/>
 *     &lt;enumeration value="RELINQUISHED"/>
 *     &lt;enumeration value="REQUESTED"/>
 *     &lt;enumeration value="SET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialInstructionsStatusCode")
@XmlEnum
public enum SpecialInstructionsStatusCode {

    ACCEPTED,
    CANCELLED,
    DENIED,
    HELD,
    MODIFIED,
    RELINQUISHED,
    REQUESTED,
    SET;

    public String value() {
        return name();
    }

    public static SpecialInstructionsStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
