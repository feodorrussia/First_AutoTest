package org.test;

public class MainFactory {
    public static MainPageInterface getPage(){
        if (isSmthngPresent()){
            return new MainPage();
        } else{
            return new MainPage();
        }
    }

    public static boolean isSmthngPresent(){
        //определение версии страницы
        return true;
    }
}
