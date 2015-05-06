
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrackSpecialInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackSpecialInstruction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryOption" type="{http://fedex.com/ws/track/v9}TrackDeliveryOptionType" minOccurs="0"/>
 *         &lt;element name="StatusDetail" type="{http://fedex.com/ws/track/v9}SpecialInstructionStatusDetail" minOccurs="0"/>
 *         &lt;element name="OriginalEstimatedDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginalRequestTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestedAppointmentTime" type="{http://fedex.com/ws/track/v9}AppointmentDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSpecialInstruction", propOrder = {
    "description",
    "deliveryOption",
    "statusDetail",
    "originalEstimatedDeliveryTimestamp",
    "originalRequestTime",
    "requestedAppointmentTime"
})
public class TrackSpecialInstruction {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DeliveryOption")
    protected TrackDeliveryOptionType deliveryOption;
    @XmlElement(name = "StatusDetail")
    protected SpecialInstructionStatusDetail statusDetail;
    @XmlElement(name = "OriginalEstimatedDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalEstimatedDeliveryTimestamp;
    @XmlElement(name = "OriginalRequestTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalRequestTime;
    @XmlElement(name = "RequestedAppointmentTime")
    protected AppointmentDetail requestedAppointmentTime;

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
     * Gets the value of the deliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link TrackDeliveryOptionType }
     *     
     */
    public TrackDeliveryOptionType getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Sets the value of the deliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackDeliveryOptionType }
     *     
     */
    public void setDeliveryOption(TrackDeliveryOptionType value) {
        this.deliveryOption = value;
    }

    /**
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialInstructionStatusDetail }
     *     
     */
    public SpecialInstructionStatusDetail getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialInstructionStatusDetail }
     *     
     */
    public void setStatusDetail(SpecialInstructionStatusDetail value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the originalEstimatedDeliveryTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalEstimatedDeliveryTimestamp() {
        return originalEstimatedDeliveryTimestamp;
    }

    /**
     * Sets the value of the originalEstimatedDeliveryTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalEstimatedDeliveryTimestamp(XMLGregorianCalendar value) {
        this.originalEstimatedDeliveryTimestamp = value;
    }

    /**
     * Gets the value of the originalRequestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalRequestTime() {
        return originalRequestTime;
    }

    /**
     * Sets the value of the originalRequestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalRequestTime(XMLGregorianCalendar value) {
        this.originalRequestTime = value;
    }

    /**
     * Gets the value of the requestedAppointmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentDetail }
     *     
     */
    public AppointmentDetail getRequestedAppointmentTime() {
        return requestedAppointmentTime;
    }

    /**
     * Sets the value of the requestedAppointmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentDetail }
     *     
     */
    public void setRequestedAppointmentTime(AppointmentDetail value) {
        this.requestedAppointmentTime = value;
    }

}
