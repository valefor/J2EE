
package org.alc.ws.stub.fedex.track;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrackNotificationPackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackNotificationPackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumberUniqueIdentifiers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://fedex.com/ws/track/v9}CarrierCodeType" minOccurs="0"/>
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="RecipientDetails" type="{http://fedex.com/ws/track/v9}TrackNotificationRecipientDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackNotificationPackage", propOrder = {
    "trackingNumber",
    "trackingNumberUniqueIdentifiers",
    "carrierCode",
    "shipDate",
    "destination",
    "recipientDetails"
})
public class TrackNotificationPackage {

    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "TrackingNumberUniqueIdentifiers")
    protected String trackingNumberUniqueIdentifiers;
    @XmlElement(name = "CarrierCode")
    protected CarrierCodeType carrierCode;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "Destination")
    protected Address destination;
    @XmlElement(name = "RecipientDetails")
    protected List<TrackNotificationRecipientDetail> recipientDetails;

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the trackingNumberUniqueIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumberUniqueIdentifiers() {
        return trackingNumberUniqueIdentifiers;
    }

    /**
     * Sets the value of the trackingNumberUniqueIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumberUniqueIdentifiers(String value) {
        this.trackingNumberUniqueIdentifiers = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierCodeType }
     *     
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierCodeType }
     *     
     */
    public void setCarrierCode(CarrierCodeType value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestination(Address value) {
        this.destination = value;
    }

    /**
     * Gets the value of the recipientDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackNotificationRecipientDetail }
     * 
     * 
     */
    public List<TrackNotificationRecipientDetail> getRecipientDetails() {
        if (recipientDetails == null) {
            recipientDetails = new ArrayList<TrackNotificationRecipientDetail>();
        }
        return this.recipientDetails;
    }

}
