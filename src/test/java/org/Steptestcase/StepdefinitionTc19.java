package org.Steptestcase;

import org.Testcase.Base.Baseclass;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.pom.pomTest19;

import java.io.IOException;

public class StepdefinitionTc19 extends Baseclass {

      pomTest19 pc19;

    @Given(":Click on Products button")
    public void clickOnProductsButton() {
      pc19= new pomTest19(driver);

      Btnclick(pc19.getProductbtn());

    }
    @Then(":Verify that Brands are visible on left side bar")
    public void verifyThatBrandsAreVisibleOnLeftSideBar() {

     log("verified that brands are visible:"+retrivetext(pc19.getBrands1visible()));
     Assert.assertTrue(retrivetext(pc19.getBrands1visible()),true);
    }
    @When(": Click on any brand name")
    public void clickOnAnyBrandName() throws InterruptedException {

        Timer();
        setJs(pc19.getBrandname());
    }
    @Then(":Verify that user is navigated to brand page and brand products are displayed")
    public void verifyThatUserIsNavigatedToBrandPageAndBrandProductsAreDisplayed() {
     log("verified the page navigated to brand:"+retrivetext(pc19.getBrandproducts()));
     Assert.assertTrue(retrivetext(pc19.getBrandproducts()),true);

    }
    @When(": On left side bar  click on any other brand link")
    public void onLeftSideBarClickOnAnyOtherBrandLink() throws InterruptedException {
        Timer();
        setJs(pc19.getBrandlink());

    }
    @Then(": Verify that user is navigated to that brand page and can see products")
    public void verifyThatUserIsNavigatedToThatBrandPageAndCanSeeProducts() throws IOException {

        log("verified the user navigate to next brand page :"+retrivetext(pc19.getBrands2visible()));
        Assert.assertTrue(retrivetext(pc19.getBrands2visible()),true);
        screenshots(driver,"ImageTc-19");
    }





}
