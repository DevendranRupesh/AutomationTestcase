package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest10;
import org.pom.pomTest11;
import org.pom.registerpage;

import java.io.IOException;


public class StepdefinitionTc11 extends Baseclass {
    registerpage rm;
    pomTest10 pc10;
    pomTest11 pc11;

    @Given("Verify that Home page is visiblesuccessfully")
    public void verifyThatHomePageIsVisiblesuccessfully() {
        rm= new registerpage(driver);
        pc11= new pomTest11(driver);
        pc10= new pomTest10(driver);

        log("Homepage text is visible:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);

    }
    @When("Click Cart button")
    public void clickCartButton() {


        Btnclick(pc11.getCartpage());
    }
    @When("Scroll down to footer")
    public void scrollDownToFooter() {


        scrolljs(pc10.getScrolldown());
    }
    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        log("verify Text Subscription:"+retrivetext(pc10.getVerifytxt()));
        Assert.assertTrue(retrivetext(pc10.getVerifytxt()),true);

    }
    @When("Enter Email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
       insert(pc10.getEmail(),"rajesh@gmail.com");
       Btnclick(pc10.getEmailbtn());

    }
    @Then("Verify success message You have been successfully subscribed will be visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedWillBeVisible() throws IOException {

        log("Success message is visible:"+retrivetext(pc10.getSuccessmsg()));
        Assert.assertTrue(retrivetext(pc10.getSuccessmsg()),true);
        screenshots(driver,"ImageTc-11");

    }

}
