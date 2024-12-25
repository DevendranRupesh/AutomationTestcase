package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoclass {

    WebDriver driver;

    public pojoclass (WebDriver driver){//constructor
        this.driver = driver();
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//img[@alt='Website for automation practice']")
    WebElement Homepage;




}
