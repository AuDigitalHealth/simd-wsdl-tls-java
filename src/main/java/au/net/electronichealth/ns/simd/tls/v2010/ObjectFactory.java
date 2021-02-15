
package au.net.electronichealth.ns.simd.tls.v2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.simd.tls.v2010 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TimeoutError_QNAME = new QName("http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010", "timeoutError");
    private final static QName _DeliverError_QNAME = new QName("http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010", "deliverError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.simd.tls.v2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimeoutErrorType }
     * 
     */
    public TimeoutErrorType createTimeoutErrorType() {
        return new TimeoutErrorType();
    }

    /**
     * Create an instance of {@link Deliver }
     * 
     */
    public Deliver createDeliver() {
        return new Deliver();
    }

    /**
     * Create an instance of {@link DeliverResponse }
     * 
     */
    public DeliverResponse createDeliverResponse() {
        return new DeliverResponse();
    }

    /**
     * Create an instance of {@link DeliverErrorType }
     * 
     */
    public DeliverErrorType createDeliverErrorType() {
        return new DeliverErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeoutErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010", name = "timeoutError")
    public JAXBElement<TimeoutErrorType> createTimeoutError(TimeoutErrorType value) {
        return new JAXBElement<TimeoutErrorType>(_TimeoutError_QNAME, TimeoutErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliverErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010", name = "deliverError")
    public JAXBElement<DeliverErrorType> createDeliverError(DeliverErrorType value) {
        return new JAXBElement<DeliverErrorType>(_DeliverError_QNAME, DeliverErrorType.class, null, value);
    }

}
