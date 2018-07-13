package com.sidenis.vasidzius;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public abstract class TestBase {
  @Before
  public final void setUpBrowser() {
    Configuration.startMaximized = false;
    Configuration.reportsFolder = "target/surefire-reports";
  }
}
