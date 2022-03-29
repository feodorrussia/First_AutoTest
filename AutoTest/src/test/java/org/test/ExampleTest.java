package org.test;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    public void LoginTest() {
        User user = new User("Bla Blabla", "bla1996", "bla_password");
        User user2 = new User("Blabla Bla", "blabla2014", "blabla_password");
        open("https://ok.ru");
        LoginPage lp = new LoginPage();
        MainPage mp = lp.login(user);
        assertNotEquals(mp.getName(), user.getName());
    }
}
