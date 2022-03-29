package org.test;

import org.openqa.selenium.By;

import java.util.NoSuchElementException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    String xPathName = "//*[contains(@class,\"tico ellip\")]";

    public String getName(){
        try {
            return $(By.xpath(xPathName)).shouldBe(visible).getText();
        } catch (NoSuchElementException e) {
            System.out.println("Не отображается имя пользователя!");;
            return "";
        }
    }
}
