package com.sidenis.vasidzius;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by VKov on 1/18/2016.
 * Here you can choose different browsers
 */
public class BaseTest {

    protected WebDriver baseDriver;

    @Before
    public void initializeDriver()
    {
        WebDriverRunner.setWebDriver(new FirefoxDriver());

        //IE. there are a lot of trubles with using IE. If you choose this browser, you have to add sleep() before actions and other things. I didn't do this
        /*File file = new File("C:/SelDrivers/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriverRunner.setWebDriver(new InternetExplorerDriver());*/

        //Chrome
        /*File file = new File("C:/SelDrivers/chromedriver.exe");//add your path to chromedriver
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
