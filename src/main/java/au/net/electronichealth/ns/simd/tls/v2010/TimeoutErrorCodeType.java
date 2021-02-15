
package au.net.electronichealth.ns.simd.tls.v2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeoutErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeoutErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="busyRetryLater"/>
 *     &lt;enumeration value="requestFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeoutErrorCodeType")
@XmlEnum
public enum TimeoutErrorCodeType {

    @XmlEnumValue("busyRetryLater")
    BUSY_RETRY_LATER("busyRetryLater"),
    @XmlEnumValue("requestFailure")
    REQUEST_FAILURE("requestFailure");
    private final String value;

    TimeoutErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeoutErrorCodeType fromValue(String v) {
        for (TimeoutErrorCodeType c: TimeoutErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
