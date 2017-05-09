package com;

import com.esickert.domainentities.EmptyUser;
import  com.esickert.domainentities.User;
//import com.esickert.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import com.esickert.domainentities.User;

/**
 * Created by esickert on 1/1/2017.
 */
public class UserTest {

    @Test
    public void canConstructNewUser()   {
        User user = new User();
        System.out.println("First instance of 'user'");
    }

    @Test
    public void userHasDefaultValues() {

        User user = new User();

/*        Assert.assertEquals("Default username expectred",
                "username",
                user.getUsername());

        Assert.assertEquals("Default password expected",
                "password",
                user.getPassword()); */

        assertEquals("another username expected",
                "username",
                user.getUsername());

        assertEquals("and another password",
                "admin",
                user.getPassword());
    }

    @Test
    public void defineUsernameAndPasswordTest() {

        User user = new User("erich","admin");

        assertEquals("new usernamne",
                "erich",
                user.getUsername());
        System.out.println(user.getUsername());

        assertEquals("new password",
                "admin",
                user.getPassword());
        System.out.println(user.getPassword());
    }

    @Test
    public void canSetPassword() {

        User user = new User();

        user.setPassword("hello");

        assertEquals("We are changing password",
                "hello",
                user.getPassword());
        System.out.println("New password is: " + user.getPassword());
    }

    @Test
    public void emptyUserExampleTest()  {
        EmptyUser me = new EmptyUser();
        assertEquals("usernme", me.getUsername());
        assertEquals("password", me.getPassword());
    }

}





