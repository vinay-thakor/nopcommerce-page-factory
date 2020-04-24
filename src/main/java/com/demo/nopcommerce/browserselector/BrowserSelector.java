package com.demo.nopcommerce.browserselector;/*
 *Vinay Creation
 *Date of Creation
 */

import com.demo.nopcommerce.basepage.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends BasePage {

    public String projectPath = System.getProperty("user.dir");

    //adding variable for Log4j
    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            log.info("Chrome browser selected");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            log.info("firefox browser selected");
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new InternetExplorerDriver();
            log.info("IE browser selected");
        } else {
            System.out.println("Wrong browser name");
            log.info("Wrong browser selected");

        }
    }
}
