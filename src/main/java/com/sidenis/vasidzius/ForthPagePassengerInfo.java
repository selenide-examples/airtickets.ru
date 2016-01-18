package com.sidenis.vasidzius;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by VKov on 1/18/2016.
 */
public class ForthPagePassengerInfo {

    @FindBy(className = "frame")
    List<Frame> frameList;

    public void setPassengerInfo(String sex, String name, String surname, String dayBirth, String monthBirth, String yearBirth, String passportNumber, String dayExpirationPassport, String monthExpirationPassport, String yearExpirationPassport) {

    }
}
