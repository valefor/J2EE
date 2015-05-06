
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * FedEx scanning information about a package.
 * 
 * <p>Java class for TrackEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusExceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusExceptionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="StationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArrivalLocation" type="{http://fedex.com/ws/track/v9}ArrivalLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackEvent", propOrder = {
    "timestamp",
    "eventType",
    "eventDescription",
    "statusExceptionCode",
    "statusExceptionDescription",
    "address",
    "stationId",
    "arrivalLocation"
})
public class TrackEvent {

    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "EventDescription")
    protected String eventDescription;
    @XmlElement(name = "StatusExceptionCode")
    protected String statusExceptionCode;
    @XmlElement(name = "StatusExceptionDescription")
    protected String statusExceptionDescription;
    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "StationId")
    protected String stationId;
    @XmlElement(name = "ArrivalLocation")
    protected ArrivalLocationType arrivalLocation;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Sets the value of the eventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDescription(String value) {
        this.eventDescription = value;
    }

    /**
     * Gets the value of the statusExceptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusExceptionCode() {
        return statusExceptionCode;
    }

    /**
     * Sets the value of the statusExceptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusExceptionCode(String value) {
        this.statusExceptionCode = value;
    }

    /**
     * Gets the value of the statusExceptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusExceptionDescription() {
        return statusExceptionDescription;
    }

    /**
     * Sets the value of the statusExceptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusExceptionDescription(String value) {
        this.statusExceptionDescription = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the stationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * Sets the value of the stationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationId(String value) {
        this.stationId = value;
    }

    /**
     * Gets the value of the arrivalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalLocationType }
     *     
     */
    public ArrivalLocationType getArrivalLocation() {
        return arrivalLocation;
    }

    /**
     * Sets the value of the arrivalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalLocationType }
     *     
     */
    public void setArrivalLocation(ArrivalLocationType value) {
        this.arrivalLocation = value;
    }

}
