
package org.alc.ws.stub.fedex.track;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Options available for a tracking notification recipient.
 * 
 * <p>Java class for TrackNotificationRecipientDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackNotificationRecipientDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationEventsAvailable" type="{http://fedex.com/ws/track/v9}EMailNotificationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackNotificationRecipientDetail", propOrder = {
    "notificationEventsAvailable"
})
public class TrackNotificationRecipientDetail {

    @XmlElement(name = "NotificationEventsAvailable")
    protected List<EMailNotificationEventType> notificationEventsAvailable;

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

}
