
package org.alc.ws.stub.fedex.track;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Descriptive data for the client submitting a transaction.
 * 
 * <p>Java class for ClientDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MeterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IntegratorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localization" type="{http://fedex.com/ws/track/v9}Localization" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientDetail", propOrder = {
    "accountNumber",
    "meterNumber",
    "integratorId",
    "localization"
})
public class ClientDetail {

    @XmlElement(name = "AccountNumber", required = true)
    protected String accountNumber;
    @XmlElement(name = "MeterNumber", required = true)
    protected String meterNumber;
    @XmlElement(name = "IntegratorId")
    protected String integratorId;
    @XmlElement(name = "Localization")
    protected Localization localization;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the meterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNumber() {
        return meterNumber;
    }

    /**
     * Sets the value of the meterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNumber(String value) {
        this.meterNumber = value;
    }

    /**
     * Gets the value of the integratorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntegratorId() {
        return integratorId;
    }

    /**
     * Sets the value of the integratorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntegratorId(String value) {
        this.integratorId = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link Localization }
     *     
     */
    public Localization getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Localization }
     *     
     */
    public void setLocalization(Localization value) {
        this.localization = value;
    }

}
