package org.Steptestcase;

import io.cucumber.java.en.*;
import org.pom.PomTest23;
import org.pom.pomTest25;

import java.io.IOException;

import static org.Testcase.Base.Baseclass.*;

public class StepdefinitonTc26 {

    PomTest23 pc23= new PomTest23();
    pomTest25 pc25 =new pomTest25();

    @Given(":User verify the home page is visible successfully.")
    public void userVerifyTheHomePageIsVisibleSuccessfully() {
     pc23.homepagetxt();

    }
    @Given(":User Scroll down page to bottom.")
    public void userScrollDownPageToBottom() {
    pc25.Scrolldown();

    }
    @Then(":User Verify Subscription is visible.")
    public void userVerifySubscriptionIsVisible() {
    pc25.verifysubcriptiontxt();

    }
    @When(":User Scroll up page to top.")
    public void userScrollUpPageToTop() {
    pc25.scrollupwithoutarrowbtn();

    }
    @Then(":User verify the page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen.")
    public void userVerifyThePageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() throws IOException {

    pc25.Scrolluptextverify();
     screenshots(driver,"ImageTc-26");
    }




}
