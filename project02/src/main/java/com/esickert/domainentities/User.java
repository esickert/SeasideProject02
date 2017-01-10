package com.esickert.domainentities;

/**
 * Created by esickert on 1/1/2017.
 */

public class User {  //a class
//    private String username;
    private String username;
    private String password;


    public User()  {  // a constructor
        username = "username";
        password = "admin";
    }  //end of constructor


    public User(String username,String password)    {  //a Contructor
       this.username = username;
       this.password = password;
    }  //end of constructor

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}  //end of class User
