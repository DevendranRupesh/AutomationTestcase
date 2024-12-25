package org.Steptestcase;

import io.cucumber.java.en.*;
import org.Testcase.Base.Baseclass;
import org.pom.PomTest22;

import java.io.IOException;

import static org.Testcase.Base.Baseclass.*;


public class StepdefinitionTc22  {

    PomTest22 pc22 = new PomTest22();
    @Given(":User Scroll to bottom of page")
    public void userScrollToBottomOfPage() {

        pc22.scrollbottom();

    }
    @Given(": User verify recommended items are visible")
    public void userVerifyRecommendedItemsAreVisible() {

        pc22.verifyrecomenditem();

    }
    @When(":User click on Add To Cart on Recommended product")
    public void userClickOnAddToCartOnRecommendedProduct() throws InterruptedException {
        Timer();
        pc22.addtocartbtn();
    }
    @When(":User click on view Cart button")
    public void userClickOnViewCartButton() {
        pc22.viewbtn();

    }
    @Then(": User verify that product is displayed in cart page")
    public void userVerifyThatProductIsDisplayedInCartPage() throws IOException {

        pc22.verifycartpage();
        screenshots(driver,"ImageTc-22");

    }
}
