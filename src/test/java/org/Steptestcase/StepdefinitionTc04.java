package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest2;
import org.pom.pomTest4;
import org.pom.registerpage;

import java.io.IOException;
import java.time.Duration;

public class StepdefinitionTc04 extends Baseclass {
     registerpage rm;
     pomTest4 pc4;
     pomTest2 pc2;

    @Given("User verify  the user homepage is visible sucessfully")
    public void verifyTheUserHomepageIsVisibleSucessfully() {
       rm= new registerpage(driver);
       pc2= new pomTest2(driver);
       pc4= new pomTest4(driver);

       log("Homepage text is visible:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);
    }

    @When("User click  on the signup login button")
    public void clickOnTheSignupLoginButton() {
        Btnclick(rm.getLoginbtn());

    }

    @Then("User verify user Login to your account is visible")
    public void verifyUserLoginToYourAccountIsVisible() {
        log("Verify user Login :"+ retrivetext(rm.getSignuptxt()));
        Assert.assertTrue(retrivetext(rm.getSignuptxt()),true);

    }
    @Then("User enter correct email2 address and password")
    public void enterCorrectEmail2AddressAndPassword() {
        insert(pc2.getEmailadd(),"naveen145@gmail.com");
        insert(pc2.getPassword(),"ranbir12345678");

    }
    @When("User click on login button")
    public void clickLoginButton() {
       Btnclick(pc2.getLgnbtn());

    }
    @Then("User verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
       log("username received as :"+retrivetext(pc2.getUserverify()));
       Assert.assertTrue(retrivetext(pc2.getUserverify()),true);

    }
    @When("User click Logout button")
    public void clickLogoutButton() {
        Btnclick(pc4.getLogout());

    }
    @Then("User verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() throws InterruptedException, IOException {

         log("username received as :"+retrivetext(pc4.getUserverifylogin()));
         Assert.assertTrue(retrivetext(pc4.getUserverifylogin()),true);

         screenshots(driver,"ImageTc-04");
    }
}
