
package sample.user.crud.basic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sample.user.crud.basic package. 
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

    private final static QName _SampleUser_QNAME = new QName("http://basic.crud.user.sample", "sampleUser");
    private final static QName _UpdateResponse_QNAME = new QName("http://basic.crud.user.sample", "updateResponse");
    private final static QName _DeleteRequest_QNAME = new QName("http://basic.crud.user.sample", "deleteRequest");
    private final static QName _StatusCode_QNAME = new QName("http://basic.crud.user.sample", "statusCode");
    private final static QName _Status_QNAME = new QName("http://basic.crud.user.sample", "status");
    private final static QName _CreateResponse_QNAME = new QName("http://basic.crud.user.sample", "createResponse");
    private final static QName _CreateRequest_QNAME = new QName("http://basic.crud.user.sample", "createRequest");
    private final static QName _ReadRequest_QNAME = new QName("http://basic.crud.user.sample", "readRequest");
    private final static QName _DeleteResponse_QNAME = new QName("http://basic.crud.user.sample", "deleteResponse");
    private final static QName _ReadResponse_QNAME = new QName("http://basic.crud.user.sample", "readResponse");
    private final static QName _UpdateRequest_QNAME = new QName("http://basic.crud.user.sample", "updateRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sample.user.crud.basic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadResponse }
     * 
     */
    public ReadResponse createReadResponse() {
        return new ReadResponse();
    }

    /**
     * Create an instance of {@link UpdateRequest }
     * 
     */
    public UpdateRequest createUpdateRequest() {
        return new UpdateRequest();
    }

    /**
     * Create an instance of {@link CreateRequest }
     * 
     */
    public CreateRequest createCreateRequest() {
        return new CreateRequest();
    }

    /**
     * Create an instance of {@link ReadRequest }
     * 
     */
    public ReadRequest createReadRequest() {
        return new ReadRequest();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link SampleUser }
     * 
     */
    public SampleUser createSampleUser() {
        return new SampleUser();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link DeleteRequest }
     * 
     */
    public DeleteRequest createDeleteRequest() {
        return new DeleteRequest();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SampleUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "sampleUser")
    public JAXBElement<SampleUser> createSampleUser(SampleUser value) {
        return new JAXBElement<SampleUser>(_SampleUser_QNAME, SampleUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "deleteRequest")
    public JAXBElement<DeleteRequest> createDeleteRequest(DeleteRequest value) {
        return new JAXBElement<DeleteRequest>(_DeleteRequest_QNAME, DeleteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "statusCode")
    public JAXBElement<StatusCode> createStatusCode(StatusCode value) {
        return new JAXBElement<StatusCode>(_StatusCode_QNAME, StatusCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<CreateResponse>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "createRequest")
    public JAXBElement<CreateRequest> createCreateRequest(CreateRequest value) {
        return new JAXBElement<CreateRequest>(_CreateRequest_QNAME, CreateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "readRequest")
    public JAXBElement<ReadRequest> createReadRequest(ReadRequest value) {
        return new JAXBElement<ReadRequest>(_ReadRequest_QNAME, ReadRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "readResponse")
    public JAXBElement<ReadResponse> createReadResponse(ReadResponse value) {
        return new JAXBElement<ReadResponse>(_ReadResponse_QNAME, ReadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://basic.crud.user.sample", name = "updateRequest")
    public JAXBElement<UpdateRequest> createUpdateRequest(UpdateRequest value) {
        return new JAXBElement<UpdateRequest>(_UpdateRequest_QNAME, UpdateRequest.class, null, value);
    }

}
