package com.sidenis.vasidzius;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by vkov on 19-Jan-16.
 */
public class TestTestExample2 {

    @FindBy(id = "to")
    SelenideElement to;

    @FindBy(className = "flight_selector_middle_departure_return_dropdown1")
    ElementsCollection elements;

    @FindBy(css = ".flight_selector_middle_departure_return_dropdown1")
    SelenideElement element1;

    @FindBy(xpath = "(.//*[@class='frame'])[1]")
    SelenideElement element11;
    //.//*[@class='.flight_selector_middle_departure_return_dropdown1']


    @Test
    public void test2()
    {
        open("http://www.airtickets.ru/bileti-aeroflot?gclid=CNzJ_-DQw8UCFcL3cgodeKwA0w");
        TestTestExample2 page = page(TestTestExample2.class);

        int n = 0;


    }
}
