
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Time Range specified in local time.
 * 
 * <p>Java class for LocalTimeRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalTimeRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Begins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ends" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalTimeRange", propOrder = {
    "begins",
    "ends"
})
public class LocalTimeRange {

    @XmlElement(name = "Begins")
    protected String begins;
    @XmlElement(name = "Ends")
    protected String ends;

    /**
     * Gets the value of the begins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegins() {
        return begins;
    }

    /**
     * Sets the value of the begins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegins(String value) {
        this.begins = value;
    }

    /**
     * Gets the value of the ends property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnds() {
        return ends;
    }

    /**
     * Sets the value of the ends property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnds(String value) {
        this.ends = value;
    }

}
