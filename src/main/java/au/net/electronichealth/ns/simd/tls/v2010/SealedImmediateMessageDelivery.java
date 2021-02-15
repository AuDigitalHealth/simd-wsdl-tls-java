
package au.net.electronichealth.ns.simd.tls.v2010;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import au.net.electronichealth.ns.smd.types.sealedmessage.V2010.SealedMessageType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.3-b01-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SealedImmediateMessageDelivery", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010")
@XmlSeeAlso({
    au.net.electronichealth.ns.simd.tls.v2010.ObjectFactory.class,
    au.net.electronichealth.ns.smd.core.types.encryptedpayload.v2010.ObjectFactory.class,
    au.net.electronichealth.ns.smd.core.types.qualifiedcertref.V2010.ObjectFactory.class,
    au.net.electronichealth.ns.smd.core.types.standarderror.V2010.ObjectFactory.class,
    au.net.electronichealth.ns.smd.els.types.V2010.ObjectFactory.class,
    au.net.electronichealth.ns.smd.types.sealedmessage.V2010.ObjectFactory.class,
    au.net.electronichealth.ns.smd.xsd.transportresponse._2010.ObjectFactory.class,
    org.w3._2000._09.xmldsig.ObjectFactory.class,
    org.w3._2001._04.xmlenc.ObjectFactory.class
})
public interface SealedImmediateMessageDelivery {


    /**
     * 
     * @param message
     * @return
     *     returns au.net.electronichealth.ns.smd.types.sealedmessage.V2010.SealedMessageType
     * @throws TimeoutErrorMsg
     * @throws StandardErrorMsg
     * @throws DeliverErrorMsg
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010")
    @RequestWrapper(localName = "deliver", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010", className = "au.net.electronichealth.ns.simd.tls.v2010.Deliver")
    @ResponseWrapper(localName = "deliverResponse", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010", className = "au.net.electronichealth.ns.simd.tls.v2010.DeliverResponse")
    @Action(input = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010/SealedImmediateMessageDelivery/deliverRequest", output = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010/SealedImmediateMessageDelivery/deliverResponse", fault = {
        @FaultAction(className = DeliverErrorMsg.class, value = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010/SealedImmediateMessageDelivery/deliver/Fault/deliverError"),
        @FaultAction(className = TimeoutErrorMsg.class, value = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010/SealedImmediateMessageDelivery/deliver/Fault/timeoutError"),
        @FaultAction(className = StandardErrorMsg.class, value = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010/SealedImmediateMessageDelivery/deliver/Fault/standardError")
    })
    public SealedMessageType deliver(
        @WebParam(name = "message", targetNamespace = "http://ns.electronichealth.net.au/smd/svc/SealedImmediateMessageDelivery/2010")
        SealedMessageType message)
        throws DeliverErrorMsg, StandardErrorMsg, TimeoutErrorMsg
    ;

}
