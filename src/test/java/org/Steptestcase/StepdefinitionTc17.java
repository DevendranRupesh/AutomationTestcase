package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.*;

import java.io.IOException;


public class StepdefinitionTc17 extends Baseclass {
    registerpage rm;
    pomTest13 pc13;
    pomTest12 pc12;
    pomTest14 pc14;
    pomTest17 pc17;



    @Given(": Verify the Home page is visible successfully")
    public void verifyTheHomePageIsVisibleSuccessfully() {
        rm= new registerpage(driver);
        pc13= new pomTest13(driver);
        pc12= new pomTest12(driver);
        pc14= new pomTest14(driver);
        pc17= new pomTest17(driver);

        log("Homepage Text is visible:" + retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()), true);
    }
    @Then(":Add products to Cart")
    public void addProductsToCart() throws InterruptedException {



        Btnclick(pc12.getProductbtn());

        Timer();
        setJs(pc13.getViewproduct());

        String text = retrivetext(pc13.getProductdetail());
       Assert.assertTrue(retrivetext(pc13.getProductdetail()),true);

        Btnclick(pc13.getAddtocart());

        Btnclick(pc12.getContinuebtn());


    }
    @When(":Click cart button")
    public void clickCartButton() throws InterruptedException {
        Timer();

        setJs(pc14.getCartbtn());

    }
    @Then(":Verify that Cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        log("verify the cart page:"+retrivetext(pc14.getVerifyThatCartPage()));
        Assert.assertTrue(retrivetext(pc14.getVerifyThatCartPage()),true);

    }
    @When(":Click X button corresponding to particular product")
    public void clickXButtonCorrespondingToParticularProduct() {
        setJs(pc17.getXbutton());
    }
    @Then(":Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() throws IOException {

        log("verify cart empty:"+retrivetext(pc17.getVerifycartempty()));
        Assert.assertTrue(retrivetext(pc17.getVerifycartempty()),true);
        screenshots(driver,"ImageTc-17");
    }
}
