package com.demo.nopcommerce.testsuite;/*
 *Vinay Creation
 *Date of Creation
 */

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void setUp(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"Regression","Smoke"})
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText,expectedText);
    }

}
