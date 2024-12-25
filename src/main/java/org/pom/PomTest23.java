package org.pom;

import org.Testcase.Base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class PomTest23 extends Baseclass {

    Actions actions = new Actions(driver);

    public By homepagetxt = By.xpath("//a[text()=' Home']");
    public By loginbtn = By.xpath("//a[text()=' Signup / Login']");
    public By signuptxt = By.xpath("//h2[text()='New User Signup!']");
    public By loginname = By.xpath("//input[@type='text']");
    public By loginemail = By.xpath("//input[@data-qa='signup-email']");
    public By Signupbtn = By.xpath("//button[@data-qa='signup-button']");
    public By visibletxt = By.xpath("//b[text()='Enter Account Information']");
    public By title = By.xpath("//input[@value='Mr']");
    public By Name2 = By.xpath("//input[@type='text']");
    public By pass = By.xpath("//input[@type='password']");
    public By days = By.id("days");
    public By months = By.id("months");
    public By years = By.id("years");
    public By radiobtn1 = By.id("newsletter");
    public By receiveoffbtn = By.id("optin");
    public By firstname = By.id("first_name");
    public By lastname = By.cssSelector("#last_name");
    public By company = By.cssSelector("#company");
    public By Address = By.cssSelector("p>input[data-qa='address']");
    public By Add2 = By.cssSelector("p>input[data-qa='address2']");
    public By country = By.cssSelector("#country");
    public By state = By.id("state");
    public By cty = By.id("city");
    public By zpcode = By.id("zipcode");
    public By Mobno = By.cssSelector("[data-qa='mobile_number']");
    public By createAcbtn = By.xpath("//button[@data-qa='create-account']");
    public By Accverify = By.xpath("//b[text()='Account Created!']");
    public By continueBtn = By.cssSelector("[class='btn btn-primary']");
    public By usertext = By.xpath("//a[text()=' Logged in as ']");
    public By productbtn = By.xpath("//i[@style='font-size: 16px;']");
    public By product1 = By.xpath("//div[@class='col-sm-4']//following::img[@src='/get_product_picture/1']");
    public By Addtocart = By.xpath("(//a[@data-product-id='1']//parent::a[text()='Add to cart'])[1]");
    public By continuebtn = By.xpath("//button[text()='Continue Shopping']");
    public By product2 = By.xpath("//div[@class='col-sm-4']//following::img[@src='/get_product_picture/2']");
    public By Addtocart1 = By.xpath("(//a[@data-product-id='2']//parent::a[text()='Add to cart'])[1]");
    public By cartBtn = By.cssSelector("p:nth-child(2)");
    public By cartpageverify = By.cssSelector("#cart_info");
    public By chkoutpage = By.xpath("//a[text()='Proceed To Checkout']");
    public By verifyBilling = By.xpath("//li[@class='address_title']//following::h3");
    public By verifydelivery = By.xpath("//h3[text()='Your delivery address']");
    public By AccountDelete = By.xpath("//a[text()=' Delete Account']");
    public By verifyaccountDelete = By.xpath("//b[text()='Account Deleted!']");
    public By continuebtn1 = By.cssSelector("[data-qa='continue-button']");

    public void homepagetxt() {
        log(retrivetext(driver.findElement(homepagetxt)));
    }

    public void loginbtn() {
        Btnclick(driver.findElement(loginbtn));
    }

    public void signuptxt() {
        log(retrivetext(driver.findElement(signuptxt)));
    }

    public void loginname() {
        insert(driver.findElement(loginname), "naveen34");
    }

    public void loginemail() {
        insert(driver.findElement(loginemail), "naveen34@gmail.com");
    }

    public void Signupbtn() {
        Btnclick(driver.findElement(Signupbtn));
    }

    public void visibletxt() {
        log(retrivetext(driver.findElement(visibletxt)));
    }

    public void Title() {
        Btnclick(driver.findElement(title));
    }

    public void Name2() {
        insert(driver.findElement(Name2), "Naveen");
    }

    public void pass() {
        insert(driver.findElement(pass), "naveen123456");
    }

    public void days() {
        select(driver.findElement(days), 2);
    }

    public void month() {
        select(driver.findElement(months), 3);
    }

    public void year() {
        select(driver.findElement(years), 5);
    }

    public void radiobtn1() {
        setJs(driver.findElement(radiobtn1));
    }

    public void receiveoffbtn() {
        setJs(driver.findElement(receiveoffbtn));
    }

    public void firstname() {
        insert(driver.findElement(firstname), "naresh");
    }

    public void lastname() {
        insert(driver.findElement(lastname), "kumar");
    }

    public void company() {
        insert(driver.findElement(company), "miletech");
    }

    public void Address() {
        insert(driver.findElement(Address), "no.65 rahumanst varanasi");
    }

    public void Add2() {
        insert(driver.findElement(Add2), "vayalveli");
    }

    public void country() {
        select(driver.findElement(country), 5);

    }

    public void state() {
        insert(driver.findElement(state), "tamilnadu");
    }

    public void cty() {
        insert(driver.findElement(cty), "chennai");
    }

    public void zpcode() {
        insert(driver.findElement(zpcode), "chennai-32");
    }

    public void Mobno() {
        insert(driver.findElement(Mobno), "9999999999");
    }

    public void createAcbtn() {
        Sbtclick(driver.findElement(createAcbtn));
    }

    public void Accverify() {
        log(retrivetext(driver.findElement(Accverify)));
    }

    public void continueBtn() {
        Btnclick(driver.findElement(continueBtn));
    }

    public void usertext() {
        log(retrivetext(driver.findElement(usertext)));
    }

    public void productbtn() {
        Btnclick(driver.findElement(productbtn));
    }

    public void product1() {

        actions.click(driver.findElement(product1)).perform();

    }

    public void Addtocart() {
        Btnclick(driver.findElement(Addtocart));
    }

    public void continuebtn() {
        Btnclick(driver.findElement(continuebtn));
    }

    public void product2() {
        actions.click(driver.findElement(product2)).perform();

    }

    public void Addtocart1() {
        setJs(driver.findElement(Addtocart1));
    }

    public void cartBtn() {
        Btnclick(driver.findElement(cartBtn));
    }

    public void cartpageverify() {
        log(retrivetext(driver.findElement(cartpageverify)));
    }

    public void chkoutpage() {
        Btnclick(driver.findElement(chkoutpage));
    }

    public void verifyBilling() {
        log(retrivetext(driver.findElement(verifyBilling)));
    }

    public void verifydelivery() {
        log(retrivetext(driver.findElement(verifydelivery)));
    }

    public void AccountDelete() {
        Btnclick(driver.findElement(AccountDelete));
    }

    public void verifyaccountDelete() {
        log(retrivetext(driver.findElement(verifyaccountDelete)));
    }

    public void continuebtn1() {
        Btnclick(driver.findElement(continuebtn1));
    }
}
