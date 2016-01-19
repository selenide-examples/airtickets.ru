package com.sidenis.vasidzius;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by vkov on 19-Jan-16.
 */
public class FifthPage {

    @FindBy(id = "paymentDetails.creditCardDetails.number")
    private SelenideElement creditCardNumber;

    @FindBy(id = "ed1")
    private SelenideElement monthExpirationCreditCard;

    @FindBy(css = "#btnBuyTicket > div:nth-child(1) > div:nth-child(1)")
    private SelenideElement button;

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber.setValue(creditCardNumber);
    }

    public void setMonthExpirationCreditCard(String monthExpirationCreditCard) {
        this.monthExpirationCreditCard.setValue(monthExpirationCreditCard);
    }

    public SelenideElement getButton() {
        return button;
    }
}
