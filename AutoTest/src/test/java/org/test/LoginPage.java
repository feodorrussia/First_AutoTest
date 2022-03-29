package org.test;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage implements LoginPageInterface{
    final String namePage = "LoginPage_v1.0";
    String xPathNameEmail = "st.email";
    String xPathNamePassword = "st.password";
    String xPathButton = "//*[contains(@class,\"button-pro __wide\")]";

    public MainPage login(User user){
        $(By.name(xPathNameEmail)).shouldBe(visible).setValue(user.getLogin());
        $(By.name(xPathNamePassword)).shouldBe(visible).setValue(user.getPassword());
        $(By.xpath(xPathButton)).shouldBe(visible).click();
        return new MainPage();
    }

    public String getNamePage(){
        return namePage;
    }
}
