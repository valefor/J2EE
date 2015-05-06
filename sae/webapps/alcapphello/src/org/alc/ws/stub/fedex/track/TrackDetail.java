
package org.alc.ws.stub.fedex.track;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Detailed tracking information about a particular package.
 * 
 * <p>Java class for TrackDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notification" type="{http://fedex.com/ws/track/v9}Notification" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Barcode" type="{http://fedex.com/ws/track/v9}StringBarcode" minOccurs="0"/>
 *         &lt;element name="TrackingNumberUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDetail" type="{http://fedex.com/ws/track/v9}TrackStatusDetail" minOccurs="0"/>
 *         &lt;element name="CustomerExceptionRequests" type="{http://fedex.com/ws/track/v9}CustomerExceptionRequestDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Reconciliation" type="{http://fedex.com/ws/track/v9}TrackReconciliation" minOccurs="0"/>
 *         &lt;element name="ServiceCommitMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationServiceArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationServiceAreaDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarrierCode" type="{http://fedex.com/ws/track/v9}CarrierCodeType" minOccurs="0"/>
 *         &lt;element name="OperatingCompany" type="{http://fedex.com/ws/track/v9}OperatingCompanyType" minOccurs="0"/>
 *         &lt;element name="OperatingCompanyOrCarrierDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CartageAgentCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductionLocationContactAndAddress" type="{http://fedex.com/ws/track/v9}ContactAndAddress" minOccurs="0"/>
 *         &lt;element name="OtherIdentifiers" type="{http://fedex.com/ws/track/v9}TrackOtherIdentifierDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://fedex.com/ws/track/v9}TrackServiceDescriptionDetail" minOccurs="0"/>
 *         &lt;element name="PackageWeight" type="{http://fedex.com/ws/track/v9}Weight" minOccurs="0"/>
 *         &lt;element name="PackageDimensions" type="{http://fedex.com/ws/track/v9}Dimensions" minOccurs="0"/>
 *         &lt;element name="PackageDimensionalWeight" type="{http://fedex.com/ws/track/v9}Weight" minOccurs="0"/>
 *         &lt;element name="ShipmentWeight" type="{http://fedex.com/ws/track/v9}Weight" minOccurs="0"/>
 *         &lt;element name="Packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackagingType" type="{http://fedex.com/ws/track/v9}PackagingType" minOccurs="0"/>
 *         &lt;element name="PackageSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="PackageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Charges" type="{http://fedex.com/ws/track/v9}TrackChargeDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://fedex.com/ws/track/v9}TrackDetailAttributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipmentContents" type="{http://fedex.com/ws/track/v9}ContentRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PackageContents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClearanceLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commodities" type="{http://fedex.com/ws/track/v9}Commodity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReturnDetail" type="{http://fedex.com/ws/track/v9}TrackReturnDetail" minOccurs="0"/>
 *         &lt;element name="CustomsOptionDetails" type="{http://fedex.com/ws/track/v9}CustomsOptionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdvanceNotificationDetail" type="{http://fedex.com/ws/track/v9}TrackAdvanceNotificationDetail" minOccurs="0"/>
 *         &lt;element name="SpecialHandlings" type="{http://fedex.com/ws/track/v9}TrackSpecialHandling" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Shipper" type="{http://fedex.com/ws/track/v9}Contact" minOccurs="0"/>
 *         &lt;element name="PossessionStatus" type="{http://fedex.com/ws/track/v9}TrackPossessionStatusType" minOccurs="0"/>
 *         &lt;element name="ShipperAddress" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="OriginLocationAddress" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="OriginStationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedPickupTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ShipTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TotalTransitDistance" type="{http://fedex.com/ws/track/v9}Distance" minOccurs="0"/>
 *         &lt;element name="DistanceToDestination" type="{http://fedex.com/ws/track/v9}Distance" minOccurs="0"/>
 *         &lt;element name="SpecialInstructions" type="{http://fedex.com/ws/track/v9}TrackSpecialInstruction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Recipient" type="{http://fedex.com/ws/track/v9}Contact" minOccurs="0"/>
 *         &lt;element name="LastUpdatedDestinationAddress" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="DestinationAddress" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="HoldAtLocationContact" type="{http://fedex.com/ws/track/v9}Contact" minOccurs="0"/>
 *         &lt;element name="HoldAtLocationAddress" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="DestinationStationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationLocationAddress" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="DestinationLocationType" type="{http://fedex.com/ws/track/v9}FedExLocationType" minOccurs="0"/>
 *         &lt;element name="DestinationLocationTimeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommitmentTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="AppointmentDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ActualDeliveryAddress" type="{http://fedex.com/ws/track/v9}Address" minOccurs="0"/>
 *         &lt;element name="OfficeOrderDeliveryMethod" type="{http://fedex.com/ws/track/v9}OfficeOrderDeliveryMethodType" minOccurs="0"/>
 *         &lt;element name="DeliveryLocationType" type="{http://fedex.com/ws/track/v9}TrackDeliveryLocationType" minOccurs="0"/>
 *         &lt;element name="DeliveryLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryAttempts" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="DeliverySignatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PieceCountVerificationDetails" type="{http://fedex.com/ws/track/v9}PieceCountVerificationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalUniqueAddressCountInConsolidation" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="AvailableImages" type="{http://fedex.com/ws/track/v9}AvailableImageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://fedex.com/ws/track/v9}SignatureImageDetail" minOccurs="0"/>
 *         &lt;element name="NotificationEventsAvailable" type="{http://fedex.com/ws/track/v9}EMailNotificationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitShipmentParts" type="{http://fedex.com/ws/track/v9}TrackSplitShipmentPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeliveryOptionEligibilityDetails" type="{http://fedex.com/ws/track/v9}DeliveryOptionEligibilityDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Events" type="{http://fedex.com/ws/track/v9}TrackEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackDetail", propOrder = {
    "notification",
    "trackingNumber",
    "barcode",
    "trackingNumberUniqueIdentifier",
    "statusDetail",
    "customerExceptionRequests",
    "reconciliation",
    "serviceCommitMessage",
    "destinationServiceArea",
    "destinationServiceAreaDescription",
    "carrierCode",
    "operatingCompany",
    "operatingCompanyOrCarrierDescription",
    "cartageAgentCompanyName",
    "productionLocationContactAndAddress",
    "otherIdentifiers",
    "formId",
    "service",
    "packageWeight",
    "packageDimensions",
    "packageDimensionalWeight",
    "shipmentWeight",
    "packaging",
    "packagingType",
    "packageSequenceNumber",
    "packageCount",
    "charges",
    "nickName",
    "notes",
    "attributes",
    "shipmentContents",
    "packageContents",
    "clearanceLocationCode",
    "commodities",
    "returnDetail",
    "customsOptionDetails",
    "advanceNotificationDetail",
    "specialHandlings",
    "shipper",
    "possessionStatus",
    "shipperAddress",
    "originLocationAddress",
    "originStationId",
    "estimatedPickupTimestamp",
    "shipTimestamp",
    "totalTransitDistance",
    "distanceToDestination",
    "specialInstructions",
    "recipient",
    "lastUpdatedDestinationAddress",
    "destinationAddress",
    "holdAtLocationContact",
    "holdAtLocationAddress",
    "destinationStationId",
    "destinationLocationAddress",
    "destinationLocationType",
    "destinationLocationTimeZoneOffset",
    "commitmentTimestamp",
    "appointmentDeliveryTimestamp",
    "estimatedDeliveryTimestamp",
    "actualDeliveryTimestamp",
    "actualDeliveryAddress",
    "officeOrderDeliveryMethod",
    "deliveryLocationType",
    "deliveryLocationDescription",
    "deliveryAttempts",
    "deliverySignatureName",
    "pieceCountVerificationDetails",
    "totalUniqueAddressCountInConsolidation",
    "availableImages",
    "signature",
    "notificationEventsAvailable",
    "splitShipmentParts",
    "deliveryOptionEligibilityDetails",
    "events"
})
public class TrackDetail {

    @XmlElement(name = "Notification")
    protected Notification notification;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "Barcode")
    protected StringBarcode barcode;
    @XmlElement(name = "TrackingNumberUniqueIdentifier")
    protected String trackingNumberUniqueIdentifier;
    @XmlElement(name = "StatusDetail")
    protected TrackStatusDetail statusDetail;
    @XmlElement(name = "CustomerExceptionRequests")
    protected List<CustomerExceptionRequestDetail> customerExceptionRequests;
    @XmlElement(name = "Reconciliation")
    protected TrackReconciliation reconciliation;
    @XmlElement(name = "ServiceCommitMessage")
    protected String serviceCommitMessage;
    @XmlElement(name = "DestinationServiceArea")
    protected String destinationServiceArea;
    @XmlElement(name = "DestinationServiceAreaDescription")
    protected String destinationServiceAreaDescription;
    @XmlElement(name = "CarrierCode")
    protected CarrierCodeType carrierCode;
    @XmlElement(name = "OperatingCompany")
    protected OperatingCompanyType operatingCompany;
    @XmlElement(name = "OperatingCompanyOrCarrierDescription")
    protected String operatingCompanyOrCarrierDescription;
    @XmlElement(name = "CartageAgentCompanyName")
    protected String cartageAgentCompanyName;
    @XmlElement(name = "ProductionLocationContactAndAddress")
    protected ContactAndAddress productionLocationContactAndAddress;
    @XmlElement(name = "OtherIdentifiers")
    protected List<TrackOtherIdentifierDetail> otherIdentifiers;
    @XmlElement(name = "FormId")
    protected String formId;
    @XmlElement(name = "Service")
    protected TrackServiceDescriptionDetail service;
    @XmlElement(name = "PackageWeight")
    protected Weight packageWeight;
    @XmlElement(name = "PackageDimensions")
    protected Dimensions packageDimensions;
    @XmlElement(name = "PackageDimensionalWeight")
    protected Weight packageDimensionalWeight;
    @XmlElement(name = "ShipmentWeight")
    protected Weight shipmentWeight;
    @XmlElement(name = "Packaging")
    protected String packaging;
    @XmlElement(name = "PackagingType")
    protected PackagingType packagingType;
    @XmlElement(name = "PackageSequenceNumber")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageSequenceNumber;
    @XmlElement(name = "PackageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageCount;
    @XmlElement(name = "Charges")
    protected List<TrackChargeDetail> charges;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Attributes")
    protected List<TrackDetailAttributeType> attributes;
    @XmlElement(name = "ShipmentContents")
    protected List<ContentRecord> shipmentContents;
    @XmlElement(name = "PackageContents")
    protected List<String> packageContents;
    @XmlElement(name = "ClearanceLocationCode")
    protected String clearanceLocationCode;
    @XmlElement(name = "Commodities")
    protected List<Commodity> commodities;
    @XmlElement(name = "ReturnDetail")
    protected TrackReturnDetail returnDetail;
    @XmlElement(name = "CustomsOptionDetails")
    protected List<CustomsOptionDetail> customsOptionDetails;
    @XmlElement(name = "AdvanceNotificationDetail")
    protected TrackAdvanceNotificationDetail advanceNotificationDetail;
    @XmlElement(name = "SpecialHandlings")
    protected List<TrackSpecialHandling> specialHandlings;
    @XmlElement(name = "Shipper")
    protected Contact shipper;
    @XmlElement(name = "PossessionStatus")
    protected TrackPossessionStatusType possessionStatus;
    @XmlElement(name = "ShipperAddress")
    protected Address shipperAddress;
    @XmlElement(name = "OriginLocationAddress")
    protected Address originLocationAddress;
    @XmlElement(name = "OriginStationId")
    protected String originStationId;
    @XmlElement(name = "EstimatedPickupTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedPickupTimestamp;
    @XmlElement(name = "ShipTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipTimestamp;
    @XmlElement(name = "TotalTransitDistance")
    protected Distance totalTransitDistance;
    @XmlElement(name = "DistanceToDestination")
    protected Distance distanceToDestination;
    @XmlElement(name = "SpecialInstructions")
    protected List<TrackSpecialInstruction> specialInstructions;
    @XmlElement(name = "Recipient")
    protected Contact recipient;
    @XmlElement(name = "LastUpdatedDestinationAddress")
    protected Address lastUpdatedDestinationAddress;
    @XmlElement(name = "DestinationAddress")
    protected Address destinationAddress;
    @XmlElement(name = "HoldAtLocationContact")
    protected Contact holdAtLocationContact;
    @XmlElement(name = "HoldAtLocationAddress")
    protected Address holdAtLocationAddress;
    @XmlElement(name = "DestinationStationId")
    protected String destinationStationId;
    @XmlElement(name = "DestinationLocationAddress")
    protected Address destinationLocationAddress;
    @XmlElement(name = "DestinationLocationType")
    protected FedExLocationType destinationLocationType;
    @XmlElement(name = "DestinationLocationTimeZoneOffset")
    protected String destinationLocationTimeZoneOffset;
    @XmlElement(name = "CommitmentTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commitmentTimestamp;
    @XmlElement(name = "AppointmentDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar appointmentDeliveryTimestamp;
    @XmlElement(name = "EstimatedDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryTimestamp;
    @XmlElement(name = "ActualDeliveryTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDeliveryTimestamp;
    @XmlElement(name = "ActualDeliveryAddress")
    protected Address actualDeliveryAddress;
    @XmlElement(name = "OfficeOrderDeliveryMethod")
    protected OfficeOrderDeliveryMethodType officeOrderDeliveryMethod;
    @XmlElement(name = "DeliveryLocationType")
    protected TrackDeliveryLocationType deliveryLocationType;
    @XmlElement(name = "DeliveryLocationDescription")
    protected String deliveryLocationDescription;
    @XmlElement(name = "DeliveryAttempts")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger deliveryAttempts;
    @XmlElement(name = "DeliverySignatureName")
    protected String deliverySignatureName;
    @XmlElement(name = "PieceCountVerificationDetails")
    protected List<PieceCountVerificationDetail> pieceCountVerificationDetails;
    @XmlElement(name = "TotalUniqueAddressCountInConsolidation")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalUniqueAddressCountInConsolidation;
    @XmlElement(name = "AvailableImages")
    protected List<AvailableImageType> availableImages;
    @XmlElement(name = "Signature")
    protected SignatureImageDetail signature;
    @XmlElement(name = "NotificationEventsAvailable")
    protected List<EMailNotificationEventType> notificationEventsAvailable;
    @XmlElement(name = "SplitShipmentParts")
    protected List<TrackSplitShipmentPart> splitShipmentParts;
    @XmlElement(name = "DeliveryOptionEligibilityDetails")
    protected List<DeliveryOptionEligibilityDetail> deliveryOptionEligibilityDetails;
    @XmlElement(name = "Events")
    protected List<TrackEvent> events;

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link Notification }
     *     
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification }
     *     
     */
    public void setNotification(Notification value) {
        this.notification = value;
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
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link StringBarcode }
     *     
     */
    public StringBarcode getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringBarcode }
     *     
     */
    public void setBarcode(StringBarcode value) {
        this.barcode = value;
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
     * Gets the value of the statusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TrackStatusDetail }
     *     
     */
    public TrackStatusDetail getStatusDetail() {
        return statusDetail;
    }

    /**
     * Sets the value of the statusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackStatusDetail }
     *     
     */
    public void setStatusDetail(TrackStatusDetail value) {
        this.statusDetail = value;
    }

    /**
     * Gets the value of the customerExceptionRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerExceptionRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerExceptionRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerExceptionRequestDetail }
     * 
     * 
     */
    public List<CustomerExceptionRequestDetail> getCustomerExceptionRequests() {
        if (customerExceptionRequests == null) {
            customerExceptionRequests = new ArrayList<CustomerExceptionRequestDetail>();
        }
        return this.customerExceptionRequests;
    }

    /**
     * Gets the value of the reconciliation property.
     * 
     * @return
     *     possible object is
     *     {@link TrackReconciliation }
     *     
     */
    public TrackReconciliation getReconciliation() {
        return reconciliation;
    }

    /**
     * Sets the value of the reconciliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackReconciliation }
     *     
     */
    public void setReconciliation(TrackReconciliation value) {
        this.reconciliation = value;
    }

    /**
     * Gets the value of the serviceCommitMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCommitMessage() {
        return serviceCommitMessage;
    }

    /**
     * Sets the value of the serviceCommitMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCommitMessage(String value) {
        this.serviceCommitMessage = value;
    }

    /**
     * Gets the value of the destinationServiceArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }

    /**
     * Sets the value of the destinationServiceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationServiceArea(String value) {
        this.destinationServiceArea = value;
    }

    /**
     * Gets the value of the destinationServiceAreaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationServiceAreaDescription() {
        return destinationServiceAreaDescription;
    }

    /**
     * Sets the value of the destinationServiceAreaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationServiceAreaDescription(String value) {
        this.destinationServiceAreaDescription = value;
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
     * Gets the value of the operatingCompanyOrCarrierDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCompanyOrCarrierDescription() {
        return operatingCompanyOrCarrierDescription;
    }

    /**
     * Sets the value of the operatingCompanyOrCarrierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCompanyOrCarrierDescription(String value) {
        this.operatingCompanyOrCarrierDescription = value;
    }

    /**
     * Gets the value of the cartageAgentCompanyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartageAgentCompanyName() {
        return cartageAgentCompanyName;
    }

    /**
     * Sets the value of the cartageAgentCompanyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartageAgentCompanyName(String value) {
        this.cartageAgentCompanyName = value;
    }

    /**
     * Gets the value of the productionLocationContactAndAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAndAddress }
     *     
     */
    public ContactAndAddress getProductionLocationContactAndAddress() {
        return productionLocationContactAndAddress;
    }

    /**
     * Sets the value of the productionLocationContactAndAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAndAddress }
     *     
     */
    public void setProductionLocationContactAndAddress(ContactAndAddress value) {
        this.productionLocationContactAndAddress = value;
    }

    /**
     * Gets the value of the otherIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackOtherIdentifierDetail }
     * 
     * 
     */
    public List<TrackOtherIdentifierDetail> getOtherIdentifiers() {
        if (otherIdentifiers == null) {
            otherIdentifiers = new ArrayList<TrackOtherIdentifierDetail>();
        }
        return this.otherIdentifiers;
    }

    /**
     * Gets the value of the formId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormId() {
        return formId;
    }

    /**
     * Sets the value of the formId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormId(String value) {
        this.formId = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link TrackServiceDescriptionDetail }
     *     
     */
    public TrackServiceDescriptionDetail getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackServiceDescriptionDetail }
     *     
     */
    public void setService(TrackServiceDescriptionDetail value) {
        this.service = value;
    }

    /**
     * Gets the value of the packageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getPackageWeight() {
        return packageWeight;
    }

    /**
     * Sets the value of the packageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setPackageWeight(Weight value) {
        this.packageWeight = value;
    }

    /**
     * Gets the value of the packageDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link Dimensions }
     *     
     */
    public Dimensions getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * Sets the value of the packageDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimensions }
     *     
     */
    public void setPackageDimensions(Dimensions value) {
        this.packageDimensions = value;
    }

    /**
     * Gets the value of the packageDimensionalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getPackageDimensionalWeight() {
        return packageDimensionalWeight;
    }

    /**
     * Sets the value of the packageDimensionalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setPackageDimensionalWeight(Weight value) {
        this.packageDimensionalWeight = value;
    }

    /**
     * Gets the value of the shipmentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Weight }
     *     
     */
    public Weight getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * Sets the value of the shipmentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weight }
     *     
     */
    public void setShipmentWeight(Weight value) {
        this.shipmentWeight = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackaging(String value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the packagingType property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingType }
     *     
     */
    public PackagingType getPackagingType() {
        return packagingType;
    }

    /**
     * Sets the value of the packagingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingType }
     *     
     */
    public void setPackagingType(PackagingType value) {
        this.packagingType = value;
    }

    /**
     * Gets the value of the packageSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageSequenceNumber() {
        return packageSequenceNumber;
    }

    /**
     * Sets the value of the packageSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageSequenceNumber(BigInteger value) {
        this.packageSequenceNumber = value;
    }

    /**
     * Gets the value of the packageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageCount() {
        return packageCount;
    }

    /**
     * Sets the value of the packageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageCount(BigInteger value) {
        this.packageCount = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackChargeDetail }
     * 
     * 
     */
    public List<TrackChargeDetail> getCharges() {
        if (charges == null) {
            charges = new ArrayList<TrackChargeDetail>();
        }
        return this.charges;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackDetailAttributeType }
     * 
     * 
     */
    public List<TrackDetailAttributeType> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<TrackDetailAttributeType>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the shipmentContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentRecord }
     * 
     * 
     */
    public List<ContentRecord> getShipmentContents() {
        if (shipmentContents == null) {
            shipmentContents = new ArrayList<ContentRecord>();
        }
        return this.shipmentContents;
    }

    /**
     * Gets the value of the packageContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageContents() {
        if (packageContents == null) {
            packageContents = new ArrayList<String>();
        }
        return this.packageContents;
    }

    /**
     * Gets the value of the clearanceLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceLocationCode() {
        return clearanceLocationCode;
    }

    /**
     * Sets the value of the clearanceLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceLocationCode(String value) {
        this.clearanceLocationCode = value;
    }

    /**
     * Gets the value of the commodities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commodity }
     * 
     * 
     */
    public List<Commodity> getCommodities() {
        if (commodities == null) {
            commodities = new ArrayList<Commodity>();
        }
        return this.commodities;
    }

    /**
     * Gets the value of the returnDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TrackReturnDetail }
     *     
     */
    public TrackReturnDetail getReturnDetail() {
        return returnDetail;
    }

    /**
     * Sets the value of the returnDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackReturnDetail }
     *     
     */
    public void setReturnDetail(TrackReturnDetail value) {
        this.returnDetail = value;
    }

    /**
     * Gets the value of the customsOptionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsOptionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsOptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsOptionDetail }
     * 
     * 
     */
    public List<CustomsOptionDetail> getCustomsOptionDetails() {
        if (customsOptionDetails == null) {
            customsOptionDetails = new ArrayList<CustomsOptionDetail>();
        }
        return this.customsOptionDetails;
    }

    /**
     * Gets the value of the advanceNotificationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TrackAdvanceNotificationDetail }
     *     
     */
    public TrackAdvanceNotificationDetail getAdvanceNotificationDetail() {
        return advanceNotificationDetail;
    }

    /**
     * Sets the value of the advanceNotificationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackAdvanceNotificationDetail }
     *     
     */
    public void setAdvanceNotificationDetail(TrackAdvanceNotificationDetail value) {
        this.advanceNotificationDetail = value;
    }

    /**
     * Gets the value of the specialHandlings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSpecialHandling }
     * 
     * 
     */
    public List<TrackSpecialHandling> getSpecialHandlings() {
        if (specialHandlings == null) {
            specialHandlings = new ArrayList<TrackSpecialHandling>();
        }
        return this.specialHandlings;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setShipper(Contact value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the possessionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TrackPossessionStatusType }
     *     
     */
    public TrackPossessionStatusType getPossessionStatus() {
        return possessionStatus;
    }

    /**
     * Sets the value of the possessionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackPossessionStatusType }
     *     
     */
    public void setPossessionStatus(TrackPossessionStatusType value) {
        this.possessionStatus = value;
    }

    /**
     * Gets the value of the shipperAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getShipperAddress() {
        return shipperAddress;
    }

    /**
     * Sets the value of the shipperAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setShipperAddress(Address value) {
        this.shipperAddress = value;
    }

    /**
     * Gets the value of the originLocationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOriginLocationAddress() {
        return originLocationAddress;
    }

    /**
     * Sets the value of the originLocationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOriginLocationAddress(Address value) {
        this.originLocationAddress = value;
    }

    /**
     * Gets the value of the originStationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginStationId() {
        return originStationId;
    }

    /**
     * Sets the value of the originStationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginStationId(String value) {
        this.originStationId = value;
    }

    /**
     * Gets the value of the estimatedPickupTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedPickupTimestamp() {
        return estimatedPickupTimestamp;
    }

    /**
     * Sets the value of the estimatedPickupTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedPickupTimestamp(XMLGregorianCalendar value) {
        this.estimatedPickupTimestamp = value;
    }

    /**
     * Gets the value of the shipTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipTimestamp() {
        return shipTimestamp;
    }

    /**
     * Sets the value of the shipTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipTimestamp(XMLGregorianCalendar value) {
        this.shipTimestamp = value;
    }

    /**
     * Gets the value of the totalTransitDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getTotalTransitDistance() {
        return totalTransitDistance;
    }

    /**
     * Sets the value of the totalTransitDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setTotalTransitDistance(Distance value) {
        this.totalTransitDistance = value;
    }

    /**
     * Gets the value of the distanceToDestination property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getDistanceToDestination() {
        return distanceToDestination;
    }

    /**
     * Sets the value of the distanceToDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setDistanceToDestination(Distance value) {
        this.distanceToDestination = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSpecialInstruction }
     * 
     * 
     */
    public List<TrackSpecialInstruction> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<TrackSpecialInstruction>();
        }
        return this.specialInstructions;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setRecipient(Contact value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the lastUpdatedDestinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getLastUpdatedDestinationAddress() {
        return lastUpdatedDestinationAddress;
    }

    /**
     * Sets the value of the lastUpdatedDestinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setLastUpdatedDestinationAddress(Address value) {
        this.lastUpdatedDestinationAddress = value;
    }

    /**
     * Gets the value of the destinationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Sets the value of the destinationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestinationAddress(Address value) {
        this.destinationAddress = value;
    }

    /**
     * Gets the value of the holdAtLocationContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getHoldAtLocationContact() {
        return holdAtLocationContact;
    }

    /**
     * Sets the value of the holdAtLocationContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setHoldAtLocationContact(Contact value) {
        this.holdAtLocationContact = value;
    }

    /**
     * Gets the value of the holdAtLocationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getHoldAtLocationAddress() {
        return holdAtLocationAddress;
    }

    /**
     * Sets the value of the holdAtLocationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setHoldAtLocationAddress(Address value) {
        this.holdAtLocationAddress = value;
    }

    /**
     * Gets the value of the destinationStationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationStationId() {
        return destinationStationId;
    }

    /**
     * Sets the value of the destinationStationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationStationId(String value) {
        this.destinationStationId = value;
    }

    /**
     * Gets the value of the destinationLocationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getDestinationLocationAddress() {
        return destinationLocationAddress;
    }

    /**
     * Sets the value of the destinationLocationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setDestinationLocationAddress(Address value) {
        this.destinationLocationAddress = value;
    }

    /**
     * Gets the value of the destinationLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link FedExLocationType }
     *     
     */
    public FedExLocationType getDestinationLocationType() {
        return destinationLocationType;
    }

    /**
     * Sets the value of the destinationLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedExLocationType }
     *     
     */
    public void setDestinationLocationType(FedExLocationType value) {
        this.destinationLocationType = value;
    }

    /**
     * Gets the value of the destinationLocationTimeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocationTimeZoneOffset() {
        return destinationLocationTimeZoneOffset;
    }

    /**
     * Sets the value of the destinationLocationTimeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocationTimeZoneOffset(String value) {
        this.destinationLocationTimeZoneOffset = value;
    }

    /**
     * Gets the value of the commitmentTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommitmentTimestamp() {
        return commitmentTimestamp;
    }

    /**
     * Sets the value of the commitmentTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommitmentTimestamp(XMLGregorianCalendar value) {
        this.commitmentTimestamp = value;
    }

    /**
     * Gets the value of the appointmentDeliveryTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDeliveryTimestamp() {
        return appointmentDeliveryTimestamp;
    }

    /**
     * Sets the value of the appointmentDeliveryTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDeliveryTimestamp(XMLGregorianCalendar value) {
        this.appointmentDeliveryTimestamp = value;
    }

    /**
     * Gets the value of the estimatedDeliveryTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryTimestamp() {
        return estimatedDeliveryTimestamp;
    }

    /**
     * Sets the value of the estimatedDeliveryTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryTimestamp(XMLGregorianCalendar value) {
        this.estimatedDeliveryTimestamp = value;
    }

    /**
     * Gets the value of the actualDeliveryTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDeliveryTimestamp() {
        return actualDeliveryTimestamp;
    }

    /**
     * Sets the value of the actualDeliveryTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDeliveryTimestamp(XMLGregorianCalendar value) {
        this.actualDeliveryTimestamp = value;
    }

    /**
     * Gets the value of the actualDeliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getActualDeliveryAddress() {
        return actualDeliveryAddress;
    }

    /**
     * Sets the value of the actualDeliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setActualDeliveryAddress(Address value) {
        this.actualDeliveryAddress = value;
    }

    /**
     * Gets the value of the officeOrderDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeOrderDeliveryMethodType }
     *     
     */
    public OfficeOrderDeliveryMethodType getOfficeOrderDeliveryMethod() {
        return officeOrderDeliveryMethod;
    }

    /**
     * Sets the value of the officeOrderDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeOrderDeliveryMethodType }
     *     
     */
    public void setOfficeOrderDeliveryMethod(OfficeOrderDeliveryMethodType value) {
        this.officeOrderDeliveryMethod = value;
    }

    /**
     * Gets the value of the deliveryLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TrackDeliveryLocationType }
     *     
     */
    public TrackDeliveryLocationType getDeliveryLocationType() {
        return deliveryLocationType;
    }

    /**
     * Sets the value of the deliveryLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackDeliveryLocationType }
     *     
     */
    public void setDeliveryLocationType(TrackDeliveryLocationType value) {
        this.deliveryLocationType = value;
    }

    /**
     * Gets the value of the deliveryLocationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryLocationDescription() {
        return deliveryLocationDescription;
    }

    /**
     * Sets the value of the deliveryLocationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryLocationDescription(String value) {
        this.deliveryLocationDescription = value;
    }

    /**
     * Gets the value of the deliveryAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryAttempts() {
        return deliveryAttempts;
    }

    /**
     * Sets the value of the deliveryAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryAttempts(BigInteger value) {
        this.deliveryAttempts = value;
    }

    /**
     * Gets the value of the deliverySignatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliverySignatureName() {
        return deliverySignatureName;
    }

    /**
     * Sets the value of the deliverySignatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliverySignatureName(String value) {
        this.deliverySignatureName = value;
    }

    /**
     * Gets the value of the pieceCountVerificationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceCountVerificationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceCountVerificationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieceCountVerificationDetail }
     * 
     * 
     */
    public List<PieceCountVerificationDetail> getPieceCountVerificationDetails() {
        if (pieceCountVerificationDetails == null) {
            pieceCountVerificationDetails = new ArrayList<PieceCountVerificationDetail>();
        }
        return this.pieceCountVerificationDetails;
    }

    /**
     * Gets the value of the totalUniqueAddressCountInConsolidation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalUniqueAddressCountInConsolidation() {
        return totalUniqueAddressCountInConsolidation;
    }

    /**
     * Sets the value of the totalUniqueAddressCountInConsolidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalUniqueAddressCountInConsolidation(BigInteger value) {
        this.totalUniqueAddressCountInConsolidation = value;
    }

    /**
     * Gets the value of the availableImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableImageType }
     * 
     * 
     */
    public List<AvailableImageType> getAvailableImages() {
        if (availableImages == null) {
            availableImages = new ArrayList<AvailableImageType>();
        }
        return this.availableImages;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureImageDetail }
     *     
     */
    public SignatureImageDetail getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureImageDetail }
     *     
     */
    public void setSignature(SignatureImageDetail value) {
        this.signature = value;
    }

    /**
     * Gets the value of the notificationEventsAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationEventsAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationEventsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMailNotificationEventType }
     * 
     * 
     */
    public List<EMailNotificationEventType> getNotificationEventsAvailable() {
        if (notificationEventsAvailable == null) {
            notificationEventsAvailable = new ArrayList<EMailNotificationEventType>();
        }
        return this.notificationEventsAvailable;
    }

    /**
     * Gets the value of the splitShipmentParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitShipmentParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitShipmentParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackSplitShipmentPart }
     * 
     * 
     */
    public List<TrackSplitShipmentPart> getSplitShipmentParts() {
        if (splitShipmentParts == null) {
            splitShipmentParts = new ArrayList<TrackSplitShipmentPart>();
        }
        return this.splitShipmentParts;
    }

    /**
     * Gets the value of the deliveryOptionEligibilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryOptionEligibilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryOptionEligibilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryOptionEligibilityDetail }
     * 
     * 
     */
    public List<DeliveryOptionEligibilityDetail> getDeliveryOptionEligibilityDetails() {
        if (deliveryOptionEligibilityDetails == null) {
            deliveryOptionEligibilityDetails = new ArrayList<DeliveryOptionEligibilityDetail>();
        }
        return this.deliveryOptionEligibilityDetails;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackEvent }
     * 
     * 
     */
    public List<TrackEvent> getEvents() {
        if (events == null) {
            events = new ArrayList<TrackEvent>();
        }
        return this.events;
    }

}
