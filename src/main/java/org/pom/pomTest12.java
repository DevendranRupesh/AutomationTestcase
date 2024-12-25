package org.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomTest12  {

    WebDriver driver;
    public pomTest12(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//i[@style='font-size: 16px;']")
    WebElement productbtn;

    @FindBy(xpath = "//img[@src='/get_product_picture/1']")
    WebElement Hower1;

    @FindBy(xpath="(//a[@data-product-id='1']//parent::a[text()='Add to cart'])[1]")
    WebElement Addtocart;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    WebElement continuebtn;

    @FindBy(xpath = "//img[@src='/get_product_picture/2']")
    WebElement product2;

    @FindBy(xpath = "(//a[@data-product-id='2']//parent::a[text()='Add to cart'])[1]")
    WebElement Addtocart1;

    @FindBy(xpath = "//p[@class='text-center']//child::a")
    WebElement viewbtn;

    @FindBy(xpath = "//p[text()='Women > Tops']")
    WebElement verifyproduct1;

    @FindBy(xpath = "//p[text()='Men > Tshirts']")
    WebElement verifyproduct2;

    @FindBy(xpath = "//p[text()='Rs. 500']//parent::td[@class='cart_price']")
    WebElement price1;

    @FindBy(xpath = "//p[text()='Rs. 400']//parent::td[@class='cart_price']")
    WebElement price2;

    @FindBy(xpath = "(//button[text()='1']//parent::td[@class='cart_quantity'])[1]")
    WebElement Qty1;

    @FindBy(xpath = "(//button[text()='1']//parent::td[@class='cart_quantity'])[2]")
    WebElement Qty2;

    @FindBy(xpath = "//p[text()='Rs. 500']//parent::td[@class='cart_total']")
    WebElement Totalprice1;

    @FindBy(xpath = "//p[text()='Rs. 400']//parent::td[@class='cart_total']")
    WebElement Totalprice2;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getProductbtn() {
        return productbtn;
    }

    public WebElement getHower1() {
        return Hower1;
    }

    public WebElement getAddtocart() {
        return Addtocart;
    }

    public WebElement getContinuebtn() {
        return continuebtn;
    }

    public WebElement getProduct2() {
        return product2;
    }

    public WebElement getAddtocart1() {
        return Addtocart1;
    }

    public WebElement getViewbtn() {
        return viewbtn;
    }

    public WebElement getVerifyproduct1() {
        return verifyproduct1;
    }

    public WebElement getVerifyproduct2() {
        return verifyproduct2;
    }

    public WebElement getPrice1() {
        return price1;
    }

    public WebElement getPrice2() {
        return price2;
    }

    public WebElement getQty1() {
        return Qty1;
    }

    public WebElement getQty2() {
        return Qty2;
    }

    public WebElement getTotalprice1() {
        return Totalprice1;
    }

    public WebElement getTotalprice2() {
        return Totalprice2;
    }
}
