package com.esickert.domainentities;

/**
 * Created by esickert on 1/1/2017.
 */

public class User {  //a class
//    private String username;
    private String username;
//    private String password;
    private String password;


    public User()  {  // a constructor
        username = "username";
        password = "password";
    }  //end of constructor


    public User(String username,String password)    {
       this.username = username;
       this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}  //end of class User
