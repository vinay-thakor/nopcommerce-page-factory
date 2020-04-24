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

    @FindBy(css = "a.ico-account")
    WebElement _myAccountTex;

    //methods performing actions on elements

    public void verifyMyAccountText(String myAccTxt) {
        Reporter.log(" Verify text: " + myAccTxt + " is displayed on the Account Page " + _myAccountTex.toString() + "<br>");
        verifyTextAssertMethod(_myAccountTex, myAccTxt);
        log.info("Verify text: " + myAccTxt + " is displayed on the Account Page " + _myAccountTex.toString());
    }


}