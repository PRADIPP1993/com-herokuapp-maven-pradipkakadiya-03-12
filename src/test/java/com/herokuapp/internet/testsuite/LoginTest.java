package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.enterEmailId("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        Assert.assertEquals(loginPage.getText(), expectedText, "Verify the text");

    }


    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterEmailId("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Your username is invalid!\n"  +
                "×";
        Assert.assertEquals(loginPage.getErrorText(), expectedText, "Verify the Massage");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterEmailId("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expected1Text = "Your password is invalid!\n"  +
                "×";
        Assert.assertEquals(loginPage.getError1Text(), expected1Text, "Verify the Massage");

    }

}
