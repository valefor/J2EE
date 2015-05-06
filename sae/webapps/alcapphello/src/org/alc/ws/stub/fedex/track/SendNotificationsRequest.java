
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SendNotificationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendNotificationsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/track/v9}WebAuthenticationDetail"/>
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/track/v9}ClientDetail"/>
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/track/v9}TransactionDetail" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://fedex.com/ws/track/v9}VersionId"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MultiPiece" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PagingToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumberUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipDateRangeBegin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ShipDateRangeEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SenderEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderContactName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NotificationDetail" type="{http://fedex.com/ws/track/v9}EMailNotificationDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendNotificationsRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "trackingNumber",
    "multiPiece",
    "pagingToken",
    "trackingNumberUniqueId",
    "shipDateRangeBegin",
    "shipDateRangeEnd",
    "senderEMailAddress",
    "senderContactName",
    "notificationDetail"
})
public class SendNotificationsRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "MultiPiece")
    protected Boolean multiPiece;
    @XmlElement(name = "PagingToken")
    protected String pagingToken;
    @XmlElement(name = "TrackingNumberUniqueId")
    protected String trackingNumberUniqueId;
    @XmlElement(name = "ShipDateRangeBegin")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateRangeBegin;
    @XmlElement(name = "ShipDateRangeEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateRangeEnd;
    @XmlElement(name = "SenderEMailAddress")
    protected String senderEMailAddress;
    @XmlElement(name = "SenderContactName", required = true)
    protected String senderContactName;
    @XmlElement(name = "NotificationDetail", required = true)
    protected EMailNotificationDetail notificationDetail;

    /**
     * Gets the value of the webAuthenticationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }

    /**
     * Sets the value of the webAuthenticationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebAuthenticationDetail }
     *     
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail value) {
        this.webAuthenticationDetail = value;
    }

    /**
     * Gets the value of the clientDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ClientDetail }
     *     
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }

    /**
     * Sets the value of the clientDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientDetail }
     *     
     */
    public void setClientDetail(ClientDetail value) {
        this.clientDetail = value;
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
     * Gets the value of the multiPiece property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiPiece() {
        return multiPiece;
    }

    /**
     * Sets the value of the multiPiece property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiPiece(Boolean value) {
        this.multiPiece = value;
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
     * Gets the value of the trackingNumberUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumberUniqueId() {
        return trackingNumberUniqueId;
    }

    /**
     * Sets the value of the trackingNumberUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumberUniqueId(String value) {
        this.trackingNumberUniqueId = value;
    }

    /**
     * Gets the value of the shipDateRangeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDateRangeBegin() {
        return shipDateRangeBegin;
    }

    /**
     * Sets the value of the shipDateRangeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDateRangeBegin(XMLGregorianCalendar value) {
        this.shipDateRangeBegin = value;
    }

    /**
     * Gets the value of the shipDateRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDateRangeEnd() {
        return shipDateRangeEnd;
    }

    /**
     * Sets the value of the shipDateRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDateRangeEnd(XMLGregorianCalendar value) {
        this.shipDateRangeEnd = value;
    }

    /**
     * Gets the value of the senderEMailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderEMailAddress() {
        return senderEMailAddress;
    }

    /**
     * Sets the value of the senderEMailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderEMailAddress(String value) {
        this.senderEMailAddress = value;
    }

    /**
     * Gets the value of the senderContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderContactName() {
        return senderContactName;
    }

    /**
     * Sets the value of the senderContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderContactName(String value) {
        this.senderContactName = value;
    }

    /**
     * Gets the value of the notificationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EMailNotificationDetail }
     *     
     */
    public EMailNotificationDetail getNotificationDetail() {
        return notificationDetail;
    }

    /**
     * Sets the value of the notificationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMailNotificationDetail }
     *     
     */
    public void setNotificationDetail(EMailNotificationDetail value) {
        this.notificationDetail = value;
    }

}
