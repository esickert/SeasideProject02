package com.esickert.domainentities;

/**
 * Created by esickert on 1/1/2017.
 */

public class User implements Stuff{  //a class
//    private String username;
    private String username;
    private String password;
    private String url;


    public User()  {  // a constructor
        username = "username";
        password = "admin";
        url = "10.1.1.1";
    }  //end of constructor


    public User(String username,String password)    {  //a Contructor
       this.username = username;
       this.password = password;
    }  //end of constructor

    

    public String getPassword(){
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username)    {
        this.username = username;
    }

    public String getUrl()    {
        return url;
    }

}  //end of class User
