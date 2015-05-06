
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightUnits.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeightUnits">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="LB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeightUnits")
@XmlEnum
public enum WeightUnits {

    KG,
    LB;

    public String value() {
        return name();
    }

    public static WeightUnits fromValue(String v) {
        return valueOf(v);
    }

}
