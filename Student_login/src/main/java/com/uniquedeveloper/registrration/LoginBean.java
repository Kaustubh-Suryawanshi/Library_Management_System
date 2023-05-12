package com.uniquedeveloper.registrration;
import java.io.Serializable;

public class LoginBean implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String uname;
    private String upsd;

    public String getUsername() {
        return uname;
    }

    public void setUsername(String uname) {
        this.uname = uname;
    }
    public void setPassword(String upsd)
    {
    	this.upsd=upsd;
    }

    public String getPassword() {
        return upsd;
    }

   

}
