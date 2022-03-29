package org.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage implements MainPageInterface{
    String xPathName = "//*[contains(@class,\"tico ellip\")]";

    @Override
    public String getName(){
        SelenideElement uName = $(By.xpath(xPathName));
        if (uName.isDisplayed()){
            return uName.shouldBe(visible).getText();
        }
        else {
            System.out.println("log1: Не отображается имя пользователя!");;
            return "";
        }
    }
}
