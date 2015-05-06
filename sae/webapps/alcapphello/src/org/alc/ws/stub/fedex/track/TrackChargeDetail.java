
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackChargeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackChargeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v9}TrackChargeDetailType" minOccurs="0"/>
 *         &lt;element name="ChargeAmount" type="{http://fedex.com/ws/track/v9}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackChargeDetail", propOrder = {
    "type",
    "chargeAmount"
})
public class TrackChargeDetail {

    @XmlElement(name = "Type")
    protected TrackChargeDetailType type;
    @XmlElement(name = "ChargeAmount")
    protected Money chargeAmount;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TrackChargeDetailType }
     *     
     */
    public TrackChargeDetailType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackChargeDetailType }
     *     
     */
    public void setType(TrackChargeDetailType value) {
        this.type = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setChargeAmount(Money value) {
        this.chargeAmount = value;
    }

}
