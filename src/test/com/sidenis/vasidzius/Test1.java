package com.sidenis.vasidzius;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.*;

/**
 * Created by VKov on 1/18/2016.
 */
public class Test1 extends BaseTest {

    @Test
    public void test1()
    {
        //open("http://www.airtickets.ru/bileti-aeroflot?gclid=CNzJ_-DQw8UCFcL3cgodeKwA0w");

        //work with First Page
        FirstPageDirection firstPageDirection = open("http://www.airtickets.ru/bileti-aeroflot?gclid=CNzJ_-DQw8UCFcL3cgodeKwA0w", FirstPageDirection.class);
        firstPageDirection.addDirectionFrom("Санкт");
        firstPageDirection.addDirectionTo("Москва");
        Assert.assertEquals("Месяц отправления равен текущему месяцу", firstPageDirection.getMonthDeparture(), firstPageDirection.getCurrentMonth());
        Assert.assertEquals("Месяц прибытия равен текущему месяцу", firstPageDirection.getMonthReturn(), firstPageDirection.getCurrentMonth());
        Assert.assertTrue("День отрпавления меньше дня возвращения", firstPageDirection.getDayDeparture() < firstPageDirection.getDayReturn());
        firstPageDirection.clickButtonFind();

        //SecondPageVariants secondPage = page(SecondPageVariants.class);

        //work with second page
        SecondPageVariants secondPageVariants = page(SecondPageVariants.class);
        secondPageVariants.setRandomPriceInfoAndRandomRadioForDepartureAndReturnAndClickReserveButton();

        //work with third page
        ThirdPageConfirmation thirdPageConfirmation = page(ThirdPageConfirmation.class);
        thirdPageConfirmation.clickConfirmationReserve();

        //work with forth page
        ForthPagePassengerInfo forthPagePassengerInfo = page(ForthPagePassengerInfo.class);
        forthPagePassengerInfo.setPassengerInfo("Mr","Vasiliy", "Kovalchenko", "7", "2", "1986", "4006875145", "12","10","2017");




    }
}
