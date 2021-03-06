package io.ws.soap;

import io.ws.soap.exceptions.BasicCrudSOAPFaultException;
import io.ws.soap.exceptions.UserAlreadyExistException;
import io.ws.soap.exceptions.UserInvalidPropertiesException;
import io.ws.soap.exceptions.UserNotFoundException;
import sample.user.crud.basic.*;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Hamza Ouni
 */
@WebService(endpointInterface = "sample.user.crud.basic.CrudPort"
        , name = "DefaultCrudService"
        , serviceName = "DefaultCrudService"
        , targetNamespace = "http://basic.crud.user.sample"
)
public class DefaultCrudService implements CrudPort {

    private final static String SERVICE = "CrudService";

    private List<SampleUser> users;


    public DefaultCrudService() {
        users = Util.init();
    }

    @Override
    public ReadResponse read(ReadRequest request) throws SOAPException {
        String idUser = request.getId();
        List<SampleUser> result = users.stream().filter(user -> user.getId().equals(idUser)).collect(Collectors.toList());
        if (result.isEmpty()) {
            throw new BasicCrudSOAPFaultException(
                    BasicCrudSOAPFaultException
                            .getSoapFactory()
                            .createFault(
                                    new UserNotFoundException("Unable to find user with id: " + idUser + "").getMessage(),
                                    new QName("http://schemas.xmlsoap.org/soap/envelope/", SERVICE)));
        }
        SampleUser user = result.get(0);
        ReadResponse readResponse = new ReadResponse();
        readResponse.setUser(user);

        Status status = new Status();
        status.setMessage("Success");
        status.setStatus(StatusCode.OK);
        return null;
    }

    @Override
    public CreateResponse create(CreateRequest request) throws SOAPException {
        SampleUser user = request.getUser();
        if (user.getId() == null || user.getFirstName() == null || user.getLastName() == null) {
            throw new BasicCrudSOAPFaultException(
                    BasicCrudSOAPFaultException
                            .getSoapFactory()
                            .createFault(
                                    new UserInvalidPropertiesException("User properties are invalid: " +
                                            "Check  user's id , firstname or lastname properties").getMessage(),
                                    new QName("http://schemas.xmlsoap.org/soap/envelope/", SERVICE)));
        }
        //check if there is a user with the same id
        Optional<SampleUser> result = users
                .stream()
                .filter(item -> item.getId().equals(user.getId())).findFirst();
        if (result.isPresent()) {
            throw new UserAlreadyExistException();
        }


        users.add(user);
        CreateResponse response = new CreateResponse();
        Status status = new Status();
        status.setMessage("Success");
        status.setStatus(StatusCode.OK);
        response.setStatus(status);
        return response;
    }

    @Override
    public UpdateResponse update(UpdateRequest request) {
        SampleUser source = request.getUser();
        String idUser = source.getId();
        List<SampleUser> result = users.stream().filter(x -> x.getId().equals(idUser)).collect(Collectors.toList());
        UpdateResponse response = new UpdateResponse();
        Status status = new Status();
        if (result.isEmpty()) {
            status.setMessage("Error : user not found!");
            status.setStatus(StatusCode.ERROR);
            response.setStatus(status);
            return response;
        }
        SampleUser target = new SampleUser();
        response = updateUser(source, target, response);
        return response;
    }

    @Override
    public DeleteResponse delete(DeleteRequest request) {
        DeleteResponse response = new DeleteResponse();
        String idUser = request.getId();
        List<SampleUser> result = users.stream().filter(user -> user.getId().equals(idUser)).collect(Collectors.toList());
        Status status = new Status();
        if (result.isEmpty()) {
            status.setMessage("Error : can't delete user, verify user id is correct!");
            status.setStatus(StatusCode.ERROR);
            response.setStatus(status);
            return response;
        }
        status.setMessage("Success : The user has been deleted successfully");
        status.setStatus(StatusCode.OK);
        response.setStatus(status);
        return response;
    }


    public List<SampleUser> getUsers() {
        return users;
    }

    public void setUsers(List<SampleUser> users) {
        this.users = users;
    }

    private UpdateResponse updateUser(SampleUser source, SampleUser target, UpdateResponse response) {

        Status status = new Status();
        if (source.getFirstName() == null || source.getLastName() == null) {
            status.setMessage("Error : missing properties!");
            status.setStatus(StatusCode.ERROR);
            response.setStatus(status);
            return response;
        }
        target.setActive(source.isActive());
        target.setDepartment(source.getDepartment());
        target.setEmail(source.getEmail());
        target.setEmployeeNumber(source.getEmployeeNumber());
        target.setFirstName(source.getFirstName());
        target.setId(source.getId());
        target.setLastName(source.getLastName());
        target.setPhone(source.getPhone());
        target.setLocation(source.getLocation());
        target.setMobilePhone(source.getMobilePhone());
        status.setMessage("Success");
        status.setStatus(StatusCode.OK);
        response.setStatus(status);
        return response;

    }
}
