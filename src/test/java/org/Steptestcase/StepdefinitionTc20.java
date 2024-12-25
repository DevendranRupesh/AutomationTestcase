package org.Steptestcase;

import io.cucumber.java.en.*;
import org.Testcase.Base.Baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pom.*;

import java.io.IOException;

public class StepdefinitionTc20 extends Baseclass {

    PomTest9 pc9;
    pomTest8 pc8;
    pomTest12 pc12;
    pomTest14 pc14;
    registerpage rm;
    pomTest2 pc2;
    pomTest13 pc13;


    @Given(":Click on the Products button")
    public void clickOnTheProductsButton() {
        pc9= new PomTest9(driver);
        pc8= new pomTest8(driver);
        pc12= new pomTest12(driver);
        pc14= new pomTest14(driver);
        rm = new registerpage(driver);
        pc2= new pomTest2(driver);
        pc13= new pomTest13(driver);

        Btnclick(pc8.getProductsButton());
    }
    @Then(": Verify user is Navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        String text2 = retrivetext(pc8.getAllproducts());
        log("All products page is visible:"+ text2);
    }
    @Then(":Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        insert(pc9.getSearchproduct(),"Men Tshirt");
        Btnclick(pc9.getSearchBtn());
    }
    @Then(":Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {

        log("Search product is visible:"+retrivetext(pc9.getVerifysearchproduct()));
    }
    @Then(":Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {

        log("verified all the products:"+retrivetext(pc9.getVerifyallproduct()));
    }
    @Then(": Add those products to cart")
    public void addThoseProductsToCart() {
        Actions actions1= new Actions(driver);
        WebElement product2 = pc12.getProduct2();
        setJs(pc12.getProduct2());
        actions1.moveToElement(product2).perform();

        setJs(pc12.getAddtocart1());
    }
    @When(":Click Cart button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart() {

        setJs(pc14.getCartbtn());
    }
    @When(": Click Signup  Login button and submit login details")
    public void clickSignupLoginButtonAndSubmitLoginDetails() {


        Btnclick(rm.getLoginbtn());
        insert(pc2.getEmailadd(),"ranbir12@gmail.com");
        insert(pc2.getPassword(),"ranbir12345678");
        Btnclick(pc2.getLgnbtn());
    }
    @When(":Again go to Cart page")
    public void againGoToCartPage() throws InterruptedException {
        Timer();
        setJs(pc14.getCartbtn());
    }
    @Then(": Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() throws IOException {

        log("Product verified with exact qty:"+retrivetext(pc13.getVerifyqty()));
        log("username received as :"+retrivetext(pc2.getUserverify()));
        screenshots(driver,"ImageTc-20");

    }
}
