
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PieceCountLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PieceCountLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESTINATION"/>
 *     &lt;enumeration value="ORIGIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PieceCountLocationType")
@XmlEnum
public enum PieceCountLocationType {

    DESTINATION,
    ORIGIN;

    public String value() {
        return name();
    }

    public static PieceCountLocationType fromValue(String v) {
        return valueOf(v);
    }

}
