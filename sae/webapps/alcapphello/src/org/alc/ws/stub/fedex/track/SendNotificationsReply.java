
package org.alc.ws.stub.fedex.track;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendNotificationsReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendNotificationsReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HighestSeverity" type="{http://fedex.com/ws/track/v9}NotificationSeverityType"/>
 *         &lt;element name="Notifications" type="{http://fedex.com/ws/track/v9}Notification" maxOccurs="unbounded"/>
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/track/v9}TransactionDetail" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://fedex.com/ws/track/v9}VersionId"/>
 *         &lt;element name="DuplicateWaybill" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MoreDataAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PagingToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Packages" type="{http://fedex.com/ws/track/v9}TrackNotificationPackage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendNotificationsReply", propOrder = {
    "highestSeverity",
    "notifications",
    "transactionDetail",
    "version",
    "duplicateWaybill",
    "moreDataAvailable",
    "pagingToken",
    "packages"
})
public class SendNotificationsReply {

    @XmlElement(name = "HighestSeverity", required = true)
    protected NotificationSeverityType highestSeverity;
    @XmlElement(name = "Notifications", required = true)
    protected List<Notification> notifications;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "DuplicateWaybill")
    protected Boolean duplicateWaybill;
    @XmlElement(name = "MoreDataAvailable")
    protected Boolean moreDataAvailable;
    @XmlElement(name = "PagingToken")
    protected String pagingToken;
    @XmlElement(name = "Packages")
    protected List<TrackNotificationPackage> packages;

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
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetail }
     *     
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetail }
     *     
     */
    public void setTransactionDetail(TransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link VersionId }
     *     
     */
    public VersionId getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionId }
     *     
     */
    public void setVersion(VersionId value) {
        this.version = value;
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
     * Gets the value of the moreDataAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreDataAvailable() {
        return moreDataAvailable;
    }

    /**
     * Sets the value of the moreDataAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreDataAvailable(Boolean value) {
        this.moreDataAvailable = value;
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
     * Gets the value of the packages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackNotificationPackage }
     * 
     * 
     */
    public List<TrackNotificationPackage> getPackages() {
        if (packages == null) {
            packages = new ArrayList<TrackNotificationPackage>();
        }
        return this.packages;
    }

}
