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

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
//    By computerTab = By.xpath("//ul[@class='top-menu notmobile']/li[1]/a");
//    By registerLink = By.xpath("//div[@class='header-links-wrapper']//a[contains(text(),'Register')]");
//    By logInLink = By.cssSelector("a.ico-login");


    @FindBy(css = "a.ico-login")
    WebElement _loginLink;

    @FindBy(xpath = "//div[@class='header-links-wrapper']//a[contains(text(),'Register')]")
    WebElement _registerLink;

    //this method will clicking on login Link
    public void clickOnLoginLink() {
        Reporter.log("clicking On Login Link : " + _loginLink.toString() + "<br>");
        clickOnElement(_loginLink);
        log.info("clicking On Login Link : " + _loginLink.toString());
    }

    //this method will clicking on register link
    public void clickOnRegisterLink() {
        Reporter.log("click On Register: " + _registerLink.toString() + "<br>");
        clickOnElement(_registerLink);
        log.info("click On Register: " + _registerLink.toString());
    }

}

