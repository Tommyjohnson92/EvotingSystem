package com.example.evotingsystem;

public class loginForm {
    private String userName;
    private String password;

    public loginForm() {

    }

    public loginForm(String userName, //
                       String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
