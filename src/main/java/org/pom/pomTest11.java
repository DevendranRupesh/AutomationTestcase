package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest11  {
    WebDriver driver;

    public pomTest11(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()=' Cart']")
    WebElement cartpage;

    @FindBy(xpath = "//h2[text()='Subscription']")
    WebElement verifytxt;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getCartpage() {
        return cartpage;
    }

    public WebElement getVerifytxt() {
        return verifytxt;
    }
}
