package org.pom;

import org.Testcase.Base.Baseclass;
import org.openqa.selenium.By;


public class pomTest21 extends Baseclass {


    public By productbtn = By.xpath("//a[text()=' Products']");
    public By producttxt = By.xpath("//h2[@class='title text-center']");
    public By viewproduct= By.xpath("(//a[@style='color: brown;'])[1]");
    public By reviewbtn = By.xpath("//a[@data-toggle='tab']");
    public By name =By.id("name");
    public By email = By.id("email");
    public By review =By.id("review");
    public By submitbtn= By.id("button-review");
    public By sucessmessage = By.xpath("//span[@style='font-size: 20px;']");


    public void Productbtn() {
       Btnclick(driver.findElement(productbtn));
    }

    public void Producttxt() {
      retrivetext(driver.findElement(producttxt));
    }

    public void viewproduct(){
        Btnclick(driver.findElement(viewproduct));
    }
    public void reviewbtn(){
        Btnclick(driver.findElement(reviewbtn));
    }
    public void name(){
       insert(driver.findElement(name),"rajesh");
    }
    public void email(){
        insert(driver.findElement(email),"rajesh@gmail,com");
    }
    public void review(){
       insert (driver.findElement(review),"ramnefgst");
    }

    public void submitbtn(){
       Sbtclick(driver.findElement(submitbtn));
    }

    public void sucessmessage(){
       retrivetext(driver.findElement(sucessmessage));
    }

}
