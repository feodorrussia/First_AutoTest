package org.test;

public class User {
    private final String fullName;
    private final String login;
    private final String password;

    User(String uName, String uLogin, String uPassword){
        fullName = uName;
        login = uLogin;
        password = uPassword;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
