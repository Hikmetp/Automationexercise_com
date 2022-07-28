package StepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.TC08_Pages;
import pages.TC14_Page;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.waitFor;

public class TC14_StepDefinition {
    TC14_Page tc14 = new TC14_Page();
    Actions actions=new Actions(Driver.getDriver());
    @Then("Add products to cart")
    public void addProductsToCart() {
   tc14.AddcartButton.click();
   tc14.continueShoppingButton.click();
    }

    @Then("Click Cart button")
    public void clickCartButton() {
    tc14.cartButton.click();
    }

    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        String expectedUrl = "https://www.automationexercise.com/view_cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
        waitFor(3);
    }

    @Then("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
     tc14.ProceedToCheckout.click();
     tc14.SignupNameBox.sendKeys(ConfigReader.getProperty("contactUsName"));
     tc14.SignupEmailBox.sendKeys(ConfigReader.getProperty("contactUsEmail"));
    }

    @Then("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
        tc14.RegisterLogin.click();
        tc14.mrButton.click();
        tc14.password.sendKeys(ConfigReader.getProperty("password"));
        Select select=new Select(tc14.day);
        select.selectByVisibleText("10");
        Select select2=new Select(tc14.months);
        select.selectByVisibleText("February");
        Select select3=new Select(tc14.years);
        select.selectByVisibleText("1987");

      //  tc14.day.clear();
        tc14.day.sendKeys(ConfigReader.getProperty("10"));
        tc14.months.sendKeys(ConfigReader.getProperty("February"));
        tc14.years.sendKeys(ConfigReader.getProperty("1987"));
        tc14.textNewsletter.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tc14.firstName.sendKeys(ConfigReader.getProperty("contactUsName"));
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("lastName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("company"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("address"))
                .sendKeys(Keys.TAB)

                .sendKeys(ConfigReader.getProperty("country"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("state"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("city"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("zipcode"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("mobile")).perform();
        tc14.createAccontButton.click();

    }


    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        assertTrue(tc14.AccountCreatedText.isDisplayed());
        tc14.continueButton.click();
        }


    @Then("Click Register \\/ Login button")
    public void clickRegisterLoginButton() {

    }

    @Then("Verify  Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {

    }

    @Then("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {

    }

    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {

    }

    @Then("Enter description in comment text area and click {string}")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {

    }

    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {

    }

    @Then("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {

    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {

    }

    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {

    }


}
