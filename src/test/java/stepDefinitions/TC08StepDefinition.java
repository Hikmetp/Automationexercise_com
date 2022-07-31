
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.TC08Page;



import static org.junit.Assert.*;
import static utilities.Driver.*;


public class TC08StepDefinition {
    private TC08Page tc08 = new TC08Page(driver);



    @And("Click on Test Cases button")
    public void clickOnTestCasesButton() {

        tc08.click_button();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        tc08.verify_user_is_navigated_to_test_cases_page_successfully();
    }
    @Then("Click on Products button")
    public void click_on_products_button() {
        tc08.clickProductsButton();
    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        tc08.verifyPageSuccessfully();
    }
    @Then("The products list is visible")
    public void the_products_list_is_visible() {
        tc08.productsListIsVisible();
    }
    @Then("Click on View Product of first product")
    public void click_on_view_product_of_first_product() {
        tc08.clickOfFirstProduct();
    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String expectedUrl = "https://automationexercise.com/product_details/1";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
    @Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_is_visible_product_name_category_price_availability_condition_brand() {
        tc08.verifyThatDetailDetailIsVisibleProduct();
    }


}




