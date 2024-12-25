package org.Steptestcase;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest12;
import org.pom.pomTest13;
import org.pom.registerpage;

import java.io.IOException;
import java.time.Duration;

public class StepdefinitionTc13 extends Baseclass {
    registerpage rm;
    pomTest13 pc13;
    pomTest12 pc12;

    @Given(": Verify  Home page is visible successfully")
    public void verifyHomePageIsVisibleSuccessfully() {
        rm= new registerpage(driver);
        pc13= new pomTest13(driver);
        pc12= new pomTest12(driver);

        log("Homepage Text is visible:" + retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()), true);
    }
    @When(": Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() throws InterruptedException {

        Btnclick(pc12.getProductbtn());

        Timer();

        setJs(pc13.getViewproduct());


    }
    @Then(": Verify product detail is opened")
    public void verifyProductDetailIsOpened() {

        log("Verify product detail:"+retrivetext(pc13.getProductdetail()));
        Assert.assertTrue(retrivetext(pc13.getProductdetail()), true);

    }
    @And(":Increase quantity to Four")
    public void increaseQuantityToFour() {
       insert(pc13.getQtyincrease(),"");
       insert(pc13.getQtyincrease(),"4");

    }

    @When(":Click Add to cart button")
    public void clickAddToCartButton() {
         Btnclick(pc13.getAddtocart());

    }
    @When(":Click View the Cart button")
    public void clickViewTheCartButton() {
       Btnclick(pc13.getCartButton());

    }
    @Then(":Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() throws IOException {

        log("Product verified with exact qty:"+retrivetext(pc13.getVerifyqty()));
        Assert.assertTrue(retrivetext(pc13.getVerifyqty()),true);
        screenshots(driver,"ImageTc-13");
    }
}
