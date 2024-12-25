package org.Steptestcase1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Steptestcase2 {

    WebDriver driver;

    @Given(":user should login the browser")
    public void userShouldLoginTheBrowser() {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @Given(": user navigate to url")
    public void userNavigateToUrl() {
        driver.get("http://automationexercise.com");
    }
    @Then(":  verify the homepage is visible sucessfully")
    public void verifyTheHomepageIsVisibleSucessfully() {

        WebElement homepage = driver.findElement(By.xpath("//a[text()=' Home']"));
        String text = homepage.getTagName();
        System.out.println("Homepage text is visible:"+text);

    }
    @When(":click on signup login button")
    public void clickOnSignupLoginButton() {
        WebElement signup = driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        signup.click();

    }
    @Then(": Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {

        WebElement logintxt = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        String text2 = logintxt.getText();
        Assert.assertTrue(text2, true);
    }
    @Then(": Enter correct emailaddress and password")
    public void enterCorrectEmailaddressAndPassword() {
        WebElement emailadd = driver.findElement(By.cssSelector("[data-qa='login-email']"));
        emailadd.sendKeys("ragu123@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[data-qa='login-password']"));
        password.sendKeys("ramesh1234567");

    }


    @When(": click login button")
    public void clickLoginButton() {

        WebElement lgnbtn = driver.findElement(By.xpath("//button[text()='Login']"));
        lgnbtn.click();
    }


    @Then(": Verify that Logged in as username should be visible")
    public void verifyThatLoggedInAsUsernameShouldBeVisible() {

        WebElement userverify = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
        String text2 = userverify.getText();
        System.out.println("username received as :"+text2);
    }


    @When(": Click Delete Account button")
    public void clickDeleteAccountButton() {
        WebElement delacc = driver.findElement(By.cssSelector("[href='/delete_account']"));
        delacc.click();

    }


    @Then(":  Verify that Account Delete is visible")
    public void verifyThatAccountDeleteIsVisible() {

        WebElement delacctext = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        String text3 = delacctext.getText();
        System.out.println("Text is visible:"+text3);
    }



}
