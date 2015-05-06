
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrackAdvanceNotificationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackAdvanceNotificationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimatedTimeOfArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://fedex.com/ws/track/v9}TrackAdvanceNotificationStatusType" minOccurs="0"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackAdvanceNotificationDetail", propOrder = {
    "estimatedTimeOfArrival",
    "reason",
    "status",
    "statusDescription",
    "statusTime"
})
public class TrackAdvanceNotificationDetail {

    @XmlElement(name = "EstimatedTimeOfArrival")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedTimeOfArrival;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "Status")
    protected TrackAdvanceNotificationStatusType status;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "StatusTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusTime;

    /**
     * Gets the value of the estimatedTimeOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }

    /**
     * Sets the value of the estimatedTimeOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedTimeOfArrival(XMLGregorianCalendar value) {
        this.estimatedTimeOfArrival = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TrackAdvanceNotificationStatusType }
     *     
     */
    public TrackAdvanceNotificationStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAdvanceNotificationStatusType }
     *     
     */
    public void setStatus(TrackAdvanceNotificationStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the statusTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusTime() {
        return statusTime;
    }

    /**
     * Sets the value of the statusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusTime(XMLGregorianCalendar value) {
        this.statusTime = value;
    }

}
