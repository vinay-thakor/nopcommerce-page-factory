package com.demo.nopcommerce.testsuite;/*
 *Vinay Creation
 *Date of Creation
 */

import com.demo.nopcommerce.pages.AccountPage;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    AccountPage accountPage;
    RegisterPage registerPage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        accountPage = new AccountPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"Regression", "Smoke"})
    public void verifyUserShouldRegisterSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.verifyTextYourPersonalDetails();
        registerPage.selectMaleGenderRadioButton();
        registerPage.selectFemaleGenderRadioButton();
        registerPage.sendTextToFirstNameField("Vinay");
        registerPage.sendTextToLastNameField("Thakor");
        registerPage.selectDayDOBFromDropDownMenu("1");
        registerPage.selectMonthDOBFromDropDownMenu("January");
        registerPage.selectYearDOBFromDropDownMenu("1990");
        registerPage.sendTextToEmailField("abc123@gmail.com");
        registerPage.sendTextToCompanyField("Prime Testing");
        registerPage.selectNewsLetterCheckBox();
        registerPage.sendTextToPasswordField("abcd1234");
        registerPage.sendTextToConfirmPasswordField("abcd1234");
        registerPage.clickOnRegisterButton();

    }
}
