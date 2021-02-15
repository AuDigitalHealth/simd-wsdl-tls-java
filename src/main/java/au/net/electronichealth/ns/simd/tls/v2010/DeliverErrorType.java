
package au.net.electronichealth.ns.simd.tls.v2010;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.smd.xsd.transportresponse._2010.DeliveryResponseType;


/**
 * <p>Java class for DeliverErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliverErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryResponse" type="{http://ns.electronichealth.net.au/smd/xsd/TransportResponse/2010}DeliveryResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverErrorType", propOrder = {
    "deliveryResponse"
})
public class DeliverErrorType {

    @XmlElement(required = true)
    protected DeliveryResponseType deliveryResponse;

    /**
     * Gets the value of the deliveryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryResponseType }
     *     
     */
    public DeliveryResponseType getDeliveryResponse() {
        return deliveryResponse;
    }

    /**
     * Sets the value of the deliveryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryResponseType }
     *     
     */
    public void setDeliveryResponse(DeliveryResponseType value) {
        this.deliveryResponse = value;
    }

}
