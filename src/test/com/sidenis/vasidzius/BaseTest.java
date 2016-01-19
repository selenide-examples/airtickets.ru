package com.sidenis.vasidzius;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

/**
 * Created by VKov on 1/18/2016.
 */
public class BaseTest {

    protected WebDriver baseDriver;

    @Before
    public void initializeDriver()
    {
        WebDriverRunner.setWebDriver(new FirefoxDriver());

        //IE
        /*File file = new File("C:/SelDrivers/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriverRunner.setWebDriver(new InternetExplorerDriver());
        */


        //Chrome
        /*File file = new File("C:/SelDrivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        //WebDriverRunner.setWebDriver(new ChromeDriver()); //option 1
        //Configuration.browser="chrome";//option 2*/


        baseDriver = WebDriverRunner.getWebDriver();
    }

    @After
    public void killDriver()
    {
        WebDriverRunner.closeWebDriver();
    }
}
