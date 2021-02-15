
package au.net.electronichealth.ns.simd.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.smd.types.sealedmessage.V2010.SealedMessageType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://ns.electronichealth.net.au/smd/xsd/SealedMessage/2010}SealedMessageType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response"
})
@XmlRootElement(name = "deliverResponse")
public class DeliverResponse {

    @XmlElement(required = true)
    protected SealedMessageType response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link SealedMessageType }
     *     
     */
    public SealedMessageType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link SealedMessageType }
     *     
     */
    public void setResponse(SealedMessageType value) {
        this.response = value;
    }

}
