package com.sidenis.vasidzius;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestPlusMinus3Days extends TestBase {
  @Before
  public void setUp() {
    open("http://www.airtickets.ru/");
  }

  @Test
  public void canSelectRadioByClass() {
    $(".plusMinus3DaysRadioButton .radioButtonContainer", 1).click();
    $(By.name("plusMinus3")).shouldBe(selected);
  }

  @Test
  public void canSelectRadioByText() {
    $(".plusMinus3DaysRadioButton").find(byText("+/- 3 дня")).click();
    $(By.name("plusMinus3")).shouldBe(selected);
  }
}
