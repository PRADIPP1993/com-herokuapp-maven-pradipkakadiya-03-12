package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@class='radius']/i[1]");

    By VerifyText = By.xpath("//h2[text()=' Secure Area']");
    By ErrorText = By.id("flash");
    By Error1Text = By.id("flash");

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getText(){
        return getTextFromElement(VerifyText);
    }
    public String getErrorText(){
        return getTextFromElement(ErrorText);
    }
    public String getError1Text(){
        return getTextFromElement(Error1Text);
    }
}
