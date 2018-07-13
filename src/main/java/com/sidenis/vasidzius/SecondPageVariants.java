package com.sidenis.vasidzius;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
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
        ElementsCollection radioList = priceTable.$$(".radio");
        radioList.shouldHave(CollectionCondition.sizeGreaterThan(1));
        
        //select random radio
        return radioList.get((int)(Math.round(Math.random() * (radioList.size()-1))));
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
        return priceInfo.find(".price-table");
    }

    private SelenideElement getRandomPriceInfo()
    {
        //get all Price-Info
        List<SelenideElement> priceInfoList = $$(".price-info");
        SelenideElement priceInfo = priceInfoList.get((int)(Math.random() * (priceInfoList.size()-1)));
        return priceInfo;
    }
}
