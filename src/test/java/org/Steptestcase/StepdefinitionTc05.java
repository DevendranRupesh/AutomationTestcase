package org.Steptestcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest5;
import org.pom.registerpage;

import java.io.IOException;
import java.time.Duration;

public class StepdefinitionTc05 extends Baseclass {
    registerpage rm;
    pomTest5 pc5;

    @Given("User verify  the user with homepage is visible sucessfully")
    public void verifyTheUserWithHomepageIsVisibleSucessfully() {
       rm= new registerpage(driver);
       pc5=new pomTest5(driver);
       log("Homepage text is visible:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);


    }
    @When("User click  on the signup  with login button")
    public void clickOnTheSignupWithLoginButton() {
         Btnclick(rm.getLoginbtn());

    }
    @Then("User verify New User Signup is visible clearly")
    public void verifyNewUserSignupIsVisible() {
        log("New user signup text is visible:"+retrivetext(rm.getSignuptxt()));
        Assert.assertTrue(retrivetext(rm.getSignuptxt()),true);

    }
    @Then("User enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        insert(rm.getName(),"naveen");
        insert(rm.getEmail(),"naveen145@gmail.com");

    }
    @When("User click on Signup button")
    public void clickSignupButton() {
       Sbtclick(rm.getSignupbtn());
    }

    @Then("User verify error Email Address already exist is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() throws IOException {

        log("Error message visible:"+retrivetext(pc5.getErrortxt()));
        Assert.assertTrue(retrivetext(pc5.getErrortxt()),true);
        screenshots(driver,"ImageTc-05");


    }
}
