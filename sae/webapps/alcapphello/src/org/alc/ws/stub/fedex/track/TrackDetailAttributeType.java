
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackDetailAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrackDetailAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUDED_IN_WATCHLIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrackDetailAttributeType")
@XmlEnum
public enum TrackDetailAttributeType {

    INCLUDED_IN_WATCHLIST;

    public String value() {
        return name();
    }

    public static TrackDetailAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
