package org.test;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    String xPathName = "//*[contains(@class,\"tico ellip\")]";

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
