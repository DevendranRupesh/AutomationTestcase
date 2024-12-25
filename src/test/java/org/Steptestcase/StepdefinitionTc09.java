package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.PomTest9;
import org.pom.pomTest8;
import org.pom.registerpage;

import java.io.IOException;


public class StepdefinitionTc09 extends Baseclass {
    registerpage rm;
    pomTest8 pc8;
    PomTest9 pc9;

    @Given("User verify that the home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        rm= new registerpage(driver);

        log("Homepage text is visible:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);
    }
    @When("User click onProducts button")
    public void clickOnProductsButton() throws InterruptedException {
       Timer();
        pc8= new pomTest8(driver);
        Btnclick(pc8.getProductsButton());

    }
    @Then("User verify navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        log("Verify user is navigated to ALLPRODUCTS:"+retrivetext(pc8.getAllproducts()));
        Assert.assertTrue(retrivetext(pc8.getAllproducts()),true);

    }
    @When("User enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
         pc9= new PomTest9(driver);
         insert(pc9.getSearchproduct(),"Men Tshirt");
         Btnclick(pc9.getSearchBtn());
    }
    @Then("User verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        log("Search product is visible:"+retrivetext(pc9.getVerifysearchproduct()));
        Assert.assertTrue(retrivetext(pc9.getVerifysearchproduct()),true);

    }
    @Then("User verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() throws IOException {
        log("verified all the products:"+retrivetext(pc9.getVerifyallproduct()));
        Assert.assertTrue(retrivetext(pc9.getVerifyallproduct()),true);
        screenshots(driver,"ImageTc-09");
    }



}
