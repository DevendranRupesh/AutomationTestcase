package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest2;
import org.pom.registerpage;

import java.io.IOException;

import static org.Testcase.Base.Baseclass.*;

public class StepdefinitionTc02 {

    registerpage rm;
    pomTest2 pc2;
    @Given("User verify the homepage is visible sucessfully")
    public void verifyTheHomepageIsVisibleSucessfully() {
        rm= new registerpage(driver);
        pc2= new pomTest2(driver);

        log("verify the text:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);

    }
    @When("User click on signup login button")
    public void clickOnSignupLoginButton() {
     Btnclick(pc2.getSignup());

    }
    @Then("User verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        log("verify the text login "+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()), true);
    }
    @Then("User enter correct emailaddress and password")
    public void enterCorrectEmailaddressAndPassword() {

        insert(pc2.getEmailadd(),"naveen145@gmail.com");
        insert(pc2.getPassword(),"ranbir12345678");

    }
    @When("User click login button")
    public void clickLoginButton() {

        Btnclick(pc2.getLgnbtn());

    }
    @Then("User verify that Logged in as username should be visible")
    public void verifyThatLoggedInAsUsernameShouldBeVisible() {

        log("username received as :"+retrivetext(pc2.getUserverify()));
        Assert.assertTrue(retrivetext(pc2.getUserverify()), true);
    }
    @When("User Click Delete Account button")
    public void clickDeleteAccountButton() {

        Btnclick(pc2.getDelacc());
    }
    @Then("User verify that Account Delete is visible")
    public void verifyThatAccountDeleteIsVisible() throws IOException {
        log("Text is visible:"+retrivetext(pc2.getDelacctext()));
        Assert.assertTrue(retrivetext(pc2.getDelacctext()), true);
        screenshots(driver,"ImageTc-02");

    }
}
