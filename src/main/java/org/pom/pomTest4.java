package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest4 {
    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    public WebElement getLogout() {
        return logout;
    }
    public WebElement getUserverify2() {
        return userverify2;
    }
    public WebElement getUserverifylogin() {
        return userverifylogin;
    }
    public pomTest4(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[text()=' Logout']")
    WebElement logout;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    WebElement userverify2;
    @FindBy(xpath = "//h2[text()='Login to your account']")
    WebElement userverifylogin;
}
