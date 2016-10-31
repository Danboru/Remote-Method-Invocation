
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _InsertObatResponse_QNAME = new QName("http://Services/", "insertObatResponse");
    private final static QName _DeleteObat_QNAME = new QName("http://Services/", "deleteObat");
    private final static QName _SelectObatResponse_QNAME = new QName("http://Services/", "selectObatResponse");
    private final static QName _SelectObat_QNAME = new QName("http://Services/", "selectObat");
    private final static QName _DeleteObatResponse_QNAME = new QName("http://Services/", "deleteObatResponse");
    private final static QName _UpdateObat_QNAME = new QName("http://Services/", "updateObat");
    private final static QName _UpdateObatResponse_QNAME = new QName("http://Services/", "updateObatResponse");
    private final static QName _InsertObat_QNAME = new QName("http://Services/", "insertObat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateObat }
     * 
     */
    public UpdateObat createUpdateObat() {
        return new UpdateObat();
    }

    /**
     * Create an instance of {@link InsertObat }
     * 
     */
    public InsertObat createInsertObat() {
        return new InsertObat();
    }

    /**
     * Create an instance of {@link UpdateObatResponse }
     * 
     */
    public UpdateObatResponse createUpdateObatResponse() {
        return new UpdateObatResponse();
    }

    /**
     * Create an instance of {@link InsertObatResponse }
     * 
     */
    public InsertObatResponse createInsertObatResponse() {
        return new InsertObatResponse();
    }

    /**
     * Create an instance of {@link SelectObatResponse }
     * 
     */
    public SelectObatResponse createSelectObatResponse() {
        return new SelectObatResponse();
    }

    /**
     * Create an instance of {@link DeleteObat }
     * 
     */
    public DeleteObat createDeleteObat() {
        return new DeleteObat();
    }

    /**
     * Create an instance of {@link DeleteObatResponse }
     * 
     */
    public DeleteObatResponse createDeleteObatResponse() {
        return new DeleteObatResponse();
    }

    /**
     * Create an instance of {@link SelectObat }
     * 
     */
    public SelectObat createSelectObat() {
        return new SelectObat();
    }

    /**
     * Create an instance of {@link ModelObat }
     * 
     */
    public ModelObat createModelObat() {
        return new ModelObat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertObatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "insertObatResponse")
    public JAXBElement<InsertObatResponse> createInsertObatResponse(InsertObatResponse value) {
        return new JAXBElement<InsertObatResponse>(_InsertObatResponse_QNAME, InsertObatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteObat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "deleteObat")
    public JAXBElement<DeleteObat> createDeleteObat(DeleteObat value) {
        return new JAXBElement<DeleteObat>(_DeleteObat_QNAME, DeleteObat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectObatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "selectObatResponse")
    public JAXBElement<SelectObatResponse> createSelectObatResponse(SelectObatResponse value) {
        return new JAXBElement<SelectObatResponse>(_SelectObatResponse_QNAME, SelectObatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectObat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "selectObat")
    public JAXBElement<SelectObat> createSelectObat(SelectObat value) {
        return new JAXBElement<SelectObat>(_SelectObat_QNAME, SelectObat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteObatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "deleteObatResponse")
    public JAXBElement<DeleteObatResponse> createDeleteObatResponse(DeleteObatResponse value) {
        return new JAXBElement<DeleteObatResponse>(_DeleteObatResponse_QNAME, DeleteObatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateObat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "updateObat")
    public JAXBElement<UpdateObat> createUpdateObat(UpdateObat value) {
        return new JAXBElement<UpdateObat>(_UpdateObat_QNAME, UpdateObat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateObatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "updateObatResponse")
    public JAXBElement<UpdateObatResponse> createUpdateObatResponse(UpdateObatResponse value) {
        return new JAXBElement<UpdateObatResponse>(_UpdateObatResponse_QNAME, UpdateObatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertObat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Services/", name = "insertObat")
    public JAXBElement<InsertObat> createInsertObat(InsertObat value) {
        return new JAXBElement<InsertObat>(_InsertObat_QNAME, InsertObat.class, null, value);
    }

}
