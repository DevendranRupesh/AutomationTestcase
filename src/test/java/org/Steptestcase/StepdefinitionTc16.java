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

public class StepdefinitionTc16 extends Baseclass {
       registerpage rm;
       pomTest2 pc2;
       pomTest12 pc12;
       pomTest13 pc13;
       pomTest14 pc14;



    @Given(": Verify  Homepage  visible successfully")
    public void verifyHomepageVisibleSuccessfully() {
        rm= new registerpage(driver);
        pc2=new pomTest2(driver);
        pc12=new pomTest12(driver);
        pc13 = new pomTest13(driver);
        pc14= new pomTest14(driver);


        log("Homepage verified:"+retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()),true);
    }
    @When(":  Click Signup  login button")
    public void clickSignupLoginButton() {

        setJs(rm.getLoginbtn());
    }
    @When(":Fill email, password and click Login button")
    public void fillEmailPasswordAndClickLoginButton() {

        insert(pc2.getEmailadd(),"ravikumar12345@gmail.com");
        insert(pc2.getPassword(),"ravi12345678");

        Btnclick(pc2.getLgnbtn());
    }
    @Then(": Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {

        log("verify login text:"+retrivetext(pc2.getUserverify()));
        Assert.assertTrue(retrivetext(pc2.getUserverify()),true);

    }
    @Then(": Add products to cart")
    public void addProductsToCart() throws InterruptedException {

        Btnclick(pc12.getProductbtn());

        Timer();

        log(retrivetext(pc13.getProductdetail()));
        Assert.assertTrue(retrivetext(pc13.getProductdetail()),true);

        Btnclick(pc13.getAddtocart());

        Btnclick(pc12.getContinuebtn());

    }
    @When(": Click  Cart button")
    public void clickCartButton() throws InterruptedException {
        Timer();

        setJs(pc14.getCartbtn());
    }
    @Then(":Verify that  cart  page is displayed")
    public void verifyThatCartPageIsDisplayed() {

        log("verify the cart page:"+retrivetext(pc14.getVerifyThatCartPage()));
        Assert.assertTrue(retrivetext(pc14.getVerifyThatCartPage()),true);
    }
    @When(":Click Proceed To  Checkout")
    public void clickProceedToCheckout() {

        Btnclick(pc14.getChkoutbtn());
    }
    @Then(":Verify  Address Details Review Your Order")
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
    @Then(": Enter description in  comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() throws InterruptedException {

        Timer();
        insert(pc14.getDescription(),"All products With good quality");
        setJs(pc14.getPlaceoder());

    }
    @Then(":Enter  payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

        insert(pc14.getNamecard(),"Srirajesh");
        insert(pc14.getCardnumber(),"16252446666666");
        insert(pc14.getCvcno(),"121");
        insert(pc14.getExpiryMonth(),"October");
        insert(pc14.getYear(),"2024");

    }
    @When(":Click Pay & Confirm Order button")
    public void clickPayConfirmOrderButton() {

        Btnclick(pc14.getPlaceoder1());
    }
    @Then(":Verify Success message Your  order has been placed successfully")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {

        log("verify text message:"+retrivetext(pc14.getVerifymessage()));
        Assert.assertTrue(retrivetext(pc14.getVerifymessage()),true);

    }
    @When(":Click  Delete Account Button")
    public void clickDeleteAccountButton() {

        setJs(pc14.getAccountDelete());
    }
    @Then(":Verify ACCOUNT DELETED! And click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() throws IOException {
        log("verify AccountDeleted:"+retrivetext(pc14.getVerifyaccountDelete()));
        Assert.assertTrue(retrivetext(pc14.getVerifyaccountDelete()),true);

        setJs(pc14.getContinuebtn());
        screenshots(driver,"ImageTc-16");

    }


}
