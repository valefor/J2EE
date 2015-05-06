
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies the version/level of a service operation expected by a caller (in each request) and performed by the callee (in each reply).
 * 
 * <p>Java class for VersionId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Intermediate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionId", propOrder = {
    "serviceId",
    "major",
    "intermediate",
    "minor"
})
public class VersionId {

    @XmlElement(name = "ServiceId", required = true)
    protected String serviceId;
    @XmlElement(name = "Major")
    protected int major;
    @XmlElement(name = "Intermediate")
    protected int intermediate;
    @XmlElement(name = "Minor")
    protected int minor;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the major property.
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * Gets the value of the intermediate property.
     * 
     */
    public int getIntermediate() {
        return intermediate;
    }

    /**
     * Sets the value of the intermediate property.
     * 
     */
    public void setIntermediate(int value) {
        this.intermediate = value;
    }

    /**
     * Gets the value of the minor property.
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
    }

}
