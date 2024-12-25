package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest18  {

    WebDriver driver;


    public pomTest18(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='left-sidebar']")
    WebElement verifycategory;

    @FindBy(xpath = "//*[@id='accordian']/div[1]/div[1]/h4/a")
    WebElement Womencategory;

    @FindBy(xpath = "//*[@id='Women']/div/ul/li[1]/a")
    WebElement Dress;

    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement verifyWomentext;

    @FindBy(xpath = "//a[@href='#Men']")
    WebElement Men;

    @FindBy(xpath = "//a[text()='Tshirts ']")
    WebElement Tshirtbtn;

    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement verifyMen;


    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getVerifycategory() {
        return verifycategory;
    }

    public WebElement getWomencategory() {
        return Womencategory;
    }

    public WebElement getDress() {
        return Dress;
    }

    public WebElement getVerifyWomentext() {
        return verifyWomentext;
    }

    public WebElement getMen() {
        return Men;
    }

    public WebElement getTshirtbtn() {
        return Tshirtbtn;
    }

    public WebElement getVerifyMen() {
        return verifyMen;
    }


}
