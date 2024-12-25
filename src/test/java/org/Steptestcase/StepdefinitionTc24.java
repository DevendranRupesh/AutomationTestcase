package org.Steptestcase;

import io.cucumber.java.en.*;
import org.pom.PomTest23;
import org.pom.pomTest24;

import java.io.IOException;

import static org.Testcase.Base.Baseclass.*;

public class StepdefinitionTc24 {

    PomTest23 pc23 = new PomTest23();
    pomTest24 pc24 = new pomTest24();

    @Given(":User verify home page is visible successfully.")
    public void userVerifyHomePageIsVisibleSuccessfully() {

        pc23.homepagetxt();
    }

    @When(":User Add products to cart.")
    public void userAddProductsToCart() throws InterruptedException {
        pc23.productbtn();
        pc23.product1();
        pc23.Addtocart1();
        pc23.continuebtn();
        pc23.product2();
        pc23.Addtocart1();
        pc23.continuebtn();
    }

    @When(":User click cart button.")
    public void userClickCartButton() {

        pc24.cartbtn();
    }

    @Then(":User Verify  cart page is displayed.")
    public void userVerifyCartPageIsDisplayed() {

        pc23.cartpageverify();
    }

    @When(":User click Proceed To Checkout.")
    public void userClickProceedToCheckout() {

        pc23.chkoutpage();
    }

    @When(":User  Click Register Login button.")
    public void userClickRegisterLoginButton() {
        pc24.registerlogin();

    }

    @When(":User Fill all details in Signup and create account.")
    public void userFillAllDetailsInSignupAndCreateAccount() {

        pc23.signuptxt();
        pc23.loginname();
        pc23.loginemail();
        pc23.Signupbtn();
        pc23.visibletxt();
        pc23.Title();
        pc23.Name2();
        pc23.pass();
        pc23.days();
        pc23.month();
        pc23.year();
        pc23.radiobtn1();
        pc23.receiveoffbtn();
        pc23.firstname();
        pc23.lastname();
        pc23.company();
        pc23.Address();
        pc23.Add2();
        pc23.country();
        pc23.state();
        pc23.cty();
        pc23.zpcode();
        pc23.Mobno();
        pc23.createAcbtn();
    }

    @Then(":User Verify ACCOUNT CREATED! and click Continue button.")
    public void userVerifyACCOUNTCREATEDAndClickContinueButton() throws InterruptedException {

        pc23.Accverify();
        Timer();

        pc23.continueBtn();
    }

    @Then(":User verify Logged in as username at top.")
    public void userVerifyLoggedInAsUsernameAtTop() {

        pc23.usertext();
    }

    @When(":User should Click Cart button.")
    public void userShouldClickCartButton() {
        pc24.cartbtn();

    }

    @When(":User click Proceed To Checkout button.")
    public void userClickProceedToCheckoutButton() {

        pc23.chkoutpage();
    }

    @Then(":User verify Address Details and Review Your Order.")
    public void userVerifyAddressDetailsAndReviewYourOrder() {

        pc24.verifydelivery();
        pc24.revieworder();


    }

    @Then(":User enter description in comment text area and click Place Order.")
    public void userEnterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        pc24.Description();
        pc24.placeorder();

    }

    @Then(":User enter payment details: Name on Card, Card Number, CVC, Expiration date.")
    public void userEnterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        pc24.Namecard();
        pc24.cardnumber();
        pc24.cvcno();
        pc24.expiryMonth();
        pc24.year();
    }

    @When(":User click Pay and Confirm Order button.")
    public void userClickPayAndConfirmOrderButton() {
        pc24.placeoder1();

    }

    @Then(":User Verify success message Your order has been placed successfully.")
    public void userVerifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {

        pc24.verifymessage();
    }

    @When(":User click download invoice button and verify invoice is downloaded successfully.")
    public void userClickDownloadInvoiceButtonAndVerifyInvoiceIsDownloadedSuccessfully() {
        pc24.downloadinvoice();


    }

    @When(":User click continue button.")
    public void userClickContinueButton() {
       pc24.Continuebtn1();

    }

    @When(":User Click Delete Account button.")
    public void userClickDeleteAccountButton() {
        pc24.AccountDelete();

    }

    @Then(":User Verify ACCOUNT DELETED! and click Continue button.")
    public void userVerifyACCOUNTDELETEDAndClickContinueButton() throws IOException {
        pc24.verifyaccountDelete();
        pc24.Continuebtn1();
        screenshots(driver,"ImageTc-24");
    }



}
