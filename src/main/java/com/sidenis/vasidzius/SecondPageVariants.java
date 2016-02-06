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
        sleep(2000);//if delete this the calculation will not be done. I dont know why
        SelenideElement priceInfo = getRandomPriceInfo();
        SelenideElement priceTableForDeparture = getPriceTableForDeparture(priceInfo);
        SelenideElement priceTableForReturn = getPriceTableForReturn(priceInfo);
        SelenideElement radioDeparture = getRandomRadio(priceTableForDeparture);
        radioDeparture.click();
        SelenideElement radioReturn = getRandomRadio(priceTableForReturn);
        radioDeparture.click();
        radioReturn.click();

        priceInfo.$(".airButton").click();
    }

    private SelenideElement getRandomRadio(SelenideElement priceTable) {
        //get all radio for priceTable
        List<SelenideElement> radioList = priceTable.$$(".radio");
        //select random radio
        SelenideElement radio = radioList.get((int)(Math.random() * (radioList.size()-1)));
        return radio;
    }

    private SelenideElement getPriceTableForReturn(SelenideElement priceInfo)
    {
        //get both Price Table from priceInfo
        List<SelenideElement> priceTableList = priceInfo.$$(".price-table");
        return priceTableList.get(1);
    }

    private SelenideElement getPriceTableForDeparture(SelenideElement priceInfo)
    {
        //get both Price Table from priceInfo
        List<SelenideElement> priceTableList = priceInfo.$$(".price-table");
        return priceTableList.get(0);
    }

    private SelenideElement getRandomPriceInfo()
    {
        //get all Price-Info
        List<SelenideElement> priceInfoList = $$(".price-info");
        SelenideElement priceInfo = priceInfoList.get((int)(Math.random() * (priceInfoList.size()-1)));
        return priceInfo;
    }
}
