package com.demo.nopcommerce.testbase;/*
 *Vinay Creation
 *Date of Creation
 */

import com.demo.nopcommerce.basepage.BasePage;
import com.demo.nopcommerce.browserselector.BrowserSelector;
import com.demo.nopcommerce.loadproperty.Loadproperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase  extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    Loadproperty loadproperty = new Loadproperty();

    String baseUrl = loadproperty.getProperty("baseUrl");
    String browser = loadproperty.getProperty("browser");

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod(groups = {"Regression","Smoke","Sanity"} )
    public void closeBrowser(){
        driver.quit();
    }
}
