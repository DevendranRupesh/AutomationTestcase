package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest17 {
    WebDriver driver;

    public pomTest17(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[data-product-id='1']")
    WebElement xbutton;

    @FindBy(xpath = "//p[@class='text-center']//following::b")
    WebElement verifycartempty;


    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getXbutton() {
        return xbutton;
    }

    public WebElement getVerifycartempty() {
        return verifycartempty;
    }


}
