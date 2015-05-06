
package org.alc.ws.stub.fedex.track;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletedTrackDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedTrackDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HighestSeverity" type="{http://fedex.com/ws/track/v9}NotificationSeverityType" minOccurs="0"/>
 *         &lt;element name="Notifications" type="{http://fedex.com/ws/track/v9}Notification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DuplicateWaybill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MoreData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PagingToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackDetailsCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TrackDetails" type="{http://fedex.com/ws/track/v9}TrackDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedTrackDetail", propOrder = {
    "highestSeverity",
    "notifications",
    "duplicateWaybill",
    "moreData",
    "pagingToken",
    "trackDetailsCount",
    "trackDetails"
})
public class CompletedTrackDetail {

    @XmlElement(name = "HighestSeverity")
    protected NotificationSeverityType highestSeverity;
    @XmlElement(name = "Notifications")
    protected List<Notification> notifications;
    @XmlElement(name = "DuplicateWaybill")
    protected Boolean duplicateWaybill;
    @XmlElement(name = "MoreData")
    protected Boolean moreData;
    @XmlElement(name = "PagingToken")
    protected String pagingToken;
    @XmlElement(name = "TrackDetailsCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger trackDetailsCount;
    @XmlElement(name = "TrackDetails")
    protected List<TrackDetail> trackDetails;

    /**
     * Gets the value of the highestSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSeverityType }
     *     
     */
    public NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }

    /**
     * Sets the value of the highestSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSeverityType }
     *     
     */
    public void setHighestSeverity(NotificationSeverityType value) {
        this.highestSeverity = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notification }
     * 
     * 
     */
    public List<Notification> getNotifications() {
        if (notifications == null) {
            notifications = new ArrayList<Notification>();
        }
        return this.notifications;
    }

    /**
     * Gets the value of the duplicateWaybill property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateWaybill() {
        return duplicateWaybill;
    }

    /**
     * Sets the value of the duplicateWaybill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateWaybill(Boolean value) {
        this.duplicateWaybill = value;
    }

    /**
     * Gets the value of the moreData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreData() {
        return moreData;
    }

    /**
     * Sets the value of the moreData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreData(Boolean value) {
        this.moreData = value;
    }

    /**
     * Gets the value of the pagingToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagingToken() {
        return pagingToken;
    }

    /**
     * Sets the value of the pagingToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagingToken(String value) {
        this.pagingToken = value;
    }

    /**
     * Gets the value of the trackDetailsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrackDetailsCount() {
        return trackDetailsCount;
    }

    /**
     * Sets the value of the trackDetailsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrackDetailsCount(BigInteger value) {
        this.trackDetailsCount = value;
    }

    /**
     * Gets the value of the trackDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackDetail }
     * 
     * 
     */
    public List<TrackDetail> getTrackDetails() {
        if (trackDetails == null) {
            trackDetails = new ArrayList<TrackDetail>();
        }
        return this.trackDetails;
    }

}
