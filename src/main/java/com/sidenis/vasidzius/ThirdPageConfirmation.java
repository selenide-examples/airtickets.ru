package com.sidenis.vasidzius;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by VKov on 1/18/2016.
 */
public class ThirdPageConfirmation {
    public void clickConfirmationReserve() {
        $(".price-info").$(".airButton").click();
    }
}
