package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest7  {

    WebDriver driver;

    public pomTest7(WebDriver driver){// constructor
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//a[text()=' Test Cases']")
    WebElement clkbtn;

    @FindBy(xpath = "//span[text()='Test']")
    WebElement testcase;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getClkbtn() {
        return clkbtn;
    }

    public WebElement getTestcase() {
        return testcase;
    }
}
