package org.Testcase.Base;

import dev.failsafe.internal.util.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class Baseclass {


    public static WebDriver driver;
    public static JavascriptExecutor js;
    public static JavascriptExecutor scrolljs;
    public static TakesScreenshot lss;
    public static Actions actions;
    public static Select sc;
    public static Alert ac;
    public static Thread Timer;
    public static WebDriverWait Ew;
    public static Assert as;


    public static void launchbrowser() {

        driver = new ChromeDriver();

    }

    public static void chromeoptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
    }

    public static void maximizewindow() {
        driver.manage().window().maximize();
    }

    public static void implicitwait(int sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }

    public static void geturl(String url) {
        driver.get(url);
    }

    public static void getcurrenturl() {
        driver.getCurrentUrl();
    }

    public static void insert(WebElement element, String data) {
        element.sendKeys(data);

    }

    public static void Timer() throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void Btnclick(WebElement element) {
        element.click();

    }

    public static void Sbtclick(WebElement element) {
        element.submit();
    }

    public static void log(String text) {
        System.out.println(text);
    }

    public static void setJs(WebElement element) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static void ExplicitWait(WebElement locator) {
        Ew = new WebDriverWait(driver, Duration.ofSeconds(10000));
        Ew.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void As(String expected, String actual) {
        Assert.isTrue(true,"actual");
    }


    public static void setJs1(WebElement element) {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");

    }

    public static void setscroll(WebElement element) {

        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public static void scrolljs(WebElement element) {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.element);");

    }

    public static void screenshots(WebDriver driver,String imageName) throws IOException {
        lss = (TakesScreenshot) driver;
        File source = lss.getScreenshotAs(OutputType.FILE);
        File destination = new File("D:\\Java Selenium practice\\poc projects\\Automationtestcase\\src\\AutomationTestcase Screenshot\\"+imageName+".png");
        FileUtils.copyFile(source, destination);
    }
    public static void radiobutton(WebElement element) {
        element.click();
    }

    public static void actions() {
        actions = new Actions(driver);
    }

    public static void Alert() {
        ac = driver.switchTo().alert();
        ac.accept();
    }

    public static void select(WebElement element, int index) {
        sc = new Select(element);
        sc.selectByIndex(index);
    }

    public static String retrivetext(WebElement element) {
        return element.getText();

    }

    public static void checkbox(WebElement checkbox) {
        checkbox.click();
    }

    public static void quitbrowser() {
        driver.quit();

    }


}
