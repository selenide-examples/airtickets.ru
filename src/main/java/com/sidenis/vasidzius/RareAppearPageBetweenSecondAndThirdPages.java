package com.sidenis.vasidzius;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vasiliy on 06.02.2016.
 */
public class RareAppearPageBetweenSecondAndThirdPages {

    @FindBy(css = "#content > div:nth-child(3) > a:nth-child(1)")
    SelenideElement errorButtonMessage;

}
