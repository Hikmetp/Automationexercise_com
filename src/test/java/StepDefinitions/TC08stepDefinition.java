package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TC08_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.*;
import static utilities.ReusableMethods.waitFor;


public class TC08stepDefinition {
    TC08_Pages tc08 = new TC08_Pages();

    @Then("Click on Products button")
    public void clickOnProductsButton() {
        tc08.productsButton.click();
    }

    //fffff
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        assertTrue(tc08.allProductsPage.isDisplayed());
    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() {
        assertEquals(34, tc08.allproductList.size());

    }

    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        tc08.firstPictureViewProduct.click();
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        String expectedUrl = "https://www.automationexercise.com/product_details/1";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
        waitFor(3);

    }

    @Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() throws InterruptedException {

        waitFor(5);
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,300)");

        assertTrue(tc08.firstPictureProductName.isDisplayed());
        assertTrue(tc08.firstPictureCategory.isDisplayed());
        assertTrue(tc08.firstPicturePrice.isDisplayed());
        assertTrue(tc08.firstPictureAvalibility.isDisplayed());
        assertTrue(tc08.firstPictureCondition.isDisplayed());
        assertTrue(tc08.firstPictureBrand.isDisplayed());


    }









    @Then("Click on Test Cases button")
    public void click_on_test_cases_button() {
        waitFor(5);
        tc08.testCasesButton.click();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        assertTrue(tc08.testCasesText.isDisplayed());
    }
}