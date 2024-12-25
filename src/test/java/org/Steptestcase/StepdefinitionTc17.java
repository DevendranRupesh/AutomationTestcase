package org.Steptestcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepdefinitionTc18 {

    WebDriver driver;
    @Given(": User should Launch Browser")
    public void userShouldLaunchBrowser() {

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @Given(": User should Navigate to url")
    public void userShouldNavigateToUrl() {

        driver.navigate().to("http://automationexercise.com");

    }
    @Then(":Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {

        WebElement verifycategory = driver.findElement(By.xpath("//div[@class='left-sidebar']"));
        String text = verifycategory.getText();
        Assert.assertEquals(text,"Category");


    }
    @When(":Click on Women category")
    public void clickOnWomenCategory() {

        WebElement Womencategory = driver.findElement(By.xpath("//*[@id='accordian']/div[1]/div[1]/h4/a"));
        JavascriptExecutor js1= (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();",Womencategory);

    }
    @When(":Click on any category link under Women category for example Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {

        WebElement Dress = driver.findElement(By.xpath("//*[@id='Women']/div/ul/li[1]/a"));
        JavascriptExecutor js2=(JavascriptExecutor)driver;
        js2.executeScript("arguments[0].click();",Dress);


    }
    @Then(":Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {

        WebElement verifyWomentext = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        String text2 = verifyWomentext.getText();
        System.out.println("verify Women Text:"+text2);


    }
    @When(":On left side bar click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() {



    }
    @Then(":Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() {




    }




}
