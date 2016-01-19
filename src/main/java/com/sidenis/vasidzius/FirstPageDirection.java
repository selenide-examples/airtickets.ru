package com.sidenis.vasidzius;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.GregorianCalendar;
import java.util.Locale;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

/**
 * Created by VKov on 1/18/2016.
 */
public class FirstPageDirection {

    public void addDirectionFrom(String city, String airport)
    {
        $("#from").setValue(city);
        $("#autocomplete").$(withText(airport)).click();
    }

    public void addDirectionTo(String city, String airport) {
        $("#to").setValue(city);
        $("#autocomplete").$(withText(airport)).click();
    }

    public String getMonthDeparture() {
        return $(".flight_selector_middle_departure").$(".airPlugin_select_text").getText();
    }

    public String getCurrentMonth() {
        Month month = Month.of(new GregorianCalendar().getTime().getMonth() + 1);
        Locale loc = Locale.forLanguageTag("ru");
        return month.getDisplayName(TextStyle.FULL_STANDALONE, loc);
    }

    public String getMonthReturn() {
        return $(".flight_selector_middle_return").$(".flight_selector_middle_departure_return_dropdown1").$(".airPlugin_select_text").getText();
    }

    public int getDayDeparture() {
        return Integer.parseInt($(".flight_selector_middle_departure").$(".flight_selector_middle_departure_return_dropdown2").$(".airPlugin_select_text").getText());
    }

    public int getDayReturn() {
        return Integer.parseInt($(".flight_selector_middle_return").$(".flight_selector_middle_departure_return_dropdown2").$(".airPlugin_select_text").getText());

    }

    public void clickButtonFind() {
        $("#search_button").click();

    }
}
