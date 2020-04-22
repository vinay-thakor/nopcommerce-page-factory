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

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());
    //list of elements and their locations
//    By myAccountText = By.cssSelector("a.ico-account");
    @FindBy(css = "a.ico-account")
    WebElement _myAccountTex;

    //methods performing actions on elements
    public String verifyTextMyAccount() {
        Reporter.log("verify text my account  :" + _myAccountTex.toString() + "<br>");
        log.info("Getting text from: " + _myAccountTex.toString());
        return getTextFromElement(_myAccountTex);

    }
}