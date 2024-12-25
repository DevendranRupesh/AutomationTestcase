package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest13  {

    WebDriver driver;
    public pomTest13(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getViewproduct() {
        return viewproduct;
    }

    public WebElement getProductdetail() {
        return productdetail;
    }

    public WebElement getQtyincrease() {
        return Qtyincrease;
    }

    public WebElement getAddtocart() {
        return Addtocart;
    }

    public WebElement getCartButton() {
        return CartButton;
    }

    public WebElement getVerifyqty() {
        return verifyqty;
    }

    public WebElement getAllproducts() {
        return Allproducts;
    }

    public WebElement getCartbtn() {
            return cartbtn;
    }

    @FindBy(xpath = "//h2[@class='title text-center']")
    WebElement Allproducts;

    @FindBy(xpath = "(//a[@style='color: brown;'])[1]")
    WebElement viewproduct;

    @FindBy(xpath = "//h2[text()='Blue Top']")
    WebElement productdetail;

    @FindBy(id = "quantity")
    WebElement Qtyincrease;

    @FindBy(css = "[type=button]")
    WebElement Addtocart;

    @FindBy(css = "p:nth-child(2) ")
    WebElement CartButton;

    @FindBy(xpath = "//table[@id='cart_info_table']/tbody/tr")
    WebElement verifyqty;

    @FindBy(xpath = "//a[@href='/view_cart']")
    WebElement cartbtn;





}
