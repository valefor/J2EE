
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
 * The descriptive data sent by a client to track a FedEx package.
 * 
 * <p>Java class for TrackRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebAuthenticationDetail" type="{http://fedex.com/ws/track/v9}WebAuthenticationDetail"/>
 *         &lt;element name="ClientDetail" type="{http://fedex.com/ws/track/v9}ClientDetail"/>
 *         &lt;element name="TransactionDetail" type="{http://fedex.com/ws/track/v9}TransactionDetail" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://fedex.com/ws/track/v9}VersionId"/>
 *         &lt;element name="SelectionDetails" type="{http://fedex.com/ws/track/v9}TrackSelectionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionTimeOutValueInMilliseconds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="ProcessingOptions" type="{http://fedex.com/ws/track/v9}TrackRequestProcessingOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackRequest", propOrder = {
    "webAuthenticationDetail",
    "clientDetail",
    "transactionDetail",
    "version",
    "selectionDetails",
    "transactionTimeOutValueInMilliseconds",
    "processingOptions"
})
public class TrackRequest {

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail")
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected VersionId version;
    @XmlElement(name = "SelectionDetails")
    protected List<TrackSelectionDetail> selectionDetails;
    @XmlElement(name = "TransactionTimeOutValueInMilliseconds")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger transactionTimeOutValueInMilliseconds;
    @XmlElement(name = "ProcessingOptions")
    protected List<TrackRequestProcessingOptionType> processingOptions;

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
     * Gets the value of the selectionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSelectionDetail }
     * 
     * 
     */
    public List<TrackSelectionDetail> getSelectionDetails() {
        if (selectionDetails == null) {
            selectionDetails = new ArrayList<TrackSelectionDetail>();
        }
        return this.selectionDetails;
    }

    /**
     * Gets the value of the transactionTimeOutValueInMilliseconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionTimeOutValueInMilliseconds() {
        return transactionTimeOutValueInMilliseconds;
    }

    /**
     * Sets the value of the transactionTimeOutValueInMilliseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionTimeOutValueInMilliseconds(BigInteger value) {
        this.transactionTimeOutValueInMilliseconds = value;
    }

    /**
     * Gets the value of the processingOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackRequestProcessingOptionType }
     * 
     * 
     */
    public List<TrackRequestProcessingOptionType> getProcessingOptions() {
        if (processingOptions == null) {
            processingOptions = new ArrayList<TrackRequestProcessingOptionType>();
        }
        return this.processingOptions;
    }

}
