package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest6 {


    WebDriver driver;

    public pomTest6(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()=' Contact us']")
    WebElement contact;

    @FindBy(xpath = "//h2[text()='Get In Touch']")
    WebElement gettext;

    @FindBy(css = "[data-qa='name']")
    WebElement name;

    @FindBy(css = "[type='email'][data-qa='email']")
    WebElement email;

    @FindBy(css = "[placeholder='Subject']")
    WebElement subject;

    @FindBy(css = "#message")
    WebElement message;

    @FindBy(xpath = "//input[@type='file']")
    WebElement uploadfile;

    @FindBy(css = "[data-qa='submit-button']")
    WebElement clkbtn;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    WebElement verify;

    @FindBy(xpath = "//span[text()=' Home']")
    WebElement homebtn;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getContact() {
        return contact;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSubject() {
        return subject;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getUploadfile() {
        return uploadfile;
    }

    public WebElement getClkbtn() {
        return clkbtn;
    }

    public WebElement getVerify() {
        return verify;
    }

    public WebElement getHomebtn() {
        return homebtn;
    }

    public WebElement getGettext() {
        return gettext;
    }
}
