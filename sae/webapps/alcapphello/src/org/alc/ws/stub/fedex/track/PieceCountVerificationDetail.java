
package org.alc.ws.stub.fedex.track;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PieceCountVerificationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PieceCountVerificationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountLocationType" type="{http://fedex.com/ws/track/v9}PieceCountLocationType" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
@XmlType(name = "PieceCountVerificationDetail", propOrder = {
    "countLocationType",
    "count",
    "description"
})
public class PieceCountVerificationDetail {

    @XmlElement(name = "CountLocationType")
    protected PieceCountLocationType countLocationType;
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the countLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link PieceCountLocationType }
     *     
     */
    public PieceCountLocationType getCountLocationType() {
        return countLocationType;
    }

    /**
     * Sets the value of the countLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PieceCountLocationType }
     *     
     */
    public void setCountLocationType(PieceCountLocationType value) {
        this.countLocationType = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
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
