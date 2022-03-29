package org.test;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage implements LoginPageInterface{
    String xPathNameEmail = "st.email";
    String xPathNamePassword = "st.password";
    String xPathButton = "//*[contains(@class,\"button-pro __wide\")]";

    @Override
    public MainPageInterface login(User user){
        $(By.name(xPathNameEmail)).shouldBe(visible).setValue(user.getLogin());
        $(By.name(xPathNamePassword)).shouldBe(visible).setValue(user.getPassword());
        $(By.xpath(xPathButton)).shouldBe(visible).click();
        return MainFactory.getPage();
    }
}
