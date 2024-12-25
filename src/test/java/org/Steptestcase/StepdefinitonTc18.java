package org.Steptestcase;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.Testcase.Base.Baseclass;
import org.junit.Assert;
import org.pom.pomTest18;

import java.io.IOException;

public class StepdefinitonTc18 extends Baseclass {

    pomTest18 pc18;

    @Given(":Verify that categories are visible on left side bar")
    public void verifyThatCategoriesAreVisibleOnLeftSideBar() {
        pc18= new pomTest18(driver);

        log("Text verified as:"+retrivetext(pc18.getVerifycategory()));
        Assert.assertTrue(retrivetext(pc18.getVerifycategory()),true);
    }
    @When(":Click on Women category")
    public void clickOnWomenCategory() {

        setJs(pc18.getWomencategory());
    }
    @When(":Click on any category link under Women category for example Dress")
    public void clickOnAnyCategoryLinkUnderWomenCategoryForExampleDress() {

        setJs(pc18.getDress());

    }
    @Then(":Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verifyThatCategoryPageIsDisplayedAndConfirmTextWOMENTOPSPRODUCTS() {

        log("verify Women Text:"+retrivetext(pc18.getVerifyWomentext()));
        Assert.assertTrue(retrivetext(pc18.getVerifyWomentext()),true);

    }
    @When(":On left side bar click on any sub-category link of Men category")
    public void onLeftSideBarClickOnAnySubCategoryLinkOfMenCategory() throws InterruptedException {

        Timer();
        setJs(pc18.getMen());
        setJs(pc18.getTshirtbtn());
    }
    @Then(":Verify that user is navigated to that category page")
    public void verifyThatUserIsNavigatedToThatCategoryPage() throws IOException {

        log("verify the men text:"+retrivetext(pc18.getVerifyMen()));
        Assert.assertTrue(retrivetext(pc18.getVerifyMen()),true);
        screenshots(driver,"ImageTc-18");
    }


}
