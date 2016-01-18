package com.sidenis.vasidzius;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


/**
 * Created by VKov on 1/18/2016.
 */
public class TestTestExample {

    @Test
    public void testTest()
    {
        /*WebDriver driver;
        File file = new File("C:/SelDrivers/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        driver = new InternetExplorerDriver();*/


        //WebDriverRunner.setWebDriver(new InternetExplorerDriver());
        //WebDriverRunner.setWebDriver(new ChromeDriver());

        /*File file = new File("C:/SelDrivers/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        Configuration.browser="ie";*/

        File file = new File("C:/SelDrivers/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriverRunner.setWebDriver(new InternetExplorerDriver());

        open("http://www.yandex.ru");
        //$("#text").sendKeys("hello"); //медленный ввод
        Configuration.fastSetValue = true;
        $("#text").setValue("hello");
        $(".suggest2-form__button").click();
    }
}
