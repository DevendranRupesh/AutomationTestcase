package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest8;
import org.pom.registerpage;

import java.io.IOException;


public class StepdefinitionTc08 extends Baseclass {

    registerpage rm;
    pomTest8 pc8;

    @Given("User verify that home page should be visible successfully")
    public void verifyThatHomePageShouldBeVisibleSuccessfully() {
        rm = new registerpage(driver);
        pc8 = new pomTest8(driver);

        log("Homepage text is visible:" + retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()), true);
    }

    @When("User click on Products button")
    public void clickOnProductsButton() throws InterruptedException {

        Btnclick(pc8.getProductsButton());

    }

    @Then("User verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        log("All products page is visible:" + retrivetext(pc8.getAllproducts()));
        Assert.assertTrue(retrivetext(pc8.getAllproducts()), true);
    }

    @Then("The user products list is visible")
    public void theProductsListIsVisible() {

        log("Verify user is navigated to ALL PRODUCTS:" + retrivetext(pc8.getProductdetail()));
        Assert.assertTrue(retrivetext(pc8.getProductdetail()), true);

    }

    @When("User click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() throws InterruptedException {

        setJs(pc8.getViewproduct());
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        log("User is landed to product detail :" + retrivetext(pc8.getProductdetailpage()));
        Assert.assertTrue(retrivetext(pc8.getProductdetailpage()),true);

    }

    @Then("User verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() throws IOException {

        log("User verify that detail detail is visible:" + retrivetext(pc8.getVerifyuserdetail()));
        Assert.assertTrue(retrivetext(pc8.getVerifyuserdetail()),true);
        screenshots(driver,"ImageTc-08");


    }


}
