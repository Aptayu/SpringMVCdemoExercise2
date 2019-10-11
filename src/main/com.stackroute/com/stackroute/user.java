package com.stackroute;

import org.springframework.stereotype.Controller;

public class user {
    private String password;
    private String Name;



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    @Override
    public String toString() {
        return Name ;
    }
}
