package org.test;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void LoginTestEQ() {
        User user1 = new User("Alan Rick", "bla1996@gmail.ru", "bla_password1234");
        User user = new User("Bla Blabla", "+79631074312", "m123467890");
        open("https://ok.ru");
        LoginPage lp = new LoginPage();
        MainPage mp = lp.login(user);
        assertEquals(mp.getName(), user.getName());
        closeWebDriver();
    }

    @Test
    public void LoginTestNotEQ(){
        User user = new User("Alan Rick", "bla1996@gmail.ru", "bla_password1234");
        open("https://ok.ru");
        LoginPage lp = new LoginPage();
        MainPage mp = lp.login(user);
        assertNotEquals(mp.getName(), user.getName());
        closeWebDriver();
    }
}
