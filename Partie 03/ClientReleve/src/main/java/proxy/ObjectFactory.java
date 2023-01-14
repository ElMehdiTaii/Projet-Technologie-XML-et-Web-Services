
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetReleves_QNAME = new QName("http://ws/", "getReleves");
    private final static QName _GetRelevesResponse_QNAME = new QName("http://ws/", "getRelevesResponse");
    private final static QName _OperationsByType_QNAME = new QName("http://ws/", "operationsByType");
    private final static QName _OperationsByTypeResponse_QNAME = new QName("http://ws/", "operationsByTypeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReleves }
     * 
     * @return
     *     the new instance of {@link GetReleves }
     */
    public GetReleves createGetReleves() {
        return new GetReleves();
    }

    /**
     * Create an instance of {@link GetRelevesResponse }
     * 
     * @return
     *     the new instance of {@link GetRelevesResponse }
     */
    public GetRelevesResponse createGetRelevesResponse() {
        return new GetRelevesResponse();
    }

    /**
     * Create an instance of {@link OperationsByType }
     * 
     * @return
     *     the new instance of {@link OperationsByType }
     */
    public OperationsByType createOperationsByType() {
        return new OperationsByType();
    }

    /**
     * Create an instance of {@link OperationsByTypeResponse }
     * 
     * @return
     *     the new instance of {@link OperationsByTypeResponse }
     */
    public OperationsByTypeResponse createOperationsByTypeResponse() {
        return new OperationsByTypeResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     * @return
     *     the new instance of {@link Releve }
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReleves }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReleves }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getReleves")
    public JAXBElement<GetReleves> createGetReleves(GetReleves value) {
        return new JAXBElement<>(_GetReleves_QNAME, GetReleves.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelevesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRelevesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getRelevesResponse")
    public JAXBElement<GetRelevesResponse> createGetRelevesResponse(GetRelevesResponse value) {
        return new JAXBElement<>(_GetRelevesResponse_QNAME, GetRelevesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsByType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationsByType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operationsByType")
    public JAXBElement<OperationsByType> createOperationsByType(OperationsByType value) {
        return new JAXBElement<>(_OperationsByType_QNAME, OperationsByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationsByTypeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationsByTypeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "operationsByTypeResponse")
    public JAXBElement<OperationsByTypeResponse> createOperationsByTypeResponse(OperationsByTypeResponse value) {
        return new JAXBElement<>(_OperationsByTypeResponse_QNAME, OperationsByTypeResponse.class, null, value);
    }

}
