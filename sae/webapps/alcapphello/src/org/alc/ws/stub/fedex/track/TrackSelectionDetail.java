
package org.alc.ws.stub.fedex.track;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrackSelectionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackSelectionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarrierCode" type="{http://fedex.com/ws/track/v9}CarrierCodeType" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://fedex.com/ws/track/v9}OperatingCompanyType" minOccurs="0"/>
 *         &lt;element name="PackageIdentifier" type="{http://fedex.com/ws/track/v9}TrackPackageIdentifier" minOccurs="0"/>
 *         &lt;element name="TrackingNumberUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipDateRangeBegin" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ShipDateRangeEnd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ShipmentAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecureSpodAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="PagingDetail" type="{http://fedex.com/ws/track/v9}PagingDetail" minOccurs="0"/>
 *         &lt;element name="CustomerSpecifiedTimeOutValueInMilliseconds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSelectionDetail", propOrder = {
    "carrierCode",
    "operatingCompany",
    "packageIdentifier",
    "trackingNumberUniqueIdentifier",
    "shipDateRangeBegin",
    "shipDateRangeEnd",
    "shipmentAccountNumber",
    "secureSpodAccount",
    "destination",
    "pagingDetail",
    "customerSpecifiedTimeOutValueInMilliseconds"
})
public class TrackSelectionDetail {

    @XmlElement(name = "CarrierCode")
    protected CarrierCodeType carrierCode;
    @XmlElement(name = "OperatingCompany")
    protected OperatingCompanyType operatingCompany;
    @XmlElement(name = "PackageIdentifier")
    protected TrackPackageIdentifier packageIdentifier;
    @XmlElement(name = "TrackingNumberUniqueIdentifier")
    protected String trackingNumberUniqueIdentifier;
    @XmlElement(name = "ShipDateRangeBegin")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateRangeBegin;
    @XmlElement(name = "ShipDateRangeEnd")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDateRangeEnd;
    @XmlElement(name = "ShipmentAccountNumber")
    protected String shipmentAccountNumber;
    @XmlElement(name = "SecureSpodAccount")
    protected String secureSpodAccount;
    @XmlElement(name = "Destination")
    protected Address destination;
    @XmlElement(name = "PagingDetail")
    protected PagingDetail pagingDetail;
    @XmlElement(name = "CustomerSpecifiedTimeOutValueInMilliseconds")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger customerSpecifiedTimeOutValueInMilliseconds;

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
     * Gets the value of the operatingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingCompanyType }
     *     
     */
    public OperatingCompanyType getOperatingCompany() {
        return operatingCompany;
    }

    /**
     * Sets the value of the operatingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingCompanyType }
     *     
     */
    public void setOperatingCompany(OperatingCompanyType value) {
        this.operatingCompany = value;
    }

    /**
     * Gets the value of the packageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TrackPackageIdentifier }
     *     
     */
    public TrackPackageIdentifier getPackageIdentifier() {
        return packageIdentifier;
    }

    /**
     * Sets the value of the packageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackPackageIdentifier }
     *     
     */
    public void setPackageIdentifier(TrackPackageIdentifier value) {
        this.packageIdentifier = value;
    }

    /**
     * Gets the value of the trackingNumberUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumberUniqueIdentifier() {
        return trackingNumberUniqueIdentifier;
    }

    /**
     * Sets the value of the trackingNumberUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumberUniqueIdentifier(String value) {
        this.trackingNumberUniqueIdentifier = value;
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
     * Gets the value of the shipmentAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentAccountNumber() {
        return shipmentAccountNumber;
    }

    /**
     * Sets the value of the shipmentAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentAccountNumber(String value) {
        this.shipmentAccountNumber = value;
    }

    /**
     * Gets the value of the secureSpodAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureSpodAccount() {
        return secureSpodAccount;
    }

    /**
     * Sets the value of the secureSpodAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureSpodAccount(String value) {
        this.secureSpodAccount = value;
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
     * Gets the value of the pagingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PagingDetail }
     *     
     */
    public PagingDetail getPagingDetail() {
        return pagingDetail;
    }

    /**
     * Sets the value of the pagingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagingDetail }
     *     
     */
    public void setPagingDetail(PagingDetail value) {
        this.pagingDetail = value;
    }

    /**
     * Gets the value of the customerSpecifiedTimeOutValueInMilliseconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerSpecifiedTimeOutValueInMilliseconds() {
        return customerSpecifiedTimeOutValueInMilliseconds;
    }

    /**
     * Sets the value of the customerSpecifiedTimeOutValueInMilliseconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerSpecifiedTimeOutValueInMilliseconds(BigInteger value) {
        this.customerSpecifiedTimeOutValueInMilliseconds = value;
    }

}
