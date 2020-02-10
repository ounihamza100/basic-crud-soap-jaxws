package io.ws.soap;

import sample.user.crud.basic.SampleUser;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hamza Ouni
 */
public class Util {

    public static List<SampleUser> init() {
        //
        SampleUser user = new SampleUser();
        user.setActive(Boolean.TRUE);
        user.setDepartment("Dep 01");
        user.setEmail("user_01@gmail.com");
        user.setEmployeeNumber("0100");
        user.setFirstName("linus");
        user.setId("1");
        user.setLastName("trovalds");
        user.setPhone("23232323");
        user.setLocation("NYC");

        //
        SampleUser user2 = new SampleUser();
        user2.setActive(Boolean.FALSE);
        user2.setDepartment("Dep 02");
        user2.setEmail("user_02@gmail.com");
        user2.setEmployeeNumber("0200");
        user2.setFirstName("josh");
        user2.setId("2");
        user2.setLastName("long");
        user2.setPhone("24232323");
        user2.setLocation("D.C");


        List<SampleUser> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        return users;





    }
}
