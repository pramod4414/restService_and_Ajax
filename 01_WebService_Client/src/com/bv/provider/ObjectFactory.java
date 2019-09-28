
package com.bv.provider;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bv.provider package. 
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

    private final static QName _GetdataResponse_QNAME = new QName("http://provider.bv.com/", "getdataResponse");
    private final static QName _Getdata_QNAME = new QName("http://provider.bv.com/", "getdata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bv.provider
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetdataResponse }
     * 
     */
    public GetdataResponse createGetdataResponse() {
        return new GetdataResponse();
    }

    /**
     * Create an instance of {@link Getdata }
     * 
     */
    public Getdata createGetdata() {
        return new Getdata();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetdataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.bv.com/", name = "getdataResponse")
    public JAXBElement<GetdataResponse> createGetdataResponse(GetdataResponse value) {
        return new JAXBElement<GetdataResponse>(_GetdataResponse_QNAME, GetdataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getdata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.bv.com/", name = "getdata")
    public JAXBElement<Getdata> createGetdata(Getdata value) {
        return new JAXBElement<Getdata>(_Getdata_QNAME, Getdata.class, null, value);
    }

}
