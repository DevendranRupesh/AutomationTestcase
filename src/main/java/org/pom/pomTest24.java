package org.pom;

import org.Testcase.Base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class pomTest24 extends Baseclass {
    public By verifyBilling = By.xpath("//li[@class='address_title']//following::h3");

    public void verifyBilling() {
        log(retrivetext(driver.findElement(verifyBilling)));

    }

    public By registerlogin =By.xpath("//u[text()='Register / Login']");
    public void registerlogin(){
        Btnclick(driver.findElement(registerlogin));
    }


    public By cartbtn= By.xpath(" //a[text()=' Cart']");
    public void cartbtn(){
        Btnclick(driver.findElement(cartbtn));
    }

    public By verifydelivery = By.xpath("//h3[text()='Your delivery address']");

    public void verifydelivery() {
        log(retrivetext(driver.findElement(verifydelivery)));
    }

    public By revieworder = By.id("cart_info");

    public void revieworder() {
        List<WebElement> reviewoder = driver.findElements(revieworder);
        for (WebElement element : reviewoder) {
            log(retrivetext(element));
        }
    }

    public By Description = By.xpath("//textarea[@class='form-control']");

    public void Description() {
        insert(driver.findElement(Description), "All products With good quality");
    }

    public By placeorder = By.xpath("//a[text()='Place Order']");

    public void placeorder() {
        setJs(driver.findElement(placeorder));

    }

    public By Namecard = By.cssSelector("[data-qa='name-on-card']");

    public void Namecard() {
        insert(driver.findElement(Namecard), "Srirajesh");

    }

    public By cardnumber = By.xpath("//input[@name='card_number']");

    public void cardnumber() {
        insert(driver.findElement(cardnumber), "16252446666666");
    }

    public By cvcno = By.cssSelector("[data-qa='cvc']");

    public void cvcno() {
        insert(driver.findElement(cvcno), "014");
    }

    public By expiryMonth = By.name("expiry_month");

    public void expiryMonth() {
        insert(driver.findElement(expiryMonth), "October");
    }

    public By year = By.cssSelector("[data-qa='expiry-year']");

    public void year() {
        insert(driver.findElement(year), "1957");
    }

    public By placeoder1 = By.xpath("//button[@class='form-control btn btn-primary submit-button']");

    public void placeoder1() {
        Btnclick(driver.findElement(placeoder1));
    }

    public By verifymessage = By.xpath("//p[text()='Congratulations! Your order has been confirmed!']");

    public void verifymessage() {
        log(retrivetext(driver.findElement(verifymessage)));
    }
    public By downloadinvoice= By.xpath("//a[@class='btn btn-default check_out']");
    public void downloadinvoice(){
        Btnclick(driver.findElement(downloadinvoice));
    }

    public By AccountDelete = By.xpath("//a[text()=' Delete Account']");

    public void AccountDelete() {
        setJs(driver.findElement(AccountDelete));
    }

    public By verifyaccountDelete = By.xpath("//b[text()='Account Deleted!']");

    public void verifyaccountDelete() {
        log(retrivetext(driver.findElement(verifyaccountDelete)));
    }

    public By continuebtn1 = By.cssSelector("[data-qa='continue-button']");

    public void Continuebtn1() {
        setJs(driver.findElement(continuebtn1));
    }


}






