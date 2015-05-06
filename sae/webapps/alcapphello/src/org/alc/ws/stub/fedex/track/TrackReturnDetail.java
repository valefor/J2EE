
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackReturnDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackReturnDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementStatus" type="{http://fedex.com/ws/track/v9}TrackReturnMovementStatusType" minOccurs="0"/>
 *         &lt;element name="LabelType" type="{http://fedex.com/ws/track/v9}TrackReturnLabelType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackReturnDetail", propOrder = {
    "movementStatus",
    "labelType",
    "description",
    "authorizationName"
})
public class TrackReturnDetail {

    @XmlElement(name = "MovementStatus")
    protected TrackReturnMovementStatusType movementStatus;
    @XmlElement(name = "LabelType")
    protected TrackReturnLabelType labelType;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AuthorizationName")
    protected String authorizationName;

    /**
     * Gets the value of the movementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TrackReturnMovementStatusType }
     *     
     */
    public TrackReturnMovementStatusType getMovementStatus() {
        return movementStatus;
    }

    /**
     * Sets the value of the movementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackReturnMovementStatusType }
     *     
     */
    public void setMovementStatus(TrackReturnMovementStatusType value) {
        this.movementStatus = value;
    }

    /**
     * Gets the value of the labelType property.
     * 
     * @return
     *     possible object is
     *     {@link TrackReturnLabelType }
     *     
     */
    public TrackReturnLabelType getLabelType() {
        return labelType;
    }

    /**
     * Sets the value of the labelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackReturnLabelType }
     *     
     */
    public void setLabelType(TrackReturnLabelType value) {
        this.labelType = value;
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

    /**
     * Gets the value of the authorizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationName() {
        return authorizationName;
    }

    /**
     * Sets the value of the authorizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationName(String value) {
        this.authorizationName = value;
    }

}
