package org.Steptestcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pom.pomTest12;
import org.pom.registerpage;

import java.io.IOException;


public class StepdefinitionTc12 extends Baseclass {
       registerpage rm;
       pomTest12 pc12;

    @Given(": Verify that Home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        rm= new registerpage(driver);
        pc12= new pomTest12(driver);

        log("Homepage text is visible:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);

    }
    @When(": Click Products button")
    public void clickProductsButton() {

        Btnclick(pc12.getProductbtn());
    }
    @When(":Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        Actions actions1= new Actions(driver);
        WebElement Hower1 = pc12.getHower1();
        setJs(pc12.getHower1());
        actions1.moveToElement(Hower1).perform();

        setJs(pc12.getAddtocart());
    }
    @When(":Click Continue Shopping button")
    public void clickContinueShoppingButton() throws InterruptedException {
        Timer();

        setJs(pc12.getContinuebtn());
    }
    @When(":Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() throws InterruptedException {
       Timer();

        Actions actions1= new Actions(driver);
        WebElement product2 = pc12.getProduct2();
        setJs(pc12.getProduct2());
        actions1.moveToElement(product2).perform();

        setJs(pc12.getAddtocart1());
    }
    @When(":Click View Cart button")
    public void clickViewCartButton() throws InterruptedException {
        Timer();
        Btnclick(pc12.getViewbtn());
    }
    @Then(":Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {

        log("verify product1:" +retrivetext(pc12.getVerifyproduct1()));
        Assert.assertTrue(retrivetext(pc12.getVerifyproduct1()),true);


        log("verify product1:" +retrivetext(pc12.getVerifyproduct2()));
        Assert.assertTrue(retrivetext(pc12.getVerifyproduct2()),true);

    }
    @Then(":Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() throws IOException {


        log("verify product1:" + retrivetext(pc12.getPrice1()));
        Assert.assertTrue(retrivetext(pc12.getPrice1()),true);


        log("verify product1:" + retrivetext(pc12.getPrice2()));
        Assert.assertTrue(retrivetext(pc12.getPrice2()),true);


        log("verify product1:" + retrivetext(pc12.getQty1()));
        Assert.assertTrue(retrivetext(pc12.getQty1()),true);


        log("verify product1:" +retrivetext(pc12.getQty2()));
        Assert.assertTrue(retrivetext(pc12.getQty2()),true);


        log("verify product1:" + retrivetext(pc12.getTotalprice1()));
        Assert.assertTrue( retrivetext(pc12.getTotalprice1()),true);


        log("verify product1:" +retrivetext(pc12.getTotalprice2()));
        Assert.assertTrue(retrivetext(pc12.getTotalprice2()),true);
        screenshots(driver,"ImageTc-12");

        }

}

