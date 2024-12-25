package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest2;
import org.pom.pomTest3;
import org.pom.registerpage;

import java.io.IOException;


public class StepdefinitionTc03 extends Baseclass {
    registerpage rm;
    pomTest2 pc2;
    pomTest3 pc3;
    @Then("User verify the user homepage is visible sucessfully")
    public void verifyTheUserHomepageIsVisibleSucessfully() {
        rm= new registerpage(driver);
        pc2= new pomTest2(driver);
        pc3= new pomTest3(driver);

        log("Text is visible:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);

    }
    @Given("User click on the signup login button")
    public void clickOnTheSignupLoginButton() {

        setJs(rm.getLoginbtn());

    }
    @Then("User verify the user Login to your account is visible")
    public void verifyTheUserLoginToYourAccountIsVisible() {
        log("Text is visible:"+retrivetext(rm.getSignuptxt()));
        Assert.assertTrue(retrivetext(rm.getSignuptxt()),true);

    }
    @Then("User enter user incorrect email address and password")
    public void enterUserIncorrectEmailAddressAndPassword() {

           insert(pc2.getEmailadd(),"rajesh@gmail.com");
           insert(pc2.getPassword(),"rajesh123456");
    }
    @When("User click on the login button")
    public void clickOnTheLoginButton() throws InterruptedException {
           Thread.sleep(1000);
          Btnclick(pc2.getLgnbtn());

    }
    @Then("User verify error Your email or password is incorrect!is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() throws IOException {

        log("Error message visible:"+retrivetext(pc3.getErrormessage()));
        Assert.assertTrue(retrivetext(pc3.getErrormessage()),true);
        screenshots(driver,"ImageTc-03");

    }


}
