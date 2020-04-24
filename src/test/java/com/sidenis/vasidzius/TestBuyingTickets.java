package com.sidenis.vasidzius;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.page;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.Is.is;

public class TestBuyingTickets extends TestBase {

    @Test
    public void testBuyingTickets()
    {

        //work with First Page
        FirstPageDirection firstPageDirection = Selenide.open("https://www.airtickets.ru/bileti-aeroflot?gclid=CNzJ_-DQw8UCFcL3cgodeKwA0w", FirstPageDirection.class);
        firstPageDirection.addDirectionFrom("Санкт", "LED");
        firstPageDirection.addDirectionTo("Москва", "MOW");
        Assert.assertThat("Месяц отправления не равен текущему месяцу или следующему месяцу", firstPageDirection.getMonthDeparture(), anyOf(is(firstPageDirection.getCurrentMonth()), is(firstPageDirection.getNextMonth())));
        Assert.assertThat("Месяц прибытия не равен текущему или следующему месяцу", firstPageDirection.getMonthReturn(), anyOf(is(firstPageDirection.getCurrentMonth()), is(firstPageDirection.getNextMonth())));
        Assert.assertTrue("День отрпавления больше дня возвращения", firstPageDirection.getDayDeparture() < firstPageDirection.getDayReturn());
        firstPageDirection.clickButtonFind();

        //work with second page
        //sometimes the Service on third page says "The flight unavailable, please ..." so I add flag and use COndition from Selenide
        boolean flag = true;
        while(flag) {

            SecondPageVariants secondPageVariants = page(SecondPageVariants.class);
            secondPageVariants.setRandomPriceInfoAndRandomRadioForDepartureAndReturnAndClickReserveButton();
            RareAppearPageBetweenSecondAndThirdPages rarePage = page(RareAppearPageBetweenSecondAndThirdPages.class);

            if(rarePage.errorButtonMessage.exists())
            {
                rarePage.errorButtonMessage.click();
            }
            else
                flag = false;

        }
        //work with third page
        ThirdPageConfirmation thirdPageConfirmation = page(ThirdPageConfirmation.class);
        thirdPageConfirmation.clickConfirmationReserve();

        //work with forth page
        FourthPagePassengerInfo forthPagePassengerInfo = page(FourthPagePassengerInfo.class);
        forthPagePassengerInfo.setPassengerInfo("Mr","Vasiliy", "Kovalchenko", "7", "2", "1986", "4006875145", "12","10","2017");
        forthPagePassengerInfo.setContactPersonInfo("SaintPetersburg", "9054568798", "ivan@gmail.com");
        forthPagePassengerInfo.clickNext();

        //work with FifthPage
        FifthPage fifthPage = page(FifthPage.class);
        fifthPage.setCreditCardNumber("5213456578981234");
        fifthPage.setMonthExpirationCreditCard("02");
        fifthPage.getButton().shouldBe(Condition.visible);
    }
}
