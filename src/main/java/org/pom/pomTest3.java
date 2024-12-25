package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest3  {

    WebDriver driver;

    public pomTest3(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    WebElement Errormessage;


    public WebElement getErrormessage() {
        return Errormessage;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
