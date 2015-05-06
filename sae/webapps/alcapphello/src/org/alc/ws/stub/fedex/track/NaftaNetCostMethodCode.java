
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaftaNetCostMethodCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NaftaNetCostMethodCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="NO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NaftaNetCostMethodCode")
@XmlEnum
public enum NaftaNetCostMethodCode {

    NC,
    NO;

    public String value() {
        return name();
    }

    public static NaftaNetCostMethodCode fromValue(String v) {
        return valueOf(v);
    }

}
