
package org.alc.ws.stub.fedex.track;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The descriptive data regarding the result of the submitted transaction.
 * 
 * <p>Java class for Notification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Severity" type="{http://fedex.com/ws/track/v9}NotificationSeverityType"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalizedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageParameters" type="{http://fedex.com/ws/track/v9}NotificationParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {
    "severity",
    "source",
    "code",
    "message",
    "localizedMessage",
    "messageParameters"
})
public class Notification {

    @XmlElement(name = "Severity", required = true)
    protected NotificationSeverityType severity;
    @XmlElement(name = "Source", required = true)
    protected String source;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "LocalizedMessage")
    protected String localizedMessage;
    @XmlElement(name = "MessageParameters")
    protected List<NotificationParameter> messageParameters;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSeverityType }
     *     
     */
    public NotificationSeverityType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSeverityType }
     *     
     */
    public void setSeverity(NotificationSeverityType value) {
        this.severity = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the localizedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizedMessage() {
        return localizedMessage;
    }

    /**
     * Sets the value of the localizedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizedMessage(String value) {
        this.localizedMessage = value;
    }

    /**
     * Gets the value of the messageParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationParameter }
     * 
     * 
     */
    public List<NotificationParameter> getMessageParameters() {
        if (messageParameters == null) {
            messageParameters = new ArrayList<NotificationParameter>();
        }
        return this.messageParameters;
    }

}
