package org.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.Testcase.Base.Baseclass;
import org.openqa.selenium.WebDriver;


public class Hooks {

    public static WebDriver driver;

    @Before
    public void BeforeTest() {

        Baseclass.launchbrowser();
        Baseclass.chromeoptions();
        Baseclass.maximizewindow();
        Baseclass.implicitwait(50);
        Baseclass.geturl("http://automationexercise.com");
    }

    @After
    public void tearDown() {

        Baseclass.quitbrowser();

    }


}
