package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTest9 {

    WebDriver driver;
    public PomTest9(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "search_product")
    WebElement searchproduct;

    @FindBy(id="submit_search")
    WebElement SearchBtn;

    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement verifysearchproduct;

    @FindBy(xpath = "(//div[@class='col-sm-4'])[2]")
    WebElement verifyallproduct;


    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getSearchproduct() {
        return searchproduct;
    }

    public WebElement getSearchBtn() {
        return SearchBtn;
    }

    public WebElement getVerifysearchproduct() {
        return verifysearchproduct;
    }

    public WebElement getVerifyallproduct() {
        return verifyallproduct;
    }
}
