package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest10;
import org.pom.registerpage;

import java.io.IOException;

public class StepdefinitionTc10 extends Baseclass {
       registerpage rm;
       pomTest10 pc10;

    @Given("User verify that home page is visiblesuccessfully")
    public void userVerifyThatHomePageIsVisiblesuccessfully() {
        rm=new registerpage(driver);
        pc10= new pomTest10(driver);

        log("Homepage text is visible:"+retrivetext(rm.getHomepagetxt()));
        String text1 = retrivetext(rm.getHomepagetxt());
        Assert.assertTrue(" Home",true);

    }
    @When("User Scroll down to footer")
    public void userScrollDownToFooter() {

        scrolljs(pc10.getScrolldown());

    }
    @Then("User verify text SUBSCRIPTION")
    public void userVerifyTextSUBSCRIPTION() {
        log("verify Text Subscription:"+retrivetext(pc10.getVerifytxt()));

    }

    @When("User enter email address in input and click arrow button")
    public void userEnterEmailAddressInInputAndClickArrowButton() {
        insert(pc10.getEmail(),"rajesh@gmail.com");
        Btnclick(pc10.getEmailbtn());
    }
    @Then("User verify success message You have been successfully subscribed is visible")
    public void userVerifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() throws IOException {

        log("Success message is visible:"+retrivetext(pc10.getSuccessmsg()));
        screenshots(driver,"ImageTc-10");
    }



    }



