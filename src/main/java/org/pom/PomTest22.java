package org.pom;

import org.Testcase.Base.Baseclass;
import org.openqa.selenium.By;


import java.util.List;

public class PomTest22 extends Baseclass {

    public By scrollbottom= By.xpath("//h2[@class='title text-center']//following::h2[text()='recommended items']");
    public By verifyrecomenditem= By.xpath("//h2[@class='title text-center']//following::h2[text()='recommended items']");
    public By addtocartbtn = By.xpath("(//i[@class='fa fa-shopping-cart']//following::a[text()='Add to cart'])[70]");
    public By viewbtn =By.xpath("//u[text()='View Cart']");
    public By verifycartpage= By.xpath("//tr[@class='cart_menu']");



    public void scrollbottom(){
        setscroll(driver.findElement(scrollbottom));
    }
    public void verifyrecomenditem(){
       log(retrivetext(driver.findElement(verifyrecomenditem)));
    }
    public void addtocartbtn(){
        Btnclick(driver.findElement(addtocartbtn));
    }
    public void viewbtn(){
        Btnclick(driver.findElement(viewbtn));
    }
    public void verifycartpage(){
        log(retrivetext(driver.findElement(verifycartpage)));
    }

}
