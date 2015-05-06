
package org.alc.ws.stub.fedex.track;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information describing email notifications that will be sent in relation to events that occur during package movement
 * 
 * <p>Java class for EMailNotificationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EMailNotificationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recipients" type="{http://fedex.com/ws/track/v9}EMailNotificationRecipient" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMailNotificationDetail", propOrder = {
    "personalMessage",
    "recipients"
})
public class EMailNotificationDetail {

    @XmlElement(name = "PersonalMessage")
    protected String personalMessage;
    @XmlElement(name = "Recipients", required = true)
    protected List<EMailNotificationRecipient> recipients;

    /**
     * Gets the value of the personalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMessage() {
        return personalMessage;
    }

    /**
     * Sets the value of the personalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMessage(String value) {
        this.personalMessage = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMailNotificationRecipient }
     * 
     * 
     */
    public List<EMailNotificationRecipient> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<EMailNotificationRecipient>();
        }
        return this.recipients;
    }

}
