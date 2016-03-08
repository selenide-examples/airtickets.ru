package com.sidenis.vasidzius.ForthPagePassengerInfoElements;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by VKov on 1/18/2016.
 */
public class FramePassengerInfo extends ElementsContainer {

    @FindBy(id="passengerData0.passengerTitle")
    private SelenideElement sex;

    @FindBy(id = "passengerData0.lastName")
    private SelenideElement lastPassengerName;

    @FindBy(id = "passengerData0.firstName")
    private SelenideElement firstPassengerName;

    @FindBy(id = "pd0")
    private SelenideElement dayBirth;

    @FindBy(id = "pm0")
    private SelenideElement monthBirth;

    @FindBy(id = "py0")
    private SelenideElement yearBirth;

    @FindBy(id = "passengerData0.documentNumber")
    private SelenideElement passportNumber;

    @FindBy(id = "ped0")
    private SelenideElement dayExpirationPassport;

    @FindBy(id = "pem0")
    private SelenideElement monthExpirationPassport;

    @FindBy(id = "pey0")
    private SelenideElement yearExpirationPassport;

    public void setSex(String sex) {
        this.sex.selectOptionByValue(sex);
    }

    public void setLastPassengerName(String lastPassengerName) {
        this.lastPassengerName.setValue(lastPassengerName);
    }

    public void setFirstPassengerName(String firstPassengerName) {
        this.firstPassengerName.setValue(firstPassengerName);

    }

    public void setDayBirth(String dayBirth) {
        this.dayBirth.setValue(dayBirth);
    }

    public void setMonthBirth(String monthBirth) {
        this.monthBirth.setValue(monthBirth);
    }

    public void setYearBirth(String yearBirth) {
        this.yearBirth.setValue(yearBirth);
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber.setValue(passportNumber);
    }

    public void setDayExpirationPassport(String dayExpirationPassport) {
        this.dayExpirationPassport.setValue(dayExpirationPassport);
    }

    public void setMonthExpirationPassport(String monthExpirationPassport) {
        this.monthExpirationPassport.setValue(monthExpirationPassport);
    }

    public void setYearExpirationPassport(String yearExpirationPassport) {
        this.yearExpirationPassport.setValue(yearExpirationPassport);
    }
}
