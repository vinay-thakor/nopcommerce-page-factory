package com.demo.nopcommerce.pages;/*
 *Vinay Creation
 *Date of Creation
 */

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(css = "input#Email")
    WebElement _emialField;

    @FindBy(css = "input.password")
    WebElement _Password;

    @FindBy(css = "input.button-1.login-button")
    WebElement _loginBtn;

    @FindBy(css = "div.page-title")
    WebElement _welComeText;

    //Enter email address
    public void enterEmailId(String emil) {
        Reporter.log("Enter email : " + emil + "to email field " + _emialField.toString() + "<br>");
        sendTextToElement(_emialField, emil);
        log.info("Enter email : " + emil + "to email field " + _emialField.toString());
    }
    //Enter password

    public void enterPassword(String password) {
        Reporter.log("Enter password : " + password + "to Password field " + _Password.toString() + "<br>");
        sendTextToElement(_Password, password);
        log.info("Enter password : " + password + "to Password field " + _Password.toString());
    }

    //this method will click on the login button
    public void clickOnLoginBtn() {
        Reporter.log("Click on login Button : " + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("Click on login Button : " + _loginBtn.toString());
    }

    public String getWelcomeText() {
        Reporter.log("Getting text from : " + _welComeText.toString() + "<br>");
        log.info("Getting text from : " + _welComeText.toString());
        return getTextFromElement(_welComeText);

    }
}












