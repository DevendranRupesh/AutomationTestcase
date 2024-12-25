package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {

    //constructor
    WebDriver driver;


    public registerpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//a[text()=' Home']")
    WebElement homepagetxt;

    @FindBy(xpath="//a[text()=' Signup / Login']")
    WebElement loginbtn;

    @FindBy(xpath="//h2[text()='New User Signup!']")
    WebElement signuptxt;

    @FindBy(xpath="//input[@type='text']")
    WebElement Name;

    @FindBy(xpath="//input[@data-qa='signup-email']")
    WebElement Email;

    @FindBy(xpath="//button[@data-qa='signup-button']")
    WebElement Signupbtn;

    @FindBy(xpath="//b[text()='Enter Account Information']")
    WebElement visibletxt;

    @FindBy(xpath="//input[@value='Mr']")
    WebElement title;

    @FindBy(xpath="//input[@type='text']")
    WebElement Name1;

    @FindBy(xpath="//input[@type='password']")
    WebElement pass;

    @FindBy(id="days")
    WebElement days;

    @FindBy(id="months")
    WebElement months;

    @FindBy(id="years")
    WebElement years;

    @FindBy(id="newsletter")
    WebElement radiobtn1;

    @FindBy(id="optin")
    WebElement receiveoffbtn;

    @FindBy(id="first_name")
    WebElement Firstname;

    @FindBy(css="#last_name")
    WebElement  lastname;

    @FindBy(css="#company")
    WebElement company;

    @FindBy(css="p>input[data-qa='address']")
    WebElement  Address;

    @FindBy(css="p>input[data-qa='address2']")
    WebElement Add2;

    @FindBy(css="#country")
    WebElement country;

    @FindBy(id="state")
    WebElement state;

    @FindBy(id="city")
    WebElement  cty;

    @FindBy(id="zipcode")
    WebElement zpcode;

    @FindBy(css="[data-qa='mobile_number']")
    WebElement Mobno;

    @FindBy(xpath="//button[@data-qa='create-account']")
    WebElement createAcbtn;

    @FindBy(xpath="//b[text()='Account Created!']")
    WebElement Accverify;

    @FindBy(css="[class='btn btn-primary']")
    WebElement continuebtn;

    @FindBy(xpath="//a[text()=' Logged in as ']")
    WebElement usertext;

    @FindBy(xpath="//i[@class='fa fa-trash-o']")
    WebElement DeleteAc;

    @FindBy(css="[data-qa='account-deleted']")
    WebElement Accdeltext;

    @FindBy(xpath="//a[@data-qa='continue-button']")
    WebElement continuebtn1;


    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getHomepagetxt() {
        return homepagetxt;
    }

    public WebElement getLoginbtn() {
        return loginbtn;
    }

    public WebElement getSignuptxt() {
        return signuptxt;
    }

    public WebElement getName() {
        return Name;
    }

    public WebElement getPass() {
        return pass;
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

    public WebElement getRadiobtn1() {
        return radiobtn1;
    }

    public WebElement getReceiveoffbtn() {
        return receiveoffbtn;
    }

    public WebElement getFirstname() {
        return Firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getCompany() {
        return company;
    }

    public WebElement getAddress() {
        return Address;
    }

    public WebElement getAdd2() {
        return Add2;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getCty() {
        return cty;
    }

    public WebElement getZpcode() {
        return zpcode;
    }

    public WebElement getMobno() {
        return Mobno;
    }

    public WebElement getCreateAcbtn() {
        return createAcbtn;
    }

    public WebElement getAccverify() {
        return Accverify;
    }

    public WebElement getContinuebtn() {
        return continuebtn;
    }

    public WebElement getUsertext() {
        return usertext;
    }

    public WebElement getAccdeltext() {
        return Accdeltext;
    }

    public WebElement getContinuebtn1() {
        return continuebtn1;
    }

    public WebElement getEmail() {
        return Email;
    }

    public WebElement getSignupbtn() {
        return Signupbtn;
    }

    public WebElement getVisibletxt() {
        return visibletxt;
    }

    public WebElement getTitle() {
        return title;
    }
    public WebElement getName1() {
        return Name1;
    }
    public WebElement getDeleteAc() {
        return DeleteAc;
    }


}
