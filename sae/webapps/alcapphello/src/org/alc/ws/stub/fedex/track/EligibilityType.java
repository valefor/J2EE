
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EligibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EligibilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ELIGIBLE"/>
 *     &lt;enumeration value="INELIGIBLE"/>
 *     &lt;enumeration value="POSSIBLY_ELIGIBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EligibilityType")
@XmlEnum
public enum EligibilityType {

    ELIGIBLE,
    INELIGIBLE,
    POSSIBLY_ELIGIBLE;

    public String value() {
        return name();
    }

    public static EligibilityType fromValue(String v) {
        return valueOf(v);
    }

}
