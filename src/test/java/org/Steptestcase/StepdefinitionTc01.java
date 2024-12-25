package org.Steptestcase1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Stepdefinitiontc01 {

    WebDriver driver;
    @Given(":Launch the browser")
    public void launchTheBrowser() {

         driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @Given(":  User navigate to the url page")
    public void userNavigateToTheUrlPage() {
        driver.get("http://automationexercise.com");


    }
    @Then(": Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        WebElement homepagetxt = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
        String text = homepagetxt.getText();
        System.out.println("Homepage Text is visible:"+text);

    }
    @When(":Click on Signup & Login button")
    public void clickOnSignupLoginButton() {
        WebElement loginbtn = driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
        loginbtn.click();
    }
    @Then(":Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {

        WebElement signuptxt = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        String text1 = signuptxt.getText();
        System.out.println("signup text is visible:"+text1);

    }
    @Then(":Enter name and email address")
    public void enterNameAndEmailAddress() {

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kkabir");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("kkabir1234@gmail.com");

    }
    @When(":Click Signup button")
    public void clickSignupButton() {

        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

    }
    @Then(":Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {

        WebElement visibletxt = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        String text3 = visibletxt.getText();
        System.out.println("Text is clearly visible:"+text3);

    }
    @Then(":Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {

        WebElement title = driver.findElement(By.xpath("//input[@value='Mr']"));
        title.click();

        WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
        name.clear();
        name.sendKeys("sombir");

        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("kabir12345678");

        WebElement days = driver.findElement(By.id("days"));
        Select sc= new Select(days);
        sc.selectByIndex(3);

        WebElement months = driver.findElement(By.id("months"));
        Select sc1= new Select(months);
        sc1.selectByIndex(4);

        WebElement years = driver.findElement(By.id("years"));
        Select sc2= new Select(years);
        sc2.selectByIndex(3);
    }
    @Then(":Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() throws InterruptedException {
        Thread.sleep(1000);
        WebElement radiobtn1 = driver.findElement(By.id("newsletter"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(294, 670);");
        radiobtn1.click();

    }
    @Then(": Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() throws InterruptedException {

        WebElement receiveoffbtn = driver.findElement(By.id("optin"));
        receiveoffbtn.click();


    }
    @Then(":Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddress2CountryStateCityZipcodeMobileNumber() throws InterruptedException {
        Thread.sleep(1000);

        WebElement Firstname = driver.findElement(By.id("first_name"));
        Firstname.sendKeys("ramesh");


        WebElement lastname = driver.findElement(By.cssSelector("#last_name"));
        lastname.sendKeys("kumar");

        WebElement company = driver.findElement(By.cssSelector("#company"));
        company.sendKeys("miletechindustries");

        WebElement Address = driver.findElement(By.cssSelector("p>input[data-qa='address']"));
        Address.sendKeys("plot no.82 vinayagast");

        WebElement Add2 = driver.findElement(By.cssSelector("p>input[data-qa='address2']"));
        Add2.sendKeys("ramapuram extend road");

        Thread.sleep(1000);

        WebElement country = driver.findElement(By.cssSelector("#country"));
        Select sc3= new Select(country);
        sc3.selectByIndex(5);

        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys("tamilnadu");

        WebElement cty = driver.findElement(By.id("city"));
        cty.sendKeys("chennai");

        WebElement zpcode = driver.findElement(By.id("zipcode"));
        zpcode.sendKeys("600126");

        Thread.sleep(1000);

        WebElement Mobno = driver.findElement(By.cssSelector("[data-qa='mobile_number']"));
        Mobno.sendKeys("9999999999");

    }
    @When(":Click Create Account button")
    public void clickCreateAccountButton() {

        WebElement createAcbtn = driver.findElement(By.xpath("//button[@data-qa='create-account']"));
        createAcbtn.submit();
    }
    @Then(":Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        WebElement Accverify = driver.findElement(By.xpath("//b[text()='Account Created!']"));
        String text4 = Accverify.getText();
        System.out.println("Text is visible:"+text4);
    }
    @When(": Click Continue button")
    public void clickContinueButton() {

        WebElement continuebtn = driver.findElement(By.cssSelector("[class='btn btn-primary']"));
        continuebtn.click();

    }
    @Then(":Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {

        WebElement usertext = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        String text5 = usertext.getText();
        System.out.println("username is visible:"+text5);

    }
    @When(":Click Delete Account button")
    public void clickDeleteAccountButton() {

        WebElement DeleteAc = driver.findElement(By.xpath("//i[@class='fa fa-trash-o']"));
        DeleteAc.click();
    }
    @Then(":Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {

        WebElement Accdeltext = driver.findElement(By.cssSelector("[data-qa='account-deleted']"));
        String text6 = Accdeltext.getText();
        System.out.println("Text is visible:"+text6);

        WebElement continuebtn = driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
        continuebtn.click();

    }



}
