
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackRequestProcessingOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackRequestProcessingOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUDE_DETAILED_SCANS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackRequestProcessingOptionType")
@XmlEnum
public enum TrackRequestProcessingOptionType {

    INCLUDE_DETAILED_SCANS;

    public String value() {
        return name();
    }

    public static TrackRequestProcessingOptionType fromValue(String v) {
        return valueOf(v);
    }

}
