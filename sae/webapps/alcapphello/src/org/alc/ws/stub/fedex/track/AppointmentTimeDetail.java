
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the details about the appointment time window.
 * 
 * <p>Java class for AppointmentTimeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentTimeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://fedex.com/ws/track/v9}AppointmentWindowType" minOccurs="0"/>
 *         &lt;element name="Window" type="{http://fedex.com/ws/track/v9}LocalTimeRange" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentTimeDetail", propOrder = {
    "type",
    "window",
    "description"
})
public class AppointmentTimeDetail {

    @XmlElement(name = "Type")
    protected AppointmentWindowType type;
    @XmlElement(name = "Window")
    protected LocalTimeRange window;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentWindowType }
     *     
     */
    public AppointmentWindowType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentWindowType }
     *     
     */
    public void setType(AppointmentWindowType value) {
        this.type = value;
    }

    /**
     * Gets the value of the window property.
     * 
     * @return
     *     possible object is
     *     {@link LocalTimeRange }
     *     
     */
    public LocalTimeRange getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalTimeRange }
     *     
     */
    public void setWindow(LocalTimeRange value) {
        this.window = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
