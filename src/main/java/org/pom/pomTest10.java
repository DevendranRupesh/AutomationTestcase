package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest10  {
    WebDriver driver;
    public pomTest10(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@class='fa fa-home']")
    WebElement Scrolldown;

    @FindBy(xpath="//h2[text()='Subscription']")
    WebElement verifytxt;

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email;

    @FindBy(xpath="//button[@type='submit']")
    WebElement Emailbtn;

    @FindBy(xpath = "//div[text()='You have been successfully subscribed!']")
    WebElement successmsg;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getScrolldown() {
        return Scrolldown;
    }

    public WebElement getVerifytxt() {
        return verifytxt;
    }

    public WebElement getEmail() {
        return Email;
    }

    public WebElement getEmailbtn() {
        return Emailbtn;
    }

    public WebElement getSuccessmsg() {
        return successmsg;
    }
}
