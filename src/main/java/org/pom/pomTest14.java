package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class pomTest14  {
    WebDriver driver;

    public pomTest14(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath="//li[@class='active']")
    WebElement verifyThatCartPage;

    @FindBy(xpath = "//div[@class='col-sm-6']//a[@class='btn btn-default check_out']")
    WebElement chkoutbtn;

    @FindBy(xpath = "//u[text()='Register / Login']")
    WebElement RegisterBtn;

    @FindBy(css = "[placeholder='Name']")
    WebElement username;

    @FindBy(css = "[data-qa='signup-email']")
    WebElement email;

    @FindBy(css="[data-qa='signup-button']")
    WebElement signupbtn;

    @FindBy(id = "id_gender1")
    WebElement Title;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(name = "days")
    WebElement days;

    @FindBy(name = "months")
    WebElement months;

    @FindBy(name="years")
    WebElement years;

    @FindBy(id="newsletter")
    WebElement newsletter;

    @FindBy(id = "optin")
    WebElement option;

    @FindBy(xpath = "//input[@data-qa='first_name']")
    WebElement  firstname;

    @FindBy(xpath = "//input[@data-qa='last_name']")
    WebElement lastname;

    @FindBy(css = "[data-qa='company']")
    WebElement  company;

    @FindBy(id = "address1")
    WebElement  address1;

    @FindBy(id = "address2")
    WebElement address2;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(css="[data-qa='state']")
    WebElement state;

    @FindBy(xpath = "//input[@data-qa='city']")
    WebElement  city;

    @FindBy(id = "zipcode")
    WebElement  zipcode;

    @FindBy(css = "[data-qa='mobile_number']")
    WebElement mobno;

    @FindBy(xpath = "//p//following::button[@data-qa='create-account']")
    WebElement submit;

    @FindBy(xpath = "//b[text()='Account Created!']")
    WebElement Accounttxt;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continuebtn;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    WebElement loggedintxt;

    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement cartbtn;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    WebElement chkoutbtn1;

    @FindBy(xpath = "//li[@class='address_title']//following::h3")
    WebElement verifyBilling;

    @FindBy(xpath = "//h3[text()='Your delivery address']")
    WebElement verifydelivery;

    @FindBy(id = "cart_info")
    List<WebElement> reviewoder;


    @FindBy(xpath = "//textarea[@class='form-control']")
    WebElement Description;

    @FindBy(xpath = "//a[text()='Place Order']")
    WebElement placeoder;

    @FindBy(css = "[data-qa='name-on-card']")
    WebElement Namecard;

    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardnumber;

    @FindBy(css = "[data-qa='cvc']")
    WebElement cvcno;

    @FindBy(name = "expiry_month")
    WebElement expiryMonth;

    @FindBy(css = "[data-qa='expiry-year']")
    WebElement year;

    @FindBy(xpath = "//button[@class='form-control btn btn-primary submit-button']")
    WebElement placeoder1;

    @FindBy(xpath = "//p[text()='Congratulations! Your order has been confirmed!']")
    WebElement verifymessage;

    @FindBy(xpath = "//a[text()=' Delete Account']")
    WebElement AccountDelete;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    WebElement verifyaccountDelete;

    @FindBy(css = "[data-qa='continue-button']")
    WebElement continuebtn1;


    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getVerifyThatCartPage() {
        return verifyThatCartPage;
    }

    public WebElement getChkoutbtn() {
        return chkoutbtn;
    }

    public WebElement getRegisterBtn() {
        return RegisterBtn;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSignupbtn() {
        return signupbtn;
    }

    public WebElement getTitle() {
        return Title;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getDays() {
        return days;
    }

    public WebElement getMonths() {
        return months;
    }

    public WebElement getYears() {
        return years;
    }

    public WebElement getNewsletter() {
        return newsletter;
    }

    public WebElement getOption() {
        return option;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getCompany() {
        return company;
    }

    public WebElement getAddress1() {
        return address1;
    }

    public WebElement getAddress2() {
        return address2;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getZipcode() {
        return zipcode;
    }

    public WebElement getMobno() {
        return mobno;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public WebElement getAccounttxt() {
        return Accounttxt;
    }

    public WebElement getContinuebtn() {
        return continuebtn;
    }

    public WebElement getLoggedintxt() {
        return loggedintxt;
    }

    public WebElement getCartbtn() {
        return cartbtn;
    }

    public WebElement getChkoutbtn1() {
        return chkoutbtn1;
    }

    public WebElement getVerifyBilling() {
        return verifyBilling;
    }

    public WebElement getVerifydelivery() {
        return verifydelivery;
    }

    public List<WebElement> getReviewoder() {
        return  reviewoder;
    }

    public WebElement getDescription() {
        return Description;
    }

    public WebElement getPlaceoder() {
        return placeoder;
    }

    public WebElement getNamecard() {
        return Namecard;
    }

    public WebElement getCardnumber() {
        return cardnumber;
    }

    public WebElement getCvcno() {
        return cvcno;
    }

    public WebElement getExpiryMonth() {
        return expiryMonth;
    }

    public WebElement getYear() {
        return year;
    }

    public WebElement getPlaceoder1() {
        return placeoder1;
    }

    public WebElement getVerifymessage() {
        return verifymessage;
    }

    public WebElement getAccountDelete() {
        return AccountDelete;
    }

    public WebElement getVerifyaccountDelete() {
        return verifyaccountDelete;
    }

    public WebElement getContinuebtn1() {
        return continuebtn1;
    }
}

