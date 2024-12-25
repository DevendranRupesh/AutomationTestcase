package org.Steptestcase;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pom.registerpage;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class StepdefinitionTc01 extends Baseclass {

    registerpage rm;

    @Given("User verify that home page is visible successfully")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {

        rm = new registerpage(driver);

        log("Homepage Text is visible:" + retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()), true);
    }

    @When("User click on Signup & Login button")
    public void userClickOnSignupLoginButton() {

        rm = new registerpage(driver);

        setJs(rm.getLoginbtn());

    }

    @Then("User verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {

        log("signup text is visible:" + retrivetext(rm.getSignuptxt()));
        Assert.assertTrue(retrivetext(rm.getSignuptxt()), true);

    }

    @And("User enter the following username {string} and Email{string}")
    public void userEnterTheFollowingUsernameAndEmail(String name, String email) {

        insert(rm.getName(),name);
        insert(rm.getEmail(),email);
    }

    @When("User click Signup button")
    public void clickSignupButton() {
        Btnclick(rm.getSignupbtn());


    }


    @Then("User verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {

        log("Text is clearly visible:" + retrivetext(rm.getVisibletxt()));
        Assert.assertTrue(retrivetext(rm.getVisibletxt()), true);

    }

    @Then("User fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {

        Btnclick(rm.getTitle());

        rm.getName1().clear();
        insert(rm.getName1(), "sombir");
        insert(rm.getPass(), "ranbir12345678");

        select(rm.getDays(), 3);
        select(rm.getMonths(), 4);
        select(rm.getYears(), 3);

    }

    @Then("User select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() throws InterruptedException {
        Timer();
        setJs(rm.getRadiobtn1());

    }

    @Then("User select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() throws InterruptedException {

        setJs(rm.getReceiveoffbtn());


    }

    @Then("User fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddress2CountryStateCityZipcodeMobileNumber() throws InterruptedException {
        Timer();

        insert(rm.getFirstname(), "ramesh");

        insert(rm.getLastname(), "kumar");

        insert(rm.getCompany(), "miletechindustries");

        insert(rm.getAddress(), "plot no.82 vinayagast");

        insert(rm.getAdd2(), "ramapuram extend road");

        Timer();

        select(rm.getCountry(), 5);


        insert(rm.getState(), "tamilnadu");

        insert(rm.getCty(), "chennai");

        insert(rm.getZpcode(), "600126");

        Timer();

        insert(rm.getMobno(), "9999999999");

    }

    @When("User click Create Account button")
    public void clickCreateAccountButton() {
        Sbtclick(rm.getCreateAcbtn());

    }

    @Then("User verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        log("Text is visible:" + retrivetext(rm.getAccverify()));
        Assert.assertTrue(retrivetext(rm.getAccverify()), true);
    }

    @When("User click Continue button")
    public void clickContinueButton() {
        Btnclick(rm.getContinuebtn());

    }

    @Then("User verify that logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {

        log("username is visible:" + retrivetext(rm.getUsertext()));
        Assert.assertTrue(retrivetext(rm.getUsertext()), true);
    }


    @When("User click Delete Account button")
    public void clickDeleteAccountButton() {
        Btnclick(rm.getDeleteAc());

    }

    @Then("User verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() throws InterruptedException, IOException {
        Timer();
        log("Text is visible:" + retrivetext(rm.getAccdeltext()));
        Assert.assertTrue(retrivetext(rm.getAccdeltext()), true);

        Btnclick(rm.getContinuebtn1());
        screenshots(driver, "ImageTc-01");
    }
}








