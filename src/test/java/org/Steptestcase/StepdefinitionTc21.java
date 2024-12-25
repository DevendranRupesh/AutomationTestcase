package org.Steptestcase;

import io.cucumber.java.en.*;
import org.Testcase.Base.Baseclass;
import org.pom.pomTest21;

import java.io.IOException;

public class StepdefinitionTc21 extends Baseclass {

    pomTest21 pc21= new pomTest21();
    @Given(": User Click on Products button")
    public void userClickOnProductsButton() {

        pc21.Productbtn();

    }
    @Then(": User verify with navigated to ALL PRODUCTS page successfully")
    public void userVerifyWithNavigatedToALLPRODUCTSPageSuccessfully() {

        pc21.Producttxt();

    }
    @When(": User Click on View Product button")
    public void userClickOnViewProductButton() throws InterruptedException {
            Timer();
        pc21.viewproduct();


    }
    @Then(": User verify Write Your Review is visible")
    public void userVerifyWriteYourReviewIsVisible() {

        pc21.reviewbtn();

    }
    @Then(": User enter name, email and review")
    public void userEnterNameEmailAndReview() {

        pc21.name();
        pc21.email();
        pc21.review();


    }
    @When(": User Click Submit button")
    public void userClickSubmitButton() {

        pc21.submitbtn();


    }
    @Then(": User verify success message 'Thank you for your review.")
    public void userVerifySuccessMessageThankYouForYourReview() throws IOException {

        pc21.sucessmessage();
        screenshots(driver,"ImageTc-21");

    }
}
