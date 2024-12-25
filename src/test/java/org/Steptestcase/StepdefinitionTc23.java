package org.Steptestcase;

import io.cucumber.java.en.*;
import org.pom.PomTest23;

import java.io.IOException;

import static org.Testcase.Base.Baseclass.*;

public class StepdefinitionTc23 {
    PomTest23 pc23 = new PomTest23();

    @Given(":User verify that home page is visible successfully.")
    public void userVerifyThatHomePageIsVisibleSuccessfully() {
        pc23.homepagetxt();
    }

    @When(":User Click Signup Login button.")
    public void userClickSignupLoginButton() {
        pc23.loginbtn();
    }

    @When(":User fill all detail in Signup and create account.")
    public void userFillAllDetailInSignupAndCreateAccount() {
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

    @Then(":User verify account created and click continue button.")
    public void userVerifyAccountCreatedAndClickContinueButton() throws InterruptedException {
        pc23.Accverify();
        Timer();

        pc23.continueBtn();


    }

    @Then(":User Verify logged in as username at top.")
    public void userVerifyLoggedInAsUsernameAtTop() {
        pc23.usertext();

    }

    @Then(":User add products to cart.")
    public void userAddProductsToCart() throws InterruptedException {

        pc23.productbtn();
        pc23.product1();
        pc23.Addtocart1();
        pc23.continuebtn();
        pc23.product2();
        pc23.Addtocart1();
        pc23.continuebtn();

    }

    @When(":User Click Cart button.")
    public void userClickCartButton() {
        pc23.cartBtn();

    }

    @Then(":User Verify that cart page is displayed.")
    public void userVerifyThatCartPageIsDisplayed() {
        pc23.cartpageverify();
    }

    @When(":User Click Proceed To Checkout.")
    public void userClickProceedToCheckout() {
        pc23.chkoutpage();

    }

    @Then(":User Verify that the delivery address is same address filled at the time registration of account.")
    public void userVerifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        pc23.verifydelivery();

    }

    @Then(":User Verify that the billing address is same address filled at the time registration of account.")
    public void userVerifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        pc23.verifyBilling();

    }

    @When(":User  Click Delete Account button.")
    public void userClickDeleteAccountButton() {
        pc23.AccountDelete();
    }

    @Then(":User Verify ACCOUNT DELETED and click Continue button.")
    public void userVerifyACCOUNTDELETEDAndClickContinueButton() throws IOException {
        pc23.verifyaccountDelete();
        screenshots(driver,"ImageTc-23");
    }


}
