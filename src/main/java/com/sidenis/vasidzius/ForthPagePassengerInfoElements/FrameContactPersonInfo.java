package com.sidenis.vasidzius.ForthPagePassengerInfoElements;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vkov on 19-Jan-16.
 */
public class FrameContactPersonInfo extends ElementsContainer {

    @FindBy(id = "contactDetails.address.city")
    private SelenideElement cityContactPerson;

    @FindBy(id = "contactDetails.emailAddress")
    private SelenideElement emailContactPerson;

    @FindBy(id = "cdmpn2")
    private SelenideElement mobPhoneContactPerson;

    @FindBy(className = "airButton")
    private SelenideElement next;

    public void setCityContactPerson(String cityContactPerson) {
        this.cityContactPerson.setValue(cityContactPerson);
    }

    public void setEmailContactPerson(String emailContactPerson) {
        this.emailContactPerson.setValue(emailContactPerson);
    }

    public void setMobPhoneContactPerson(String mobPhoneContactPerson) {
        this.mobPhoneContactPerson.setValue(mobPhoneContactPerson);
    }

    public SelenideElement getNext() {
        return next;
    }

}
