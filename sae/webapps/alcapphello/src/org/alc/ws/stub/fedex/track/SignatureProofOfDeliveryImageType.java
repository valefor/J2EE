
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignatureProofOfDeliveryImageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureProofOfDeliveryImageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="PNG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureProofOfDeliveryImageType")
@XmlEnum
public enum SignatureProofOfDeliveryImageType {

    PDF,
    PNG;

    public String value() {
        return name();
    }

    public static SignatureProofOfDeliveryImageType fromValue(String v) {
        return valueOf(v);
    }

}
