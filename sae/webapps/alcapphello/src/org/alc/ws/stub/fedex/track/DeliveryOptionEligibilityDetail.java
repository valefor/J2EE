
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details about the eligibility for a delivery option.
 * 
 * <p>Java class for DeliveryOptionEligibilityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryOptionEligibilityDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Option" type="{http://fedex.com/ws/track/v9}DeliveryOptionType" minOccurs="0"/>
 *         &lt;element name="Eligibility" type="{http://fedex.com/ws/track/v9}EligibilityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryOptionEligibilityDetail", propOrder = {
    "option",
    "eligibility"
})
public class DeliveryOptionEligibilityDetail {

    @XmlElement(name = "Option")
    protected DeliveryOptionType option;
    @XmlElement(name = "Eligibility")
    protected EligibilityType eligibility;

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOptionType }
     *     
     */
    public DeliveryOptionType getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOptionType }
     *     
     */
    public void setOption(DeliveryOptionType value) {
        this.option = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityType }
     *     
     */
    public EligibilityType getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityType }
     *     
     */
    public void setEligibility(EligibilityType value) {
        this.eligibility = value;
    }

}
