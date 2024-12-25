package org.Steptestcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest6;
import org.pom.registerpage;

import java.io.IOException;


public class StepdefinitionTc06 extends Baseclass {

   registerpage rm;
   pomTest6 pc6;

   @Given("User verify  the user with homepage is clearly visible sucessfully")
    public void verifyTheUserWithHomepageIsClearlyVisibleSucessfully() {
        rm= new registerpage(driver);
        pc6= new pomTest6(driver);
        log("Homepage text is visible:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);

    }
    @When("User click  on the contact us button")
    public void clickOnTheContactUsButton() {
        Btnclick(pc6.getContact());
    }

    @Then("User verify Get In Touch is visible")
    public void verifyGetInTouchIsVisible() {
        log("verify the text:"+retrivetext(pc6.getGettext()));
        Assert.assertTrue(retrivetext(pc6.getGettext()),true);

    }
    @Then("User enter name email subject and message")
    public void enterNameEmailSubjectAndMessage() {

        insert(pc6.getName(),"ramesh");
        insert(pc6.getEmail(),"ramesh@gmail.com");
        insert(pc6.getSubject(),"Enquiry details");
        insert(pc6.getMessage(),"contact form to be submitted");
    }
    @Then("User upload file")
    public void userUploadFile() {
        setJs(pc6.getUploadfile());
        insert(pc6.getUploadfile(),"\"D:\\20230927.jpg\"");

    }
    @When("User click submit button")
    public void userClickSubmitButton() {
         Sbtclick(pc6.getClkbtn());

    }
    @When("User click ok button")
    public void userClickOkButton() {
        Alert();
    }


    @Then("User verify success message Success! Your details have been submitted successfully. is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() {

        log("message is visisble as:" +retrivetext(pc6.getVerify()));

    }
    @When("User click Home button and verify that landed to home page successfully")
    public void userClickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() throws InterruptedException, IOException {

        Btnclick(pc6.getHomebtn());
        log("Text on homepage :"+retrivetext(rm.getHomepagetxt()));
        screenshots(driver,"ImageTc-06");

    }

}
