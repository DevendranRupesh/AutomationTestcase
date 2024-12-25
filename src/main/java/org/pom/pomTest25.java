package org.pom;

import org.Testcase.Base.Baseclass;
import org.openqa.selenium.By;

public class pomTest25 extends Baseclass {

    public By scrolldown = By.xpath("//h2[text()='Subscription']");

    public void Scrolldown() {
        setscroll(driver.findElement(scrolldown));
    }

    public By subscriptiontextverify = By.xpath("//h2[text()='Subscription']");

    public void verifysubcriptiontxt() {
        log(retrivetext(driver.findElement(subscriptiontextverify)));
    }

    public By scrollup = By.xpath("//a[@id='scrollUp']");

    public void ScrollUp() {
        Btnclick(driver.findElement(scrollup));
    }

    public By scrollup1 = By.xpath("//a[@id='scrollUp']");

    public void scrollupwithoutarrowbtn() {
        scrolljs(driver.findElement(scrollup1));
    }


    public By verifyscrolluptext = By.xpath("(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]");

    public void Scrolluptextverify() {
        log(retrivetext(driver.findElement(verifyscrolluptext)));
    }
}
