
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaftaProducerDeterminationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NaftaProducerDeterminationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_1"/>
 *     &lt;enumeration value="NO_2"/>
 *     &lt;enumeration value="NO_3"/>
 *     &lt;enumeration value="YES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaftaProducerDeterminationCode")
@XmlEnum
public enum NaftaProducerDeterminationCode {

    NO_1,
    NO_2,
    NO_3,
    YES;

    public String value() {
        return name();
    }

    public static NaftaProducerDeterminationCode fromValue(String v) {
        return valueOf(v);
    }

}
