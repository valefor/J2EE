
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * FedEx Signature Proof Of Delivery Fax request.
 * 
 * <p>Java class for SignatureProofOfDeliveryFaxRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatureProofOfDeliveryFaxRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/track/v9}WebAuthenticationDetail"/>
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/track/v9}ClientDetail"/>
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/track/v9}TransactionDetail" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://fedex.com/ws/track/v9}VersionId"/>
 *         &lt;element name="QualifiedTrackingNumber" type="{http://fedex.com/ws/track/v9}QualifiedTrackingNumber" minOccurs="0"/>
 *         &lt;element name="AdditionalComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaxSender" type="{http://fedex.com/ws/track/v9}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="FaxRecipient" type="{http://fedex.com/ws/track/v9}ContactAndAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureProofOfDeliveryFaxRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "qualifiedTrackingNumber",
    "additionalComments",
    "faxSender",
    "faxRecipient"
})
public class SignatureProofOfDeliveryFaxRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "QualifiedTrackingNumber")
    protected QualifiedTrackingNumber qualifiedTrackingNumber;
    @XmlElement(name = "AdditionalComments")
    protected String additionalComments;
    @XmlElement(name = "FaxSender")
    protected ContactAndAddress faxSender;
    @XmlElement(name = "FaxRecipient")
    protected ContactAndAddress faxRecipient;

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
     * Gets the value of the qualifiedTrackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedTrackingNumber }
     *     
     */
    public QualifiedTrackingNumber getQualifiedTrackingNumber() {
        return qualifiedTrackingNumber;
    }

    /**
     * Sets the value of the qualifiedTrackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedTrackingNumber }
     *     
     */
    public void setQualifiedTrackingNumber(QualifiedTrackingNumber value) {
        this.qualifiedTrackingNumber = value;
    }

    /**
     * Gets the value of the additionalComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalComments() {
        return additionalComments;
    }

    /**
     * Sets the value of the additionalComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalComments(String value) {
        this.additionalComments = value;
    }

    /**
     * Gets the value of the faxSender property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getFaxSender() {
        return faxSender;
    }

    /**
     * Sets the value of the faxSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setFaxSender(ContactAndAddress value) {
        this.faxSender = value;
    }

    /**
     * Gets the value of the faxRecipient property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getFaxRecipient() {
        return faxRecipient;
    }

    /**
     * Sets the value of the faxRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setFaxRecipient(ContactAndAddress value) {
        this.faxRecipient = value;
    }

}
