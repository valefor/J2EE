
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackReturnLabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackReturnLabelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="PRINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackReturnLabelType")
@XmlEnum
public enum TrackReturnLabelType {

    EMAIL,
    PRINT;

    public String value() {
        return name();
    }

    public static TrackReturnLabelType fromValue(String v) {
        return valueOf(v);
    }

}
