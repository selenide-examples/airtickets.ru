package com.sidenis.vasidzius;

import com.sidenis.vasidzius.ForthPagePassengerInfoElements.FrameContactPersonInfo;
import com.sidenis.vasidzius.ForthPagePassengerInfoElements.FramePassengerInfo;
import org.openqa.selenium.support.FindBy;

/**
 * Created by VKov on 1/18/2016.
 */
public class FourthPagePassengerInfo {

    //example of using PageObject and Blocks. Block here are FramePassengerInfo and FrameContactPersonInfo
    @FindBy(xpath = "(.//*[@class='frame'])[1]")
    private FramePassengerInfo passengerInfo;

    @FindBy(xpath = "(.//*[@class='frame'])[2]")
    private FrameContactPersonInfo contactPersonInfo;


    public void setPassengerInfo(String sex, String name, String surname, String dayBirth, String monthBirth, String yearBirth, String passportNumber, String dayExpirationPassport, String monthExpirationPassport, String yearExpirationPassport) {
        passengerInfo.setSex(sex);
        passengerInfo.setFirstPassengerName(name);
        passengerInfo.setLastPassengerName(surname);
        passengerInfo.setDayBirth(dayBirth);
        passengerInfo.setMonthBirth(monthBirth);
        passengerInfo.setYearBirth(yearBirth);
        passengerInfo.setPassportNumber(passportNumber);
        passengerInfo.setDayExpirationPassport(dayExpirationPassport);
        passengerInfo.setMonthExpirationPassport(monthExpirationPassport);
        passengerInfo.setYearExpirationPassport(yearExpirationPassport);
    }

    public void setContactPersonInfo(String city, String mobileNumber, String emailAddress) {
        contactPersonInfo.setCityContactPerson(city);
        contactPersonInfo.setMobPhoneContactPerson(mobileNumber);
        contactPersonInfo.setEmailContactPerson(emailAddress);
    }

    public void clickNext() {
        contactPersonInfo.getNext().click();
    }
}
