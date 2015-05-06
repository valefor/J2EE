
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.alc.ws.stub.fedex package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendNotificationsReply_QNAME = new QName("http://fedex.com/ws/track/v9", "SendNotificationsReply");
    private final static QName _SendNotificationsRequest_QNAME = new QName("http://fedex.com/ws/track/v9", "SendNotificationsRequest");
    private final static QName _TrackReply_QNAME = new QName("http://fedex.com/ws/track/v9", "TrackReply");
    private final static QName _SignatureProofOfDeliveryLetterRequest_QNAME = new QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryLetterRequest");
    private final static QName _TrackRequest_QNAME = new QName("http://fedex.com/ws/track/v9", "TrackRequest");
    private final static QName _SignatureProofOfDeliveryFaxReply_QNAME = new QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxReply");
    private final static QName _SignatureProofOfDeliveryFaxRequest_QNAME = new QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryFaxRequest");
    private final static QName _SignatureProofOfDeliveryLetterReply_QNAME = new QName("http://fedex.com/ws/track/v9", "SignatureProofOfDeliveryLetterReply");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.alc.ws.stub.fedex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignatureProofOfDeliveryFaxRequest }
     * 
     */
    public SignatureProofOfDeliveryFaxRequest createSignatureProofOfDeliveryFaxRequest() {
        return new SignatureProofOfDeliveryFaxRequest();
    }

    /**
     * Create an instance of {@link SignatureProofOfDeliveryFaxReply }
     * 
     */
    public SignatureProofOfDeliveryFaxReply createSignatureProofOfDeliveryFaxReply() {
        return new SignatureProofOfDeliveryFaxReply();
    }

    /**
     * Create an instance of {@link TrackRequest }
     * 
     */
    public TrackRequest createTrackRequest() {
        return new TrackRequest();
    }

    /**
     * Create an instance of {@link SignatureProofOfDeliveryLetterRequest }
     * 
     */
    public SignatureProofOfDeliveryLetterRequest createSignatureProofOfDeliveryLetterRequest() {
        return new SignatureProofOfDeliveryLetterRequest();
    }

    /**
     * Create an instance of {@link SignatureProofOfDeliveryLetterReply }
     * 
     */
    public SignatureProofOfDeliveryLetterReply createSignatureProofOfDeliveryLetterReply() {
        return new SignatureProofOfDeliveryLetterReply();
    }

    /**
     * Create an instance of {@link SendNotificationsReply }
     * 
     */
    public SendNotificationsReply createSendNotificationsReply() {
        return new SendNotificationsReply();
    }

    /**
     * Create an instance of {@link TrackReply }
     * 
     */
    public TrackReply createTrackReply() {
        return new TrackReply();
    }

    /**
     * Create an instance of {@link SendNotificationsRequest }
     * 
     */
    public SendNotificationsRequest createSendNotificationsRequest() {
        return new SendNotificationsRequest();
    }

    /**
     * Create an instance of {@link NotificationParameter }
     * 
     */
    public NotificationParameter createNotificationParameter() {
        return new NotificationParameter();
    }

    /**
     * Create an instance of {@link EMailNotificationRecipient }
     * 
     */
    public EMailNotificationRecipient createEMailNotificationRecipient() {
        return new EMailNotificationRecipient();
    }

    /**
     * Create an instance of {@link Commodity }
     * 
     */
    public Commodity createCommodity() {
        return new Commodity();
    }

    /**
     * Create an instance of {@link TrackDetail }
     * 
     */
    public TrackDetail createTrackDetail() {
        return new TrackDetail();
    }

    /**
     * Create an instance of {@link LocalTimeRange }
     * 
     */
    public LocalTimeRange createLocalTimeRange() {
        return new LocalTimeRange();
    }

    /**
     * Create an instance of {@link TransactionDetail }
     * 
     */
    public TransactionDetail createTransactionDetail() {
        return new TransactionDetail();
    }

    /**
     * Create an instance of {@link TrackStatusDetail }
     * 
     */
    public TrackStatusDetail createTrackStatusDetail() {
        return new TrackStatusDetail();
    }

    /**
     * Create an instance of {@link Weight }
     * 
     */
    public Weight createWeight() {
        return new Weight();
    }

    /**
     * Create an instance of {@link VersionId }
     * 
     */
    public VersionId createVersionId() {
        return new VersionId();
    }

    /**
     * Create an instance of {@link TrackChargeDetail }
     * 
     */
    public TrackChargeDetail createTrackChargeDetail() {
        return new TrackChargeDetail();
    }

    /**
     * Create an instance of {@link Notification }
     * 
     */
    public Notification createNotification() {
        return new Notification();
    }

    /**
     * Create an instance of {@link Dimensions }
     * 
     */
    public Dimensions createDimensions() {
        return new Dimensions();
    }

    /**
     * Create an instance of {@link EMailNotificationDetail }
     * 
     */
    public EMailNotificationDetail createEMailNotificationDetail() {
        return new EMailNotificationDetail();
    }

    /**
     * Create an instance of {@link DeliveryOptionEligibilityDetail }
     * 
     */
    public DeliveryOptionEligibilityDetail createDeliveryOptionEligibilityDetail() {
        return new DeliveryOptionEligibilityDetail();
    }

    /**
     * Create an instance of {@link TrackReturnDetail }
     * 
     */
    public TrackReturnDetail createTrackReturnDetail() {
        return new TrackReturnDetail();
    }

    /**
     * Create an instance of {@link TrackAdvanceNotificationDetail }
     * 
     */
    public TrackAdvanceNotificationDetail createTrackAdvanceNotificationDetail() {
        return new TrackAdvanceNotificationDetail();
    }

    /**
     * Create an instance of {@link TrackSplitShipmentPart }
     * 
     */
    public TrackSplitShipmentPart createTrackSplitShipmentPart() {
        return new TrackSplitShipmentPart();
    }

    /**
     * Create an instance of {@link TrackSelectionDetail }
     * 
     */
    public TrackSelectionDetail createTrackSelectionDetail() {
        return new TrackSelectionDetail();
    }

    /**
     * Create an instance of {@link PagingDetail }
     * 
     */
    public PagingDetail createPagingDetail() {
        return new PagingDetail();
    }

    /**
     * Create an instance of {@link AppointmentTimeDetail }
     * 
     */
    public AppointmentTimeDetail createAppointmentTimeDetail() {
        return new AppointmentTimeDetail();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link QualifiedTrackingNumber }
     * 
     */
    public QualifiedTrackingNumber createQualifiedTrackingNumber() {
        return new QualifiedTrackingNumber();
    }

    /**
     * Create an instance of {@link Localization }
     * 
     */
    public Localization createLocalization() {
        return new Localization();
    }

    /**
     * Create an instance of {@link ContentRecord }
     * 
     */
    public ContentRecord createContentRecord() {
        return new ContentRecord();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link TrackServiceDescriptionDetail }
     * 
     */
    public TrackServiceDescriptionDetail createTrackServiceDescriptionDetail() {
        return new TrackServiceDescriptionDetail();
    }

    /**
     * Create an instance of {@link PieceCountVerificationDetail }
     * 
     */
    public PieceCountVerificationDetail createPieceCountVerificationDetail() {
        return new PieceCountVerificationDetail();
    }

    /**
     * Create an instance of {@link EdtExciseCondition }
     * 
     */
    public EdtExciseCondition createEdtExciseCondition() {
        return new EdtExciseCondition();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link CustomerExceptionRequestDetail }
     * 
     */
    public CustomerExceptionRequestDetail createCustomerExceptionRequestDetail() {
        return new CustomerExceptionRequestDetail();
    }

    /**
     * Create an instance of {@link ClientDetail }
     * 
     */
    public ClientDetail createClientDetail() {
        return new ClientDetail();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link TrackNotificationPackage }
     * 
     */
    public TrackNotificationPackage createTrackNotificationPackage() {
        return new TrackNotificationPackage();
    }

    /**
     * Create an instance of {@link TrackReconciliation }
     * 
     */
    public TrackReconciliation createTrackReconciliation() {
        return new TrackReconciliation();
    }

    /**
     * Create an instance of {@link TrackStatusAncillaryDetail }
     * 
     */
    public TrackStatusAncillaryDetail createTrackStatusAncillaryDetail() {
        return new TrackStatusAncillaryDetail();
    }

    /**
     * Create an instance of {@link SpecialInstructionStatusDetail }
     * 
     */
    public SpecialInstructionStatusDetail createSpecialInstructionStatusDetail() {
        return new SpecialInstructionStatusDetail();
    }

    /**
     * Create an instance of {@link TrackPackageIdentifier }
     * 
     */
    public TrackPackageIdentifier createTrackPackageIdentifier() {
        return new TrackPackageIdentifier();
    }

    /**
     * Create an instance of {@link CompletedTrackDetail }
     * 
     */
    public CompletedTrackDetail createCompletedTrackDetail() {
        return new CompletedTrackDetail();
    }

    /**
     * Create an instance of {@link WebAuthenticationCredential }
     * 
     */
    public WebAuthenticationCredential createWebAuthenticationCredential() {
        return new WebAuthenticationCredential();
    }

    /**
     * Create an instance of {@link TrackEvent }
     * 
     */
    public TrackEvent createTrackEvent() {
        return new TrackEvent();
    }

    /**
     * Create an instance of {@link TrackSpecialInstruction }
     * 
     */
    public TrackSpecialInstruction createTrackSpecialInstruction() {
        return new TrackSpecialInstruction();
    }

    /**
     * Create an instance of {@link SignatureImageDetail }
     * 
     */
    public SignatureImageDetail createSignatureImageDetail() {
        return new SignatureImageDetail();
    }

    /**
     * Create an instance of {@link AppointmentDetail }
     * 
     */
    public AppointmentDetail createAppointmentDetail() {
        return new AppointmentDetail();
    }

    /**
     * Create an instance of {@link ContactAndAddress }
     * 
     */
    public ContactAndAddress createContactAndAddress() {
        return new ContactAndAddress();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link CustomsOptionDetail }
     * 
     */
    public CustomsOptionDetail createCustomsOptionDetail() {
        return new CustomsOptionDetail();
    }

    /**
     * Create an instance of {@link WebAuthenticationDetail }
     * 
     */
    public WebAuthenticationDetail createWebAuthenticationDetail() {
        return new WebAuthenticationDetail();
    }

    /**
     * Create an instance of {@link TrackSpecialHandling }
     * 
     */
    public TrackSpecialHandling createTrackSpecialHandling() {
        return new TrackSpecialHandling();
    }

    /**
     * Create an instance of {@link TrackNotificationRecipientDetail }
     * 
     */
    public TrackNotificationRecipientDetail createTrackNotificationRecipientDetail() {
        return new TrackNotificationRecipientDetail();
    }

    /**
     * Create an instance of {@link TrackOtherIdentifierDetail }
     * 
     */
    public TrackOtherIdentifierDetail createTrackOtherIdentifierDetail() {
        return new TrackOtherIdentifierDetail();
    }

    /**
     * Create an instance of {@link NaftaCommodityDetail }
     * 
     */
    public NaftaCommodityDetail createNaftaCommodityDetail() {
        return new NaftaCommodityDetail();
    }

    /**
     * Create an instance of {@link StringBarcode }
     * 
     */
    public StringBarcode createStringBarcode() {
        return new StringBarcode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationsReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v9", name = "SendNotificationsReply")
    public JAXBElement<SendNotificationsReply> createSendNotificationsReply(SendNotificationsReply value) {
        return new JAXBElement<SendNotificationsReply>(_SendNotificationsReply_QNAME, SendNotificationsReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNotificationsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v9", name = "SendNotificationsRequest")
    public JAXBElement<SendNotificationsRequest> createSendNotificationsRequest(SendNotificationsRequest value) {
        return new JAXBElement<SendNotificationsRequest>(_SendNotificationsRequest_QNAME, SendNotificationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v9", name = "TrackReply")
    public JAXBElement<TrackReply> createTrackReply(TrackReply value) {
        return new JAXBElement<TrackReply>(_TrackReply_QNAME, TrackReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureProofOfDeliveryLetterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v9", name = "SignatureProofOfDeliveryLetterRequest")
    public JAXBElement<SignatureProofOfDeliveryLetterRequest> createSignatureProofOfDeliveryLetterRequest(SignatureProofOfDeliveryLetterRequest value) {
        return new JAXBElement<SignatureProofOfDeliveryLetterRequest>(_SignatureProofOfDeliveryLetterRequest_QNAME, SignatureProofOfDeliveryLetterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v9", name = "TrackRequest")
    public JAXBElement<TrackRequest> createTrackRequest(TrackRequest value) {
        return new JAXBElement<TrackRequest>(_TrackRequest_QNAME, TrackRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureProofOfDeliveryFaxReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v9", name = "SignatureProofOfDeliveryFaxReply")
    public JAXBElement<SignatureProofOfDeliveryFaxReply> createSignatureProofOfDeliveryFaxReply(SignatureProofOfDeliveryFaxReply value) {
        return new JAXBElement<SignatureProofOfDeliveryFaxReply>(_SignatureProofOfDeliveryFaxReply_QNAME, SignatureProofOfDeliveryFaxReply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureProofOfDeliveryFaxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v9", name = "SignatureProofOfDeliveryFaxRequest")
    public JAXBElement<SignatureProofOfDeliveryFaxRequest> createSignatureProofOfDeliveryFaxRequest(SignatureProofOfDeliveryFaxRequest value) {
        return new JAXBElement<SignatureProofOfDeliveryFaxRequest>(_SignatureProofOfDeliveryFaxRequest_QNAME, SignatureProofOfDeliveryFaxRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureProofOfDeliveryLetterReply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fedex.com/ws/track/v9", name = "SignatureProofOfDeliveryLetterReply")
    public JAXBElement<SignatureProofOfDeliveryLetterReply> createSignatureProofOfDeliveryLetterReply(SignatureProofOfDeliveryLetterReply value) {
        return new JAXBElement<SignatureProofOfDeliveryLetterReply>(_SignatureProofOfDeliveryLetterReply_QNAME, SignatureProofOfDeliveryLetterReply.class, null, value);
    }

}
