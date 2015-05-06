
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackSpecialHandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackSpecialHandling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v9}TrackSpecialHandlingType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://fedex.com/ws/track/v9}TrackPaymentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSpecialHandling", propOrder = {
    "type",
    "description",
    "paymentType"
})
public class TrackSpecialHandling {

    @XmlElement(name = "Type")
    protected TrackSpecialHandlingType type;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PaymentType")
    protected TrackPaymentType paymentType;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TrackSpecialHandlingType }
     *     
     */
    public TrackSpecialHandlingType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackSpecialHandlingType }
     *     
     */
    public void setType(TrackSpecialHandlingType value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link TrackPaymentType }
     *     
     */
    public TrackPaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackPaymentType }
     *     
     */
    public void setPaymentType(TrackPaymentType value) {
        this.paymentType = value;
    }

}
