package com.demo.nopcommerce.pages;/*
 *Vinay Creation
 *Date of Creation
 */

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//div[@class='page-body']//strong[text()='Your Personal Details']")
    WebElement _textYourPersonalDetails;
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement _maleGenderBtn;
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement _femaleGenderBtn;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement _firstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement _lastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement _dayDOBDropDownMenu;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement _monthDOBDropDownMenu;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement _yearDOBDropDownMenu;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement _emailField;
    @FindBy(id = "Company")
    WebElement _companyNameField;
    @FindBy(css = "input#Newsletter")
    WebElement _newsLetterCheckedBox;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement _passwordField;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement _conformPassWordField;
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement _registerBtn;

    //methods performing actions on elements
    public String verifyTextYourPersonalDetails() {
        waitUntilPresenceOfElementLocated(By.xpath("//div[@class='page-body']//strong[text()='Your Personal Details']"),40);
        Reporter.log("Verify Personal Details :" + _textYourPersonalDetails.toString() + "<br>");
        log.info("Verify Personal Details :" + _textYourPersonalDetails.toString());
        return getTextFromElement(_textYourPersonalDetails);

    }
    public void selectMaleGenderRadioButton() {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='gender-male']"),40);
        Reporter.log("Clicking on Male Gender Redio Button button" + _maleGenderBtn.toString() + "<br>");
        radioButtonClick(_maleGenderBtn);
        log.info("Click on Male Gender Redio button " + _maleGenderBtn.toString());
    }

    public void selectFemaleGenderRadioButton() {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='gender-female']"),40);
        Reporter.log("clicking on Female Gender button : " + _femaleGenderBtn.toString() + "<br");
        radioButtonClick(_femaleGenderBtn);
        log.info("clicking on Female Gender button : " + _femaleGenderBtn.toString());
    }

    public void sendTextToFirstNameField(String firstName) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='LastName']"),30);
        Reporter.log("Enter your First Name " + firstName+ "to first name field : " + _firstName.toString() + "<br>");
       // sendTextToElement(_firstName, string);
        sendTextToElement(_firstName,firstName);
        log.info("Enter your First Name " + firstName + "to first name field : " + _firstName.toString());
    }

    public void sendTextToLastNameField(String lastName ) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='LastName']"),30);
        Reporter.log("Enter your LastName :" + lastName + "to last name field : " + _lastName.toString() + "<br>");
        sendTextToElement(_lastName, lastName);
        log.info("Enter your LastName :" + lastName + "to last name field : " + _lastName.toString());
    }

    public void selectDayDOBFromDropDownMenu(String value) {
        waitUntilPresenceOfElementLocated(By.xpath("//select[@name='DateOfBirthDay']"),40);
        Reporter.log("Select Day of Birth :" + value + "from the drop down list : " + _dayDOBDropDownMenu.toString() + "<br>");
        selectByValueFromDropDown(_dayDOBDropDownMenu, value);
        log.info("Select Day of Birth :" + value + "from the drop down list : " + _dayDOBDropDownMenu.toString());

    }

    public void selectMonthDOBFromDropDownMenu(String month) {
        waitUntilPresenceOfElementLocated(By.xpath("//select[@name='DateOfBirthYear']"),40);
        Reporter.log("Select Month of  Year :" + month + "from the dropdown list : " + _monthDOBDropDownMenu.toString() + "<br>");
        selectByVisibleTextFromDropDown(_monthDOBDropDownMenu, month);
        log.info("Select Month of  Year :" + month + "from the dropdown list : " + _monthDOBDropDownMenu.toString());
    }

    public void selectYearDOBFromDropDownMenu(String year) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='Email']"),40);
        Reporter.log("Select Your of Birth" + year + "year from drop down list" + _yearDOBDropDownMenu.toString() + "<br>");
        selectByValueFromDropDown(_yearDOBDropDownMenu, year);
        log.info("Select Your of Birth" + year + "year from drop down list" + _yearDOBDropDownMenu.toString());
    }

    public void sendTextToEmailField(String emil) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='Email']"),40);
        Reporter.log("Enter Email" + emil + "to email field" + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, emil);
        log.info("Enter Email" + emil + "to email field" + _emailField.toString());
    }

    public void sendTextToCompanyField(String companyName) {
        waitUntilPresenceOfElementLocated(By.id("Company"),40);
        Reporter.log("Enter Company Name :" + companyName + "to company name field" + _companyNameField.toString() + "<br>");
        sendTextToElement(_companyNameField, companyName);
        log.info("Enter Company Name :" + companyName + "to company name field" + _companyNameField.toString());
    }


    public void selectNewsLetterCheckBox() {
        waitUntilPresenceOfElementLocated(By.cssSelector("input#Newsletter"),40);
        Reporter.log("News letter box : " + _newsLetterCheckedBox.toString() + "<br>");
        elementIsSelected(_newsLetterCheckedBox);
        Reporter.log("News letter box : " + _newsLetterCheckedBox.toString());
    }

    public void sendTextToPasswordField(String password) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='Password']"),40);
        Reporter.log("Enter your password : " + password + "to password field" + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Enter your password : " + password + "to password field" + _passwordField.toString());
    }

    public void sendTextToConfirmPasswordField(String conformPassword) {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='ConfirmPassword']"),40);
        Reporter.log("Please conform your password : " + conformPassword + "to comform password field" + _conformPassWordField + "<br>");
        sendTextToElement(_conformPassWordField, conformPassword);
        log.info("Please conform your password : " + conformPassword + "to comform password field" + _conformPassWordField);
    }

    public void clickOnRegisterButton() {
        waitUntilPresenceOfElementLocated(By.xpath("//input[@id='register-button']"),40);
        Reporter.log("Click on register button --->" + _registerBtn.toString() + "<br>");
        clickOnElement(_registerBtn);
        log.info("Click on register button --->" + _registerBtn.toString());
    }
}
