package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pom.*;

import java.io.IOException;
import java.util.List;

public class StepdefinitonTc15 extends Baseclass {
     registerpage rm;
     pomTest8 pc8;
     pomTest12 pc12;
     pomTest14 pc14;
     pomTest13 pc13;


@Given(": Verify the Home page  visible successfully")
    public void verifyTheHomePageVisibleSuccessfully() {

    rm= new registerpage(driver);
    pc8=new pomTest8(driver);
    pc12=new pomTest12(driver);
    pc14=new pomTest14(driver);
    pc13=new pomTest13(driver);

    log("Homepage Text is visible:" + retrivetext(rm.getHomepagetxt()));
    Assert.assertTrue(retrivetext(rm.getHomepagetxt()), true);
    }
    @When(":  Click Signup  Login button")
    public void clickSignupLoginButton() {
     setJs(rm.getLoginbtn());
     }
    @When(":Fill all the details in Signup and create account")
    public void fillAllTheDetailsInSignupAndCreateAccount() throws InterruptedException {

        insert(rm.getName(),"prajesh03");
        insert(rm.getEmail(),"prajesh03@gmail.com");
        Btnclick(rm.getSignupbtn());
        Btnclick(rm.getTitle());
        insert(rm.getPass(),"raguram123456");
        select(rm.getDays(),2);
        select(rm.getMonths(),2);
        select(rm.getYears(),2);

        Timer();
        setJs(rm.getRadiobtn1());
        setJs(rm.getReceiveoffbtn());

        insert(rm.getFirstname(),"rajesh");
        insert(rm.getLastname(),"rajesh1234567");
        insert(rm.getCompany(),"Miletechindustries");
        insert(rm.getAddress(),"plot no.66 ravisasta street");
        insert(rm.getAdd2(),"vyasarpadi chennai-22");
        select(rm.getCountry(),2);
        insert(rm.getState(),"taminadu");
        insert(rm.getCty(),"chennai");
        insert(rm.getZpcode(),"600126");
        insert(rm.getMobno(),"9999999999");
        setJs(rm.getCreateAcbtn());
}
    @Then(": Verify ACCOUNT CREATED and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {

        log("verify text:"+retrivetext(rm.getAccverify()));
        Assert.assertTrue(retrivetext(rm.getAccverify()),true);
        setJs(rm.getContinuebtn1());

}
    @Then(":Verify  logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() throws InterruptedException {
        Timer();

        log("verify text:"+retrivetext(rm.getUsertext()));
        Assert.assertTrue(retrivetext(rm.getUsertext()),true);

}
    @Then(":Add products to cart")
    public void addProductsToCart() throws InterruptedException {

        Btnclick(pc12.getProductbtn());

        Timer();
        setJs(pc13.getViewproduct());

        log(retrivetext(pc13.getProductdetail()));
        Assert.assertTrue(retrivetext(pc13.getProductdetail()),true);

        Btnclick(pc13.getAddtocart());

        Btnclick(pc12.getContinuebtn());
}
    @When(":Click Cart button")
    public void clickCartButton() throws InterruptedException {
        Timer();
        setJs(pc14.getCartbtn());

    }
    @Then(":Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {

        log("verify the cart page:"+retrivetext(pc14.getVerifyThatCartPage()));
        Assert.assertTrue(retrivetext(pc14.getVerifyThatCartPage()),true);

    }
    @When(":Click Proceed TO Checkout")
    public void clickProceedTOCheckout() {
         Btnclick(pc14.getChkoutbtn());
    }
    @Then(":Verify Address Details Review Your Order")
    public void verifyAddressDetailsReviewYourOrder() {

    log("verify DeliveryAddress :"+retrivetext(pc14.getVerifyBilling()));
    Assert.assertTrue(retrivetext(pc14.getVerifyBilling()),true);

    log("verify delivery Address:"+retrivetext(pc14.getVerifydelivery()));
    Assert.assertTrue(retrivetext(pc14.getVerifydelivery()),true);


    List<WebElement> reviewoder = pc14.getReviewoder();
        for (WebElement element : reviewoder) {
            log(retrivetext(element));
        }

    }
    @Then(": Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() throws InterruptedException {

        Timer();
        insert(pc14.getDescription(),"All products With good quality");
        setJs(pc14.getPlaceoder());
   }
    @Then(":Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

        insert(pc14.getNamecard(),"Srirajesh");
        insert(pc14.getCardnumber(),"16252446666666");
        insert(pc14.getCvcno(),"121");
        insert(pc14.getExpiryMonth(),"October");
        insert(pc14.getYear(),"2024");
    }
    @When(":Click Pay Confirm Order button")
    public void clickPayConfirmOrderButton() {
        Btnclick(pc14.getPlaceoder1());
   }
    @Then(":Verify Success message Your order has been placed successfully")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        log("verify text message:"+retrivetext(pc14.getVerifymessage()));
        Assert.assertTrue(retrivetext(pc14.getVerifymessage()),true);
    }
    @When(":Click Delete Account Button")
    public void clickDeleteAccountButton() {
        setJs(pc14.getAccountDelete());
    }
    @Then(":Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() throws IOException {

       log("verify AccountDeleted:"+retrivetext(pc14.getVerifyaccountDelete()));
       Assert.assertTrue(retrivetext(pc14.getVerifyaccountDelete()),true);

       setJs(pc14.getContinuebtn());
        screenshots(driver,"ImageTc-15");
    }

}
