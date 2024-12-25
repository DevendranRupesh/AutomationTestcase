package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest5  {

    WebDriver driver;

    public pomTest5(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getErrortxt() {
        return errortxt;
    }

    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    WebElement errortxt;
}
