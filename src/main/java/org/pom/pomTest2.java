package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest2  {

    WebDriver driver;

    public pomTest2(WebDriver driver){
        this.driver =driver;
       PageFactory.initElements(driver,this);

    }
    @FindBy(xpath="//i[@class='fa fa-lock']")
    WebElement signup;

    @FindBy(xpath="//h2[text()='Login to your account']")
    WebElement logintxt;

    @FindBy(css = "[data-qa='login-email']")
    WebElement emailadd;

    @FindBy(css = "[data-qa='login-password']")
    WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement lgnbtn;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    WebElement userverify;

    @FindBy(css = "[href='/delete_account']")
    WebElement delacc;

    @FindBy(xpath = "//b[text()='Account Deleted!']")
    WebElement delacctext;

    public WebElement getDelacctext() {
        return delacctext;
    }

    public WebElement getDelacc() {
        return delacc;
    }

    public WebElement getUserverify() {
        return userverify;
    }

    public WebElement getLgnbtn() {
        return lgnbtn;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getEmailadd() {
        return emailadd;
    }

    public WebElement getLogintxt() {
        return logintxt;
    }

    public WebElement getSignup() {
        return signup;
    }

    public WebDriver getDriver() {
        return driver;
    }

}
