package org.test;

public class LoginFactory {
    public static LoginPageInterface getPage(){
        if (isSmthngPresent()){
            return new LoginPage();
        } else{
            return new LoginPage();
        }
    }

    public static boolean isSmthngPresent(){
        //определение версии страницы
        return true;
    }
}
