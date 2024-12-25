package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest8 {

    WebDriver driver;

    public pomTest8(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()=' Products']")
    WebElement ProductsButton;

    @FindBy(xpath = "//h2[text()='All Products']")
    WebElement allproducts;

    @FindBy(xpath = "(//a[text()='View Product'])[1]")
    WebElement viewproduct;

    @FindBy(xpath = "(//div[@class='row'])[2]")
    WebElement productdetail;

    public WebElement getVerifyuserdetail() {
        return verifyuserdetail;
    }

    @FindBy(xpath = "//div[@class='product-information']")
    WebElement verifyuserdetail;

    public WebElement getProductdetailpage() {
        return productdetailpage;
    }

    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    WebElement productdetailpage;



    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getProductsButton() {
        return ProductsButton;
    }

    public WebElement getAllproducts() {
        return allproducts;
    }

    public WebElement getViewproduct() {
        return viewproduct;
    }

    public WebElement getProductdetail() {
        return productdetail;
    }




}
