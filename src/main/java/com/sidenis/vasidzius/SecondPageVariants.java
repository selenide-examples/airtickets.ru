package com.sidenis.vasidzius;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by VKov on 1/18/2016.
 */
public class SecondPageVariants {

    public void setRandomPriceInfoAndRandomRadioForDepartureAndReturnAndClickReserveButton()
    {
        //get all Price-Info
        sleep(2000);
        List<SelenideElement> priceInfoList = $$(".price-info");
        SelenideElement priceInfo = priceInfoList.get((int)(Math.random() * (priceInfoList.size()-1)));
        //get both Price Table from priceInfo
        List<SelenideElement> priceTableList = priceInfo.$$(".price-table");
        //get Price Table for departure and Return
        SelenideElement priceTableForDeparture = priceTableList.get(0);
        SelenideElement priceTableForReturn = priceTableList.get(1);
        //get all radio for both priceTable
        List<SelenideElement> radioListDeparture = priceTableForDeparture.$$(".radio");
        List<SelenideElement> radioListReturn = priceTableForReturn.$$(".radio");
        //select random radio for both priceTable
        SelenideElement radioDeparture = radioListDeparture.get((int)(Math.random() * (radioListDeparture.size()-1)));
        radioDeparture.click();
        SelenideElement radioReturn = radioListReturn.get((int)(Math.random() * (radioListReturn.size()-1)));
        radioReturn.click();
        //click ReserveButton
        priceInfo.$(".airButton").click();

    }
}
