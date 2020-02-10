package io.ws.soap;

import io.ws.soap.exceptions.BasicCrudSOAPFaultException;
import io.ws.soap.exceptions.UserNotFoundException;
import sample.user.crud.basic.*;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Hamza Ouni
 */
@WebService(endpointInterface = "sample.user.crud.basic.CrudPort"
        , name = "CrudService"
        , serviceName = "CrudService"
        , targetNamespace = "http://jetherrodrigues.com/jaxws/calculator"
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
        if(result.isEmpty()) {
            throw new BasicCrudSOAPFaultException(
                    BasicCrudSOAPFaultException
                    .getSoapFactory()
                    .createFault(
                            new UserNotFoundException("Unable to find user with id: " +  idUser + "" ).getMessage(),
                            new QName("http://schemas.xmlsoap.org/soap/envelope/", SERVICE)));
        }

        return null;
    }

    @Override
    public CreateResponse create(CreateRequest request) {
        return null;
    }

    @Override
    public UpdateResponse update(UpdateRequest request) {
        return null;
    }

    @Override
    public DeleteResponse delete(DeleteRequest request) {
        return null;
    }


    public List<SampleUser> getUsers() {
        return users;
    }

    public void setUsers(List<SampleUser> users) {
        this.users = users;
    }
}
