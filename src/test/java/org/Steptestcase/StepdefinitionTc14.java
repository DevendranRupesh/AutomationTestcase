package org.Steptestcase;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.pom.pomTest12;
import org.pom.pomTest13;
import org.pom.pomTest14;
import org.pom.registerpage;


import java.io.IOException;
import java.util.List;

public class StepdefinitionTc14 extends Baseclass {
   registerpage rm;
   pomTest12 pc12;
   pomTest13 pc13;
   pomTest14 pc14;

    @Given(": Verify  Home page  visible successfully")
    public void verifyHomePageVisibleSuccessfully() {
        rm= new registerpage(driver);
        pc12=new pomTest12(driver);
        pc13=new pomTest13(driver);
        pc14= new pomTest14(driver);

        log("Homepage Text is visible:" + retrivetext(rm.getHomepagetxt()));
        Assert.assertTrue(retrivetext(rm.getHomepagetxt()), true);
    }
    @Then(":  Add products to cart")
    public void addProductsToCart() throws InterruptedException {

        Btnclick(pc12.getProductbtn());

        Timer();
        setJs(pc13.getViewproduct());

        log(retrivetext(pc13.getProductdetail()));
        Assert.assertTrue(retrivetext(pc13.getProductdetail()),true);

        Btnclick(pc13.getAddtocart());

        Btnclick(pc12.getContinuebtn());

    }
    @When(": Click the Cart button")
    public void clickTheCartButton() throws InterruptedException {
        Timer();

        setJs(pc13.getCartbtn());
    }
    @When(": Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {

       log("verify the cart page:"+retrivetext(pc14.getVerifyThatCartPage()));
       Assert.assertTrue(retrivetext(pc14.getVerifyThatCartPage()),true);
    }
    @When(":Click Proceed To Checkout")
    public void clickProceedToCheckout() {

        Btnclick(pc14.getChkoutbtn());


    }
    @When(": Click Register Login button")
    public void clickRegisterLoginButton() {

        Btnclick(pc14.getRegisterBtn());

    }
    @When(":Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() throws InterruptedException {

        insert(pc14.getUsername(),"raguram43");
        insert(pc14.getEmail(),"raguram43@gmail.com");

        Btnclick(pc14.getSignupbtn());
        Btnclick(pc14.getTitle());

        insert(pc14.getPassword(),"raguram123456");
        select(pc14.getDays(),2);

        select(pc14.getMonths(),2);

        select(pc14.getYears(),2);

        Timer();

        setJs(pc14.getNewsletter());
        setJs(pc14.getOption());

        insert(pc14.getFirstname(),"rajesh");
        insert(pc14.getLastname(),"rajesh1234567");
        insert(pc14.getCompany(),"Miletechindustries");
        insert(pc14.getAddress1(),"plot no.66 ravisasta street");
        insert(pc14.getAddress2(),"vyasarpadi chennai-22");
        select(pc14.getCountry(),2);
        insert(pc14.getState(),"tamilnadu");
        insert(pc14.getCity(),"chennai");
        insert(pc14.getZipcode(),"600126");
        insert(pc14.getMobno(),"9999999999");
        setJs(pc14.getSubmit());

    }
    @When(":Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {

        log("verify text:" + retrivetext(pc14.getAccounttxt()));
        Assert.assertTrue(retrivetext(pc14.getAccounttxt()),true);

        setJs(pc14.getContinuebtn());

    }

    @Then(":Verify  Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() throws InterruptedException {

        Timer();
        log("verify text:"+retrivetext(pc14.getLoggedintxt()));
        Assert.assertTrue(retrivetext(pc14.getLoggedintxt()),true);
    }
    @When(":.Click Cart button")
    public void clickCartButton() throws InterruptedException {

        Timer();
        setJs(pc14.getCartbtn());

    }
    @When(":Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
       setJs(pc14.getChkoutbtn1());
    }
    @Then(":Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {

        log("verify DeliveryAddress :"+retrivetext(pc14.getVerifyBilling()));
        Assert.assertTrue(retrivetext(pc14.getVerifyBilling()),true);

        log("verify delivery Address:"+retrivetext(pc14.getVerifydelivery()));
        Assert.assertTrue(retrivetext(pc14.getVerifydelivery()),true);

        List<WebElement> reviewoder = pc14.getReviewoder();
        for(WebElement element:reviewoder){
           log(element.getText());
        }


    }
    @Then(":Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() throws InterruptedException {
        Timer();

        insert(pc14.getDescription(),"good products With quality");
        setJs(pc14.getPlaceoder());
    }
    @Then(":Enter payment details Name on Card Card Number  CVC Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

        insert(pc14.getNamecard(),"Devrajesh");
        insert(pc14.getCardnumber(),"16252445555555");
        insert(pc14.getCvcno(),"141");
        insert(pc14.getExpiryMonth(),"September");
        insert(pc14.getYear(),"2000");
    }
    @When(":Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {

        Sbtclick(pc14.getPlaceoder1());
    }
    @Then(":Verify success message Your order has been placed successfully")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {

        log("verify text message:"+retrivetext(pc14.getVerifymessage()));
        Assert.assertTrue(retrivetext(pc14.getVerifymessage()),true);
    }

    @When(": Click Delete the Account button")
    public void clickDeleteTheAccountButton() {
        setJs(pc14.getAccountDelete());

    }
    @Then(":. Verify ACCOUNT DELETED  and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() throws InterruptedException, IOException {

        Thread.sleep(1000);

        log("verify AccountDeleted:"+retrivetext(pc14.getVerifyaccountDelete()));
        Assert.assertTrue(retrivetext(pc14.getVerifyaccountDelete()),true);
        setJs(pc14.getContinuebtn1());
        screenshots(driver,"ImageTc-14");
    }
}
