package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest19  {
    WebDriver driver;

    public pomTest19(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@style='font-size: 16px;']")
    WebElement productbtn;

    @FindBy(css = "div.brands_products h2")
    WebElement Brands1visible;

    @FindBy(xpath = "//a[text()='Polo']")
    WebElement brandname;

    @FindBy(css = "div.features_items h2")
    WebElement brandproducts;

    @FindBy(xpath = "//a[text()='Madame']")
    WebElement brandlink;

    @FindBy(css = "div.features_items h2")
    WebElement Brands2visible;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getProductbtn() {
        return productbtn;
    }

    public WebElement getBrands1visible() {
        return Brands1visible;
    }

    public WebElement getBrandname() {
        return brandname;
    }

    public WebElement getBrandproducts() {
        return brandproducts;
    }

    public WebElement getBrandlink() {
        return brandlink;
    }

    public WebElement getBrands2visible() {
        return Brands2visible;
    }
}
