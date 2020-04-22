package com.demo.nopcommerce.basepage;/*
 *Vinay Creation
 *Date of Creation
 */

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public static WebDriver driver;

    public BasePage(){
        //this is for log4j
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/demo/nopcommerce/resources/properties/log4j.properties");
        //this is for pagefactory
        PageFactory.initElements(driver,this);

    }
}
