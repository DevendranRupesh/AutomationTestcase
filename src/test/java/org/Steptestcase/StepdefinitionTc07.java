package org.Steptestcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest7;
import org.pom.registerpage;

import java.io.IOException;

public class StepdefinitionTc07 extends Baseclass {
   registerpage rm;
   pomTest7 pc7;

   @Given("User verify  the  homepage is clearly visible sucessfully")
    public void verifyTheHomepageIsClearlyVisibleSucessfully() {
        rm= new registerpage(driver);
        pc7= new pomTest7(driver);
        log("Homepage text is visible:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);
    }
    @When("User click on Test Cases button")
    public void clickOnTestCasesButton() {
         Btnclick(pc7.getClkbtn());

    }
    @Then("User verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() throws IOException {
         log("text on testcase page:"+retrivetext(pc7.getTestcase()));
         Assert.assertTrue(retrivetext(pc7.getTestcase()),true);

         screenshots(driver,"ImageTc-07");
   }
}
