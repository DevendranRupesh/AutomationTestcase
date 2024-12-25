package org.Steptestcase;

import io.cucumber.java.en.*;
import org.pom.PomTest23;
import org.pom.pomTest25;

import java.io.IOException;

import static org.Testcase.Base.Baseclass.driver;
import static org.Testcase.Base.Baseclass.screenshots;


public class StepdefinitionTc25 {
    PomTest23 pc23= new PomTest23();
    pomTest25 pc25= new pomTest25();

    @Given(":User verify that the home page is visible successfully.")
    public void user_verify_that_the_home_page_is_visible_successfully() {
        pc23.homepagetxt();
    }
    @Given(":User scroll down page to bottom.")
    public void user_scroll_down_page_to_bottom() {
        pc25.Scrolldown();
    }
    @Then(":User Verify SUBSCRIPTION is visible.")
    public void user_verify_subscription_is_visible() {
        pc25.verifysubcriptiontxt();
    }
    @When(":User click on arrow at bottom right side to move upward.")
    public void user_click_on_arrow_at_bottom_right_side_to_move_upward() {
       pc25.ScrollUp();
    }

    @Then(":User verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen.")
    public void userVerifyThatPageIsScrolledUpAndFullFledgedPracticeWebsiteForAutomationEngineersTextIsVisibleOnScreen() throws IOException {

        pc25.Scrolluptextverify();
        screenshots(driver,"ImageTc-25");
    }
}
