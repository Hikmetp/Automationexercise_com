package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC05_Pages;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class TC05_StepDefinition {
    TC05_Pages tc05pages = new TC05_Pages();

    @Given("Navigate to url")
    public void navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));
    }

    @Then("Click on Signup \\/ Login button")
    public void clickOnSignupLoginButton() {
        tc05pages.signUpLoginButton.click();
    }

    @Then("Verify New User Signup! is visible")
    public void verifyNewUserSignupIsVisible() {
        assertTrue(tc05pages.newUserSignup.isDisplayed());
    }

    @Then("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        tc05pages.nameTexBox.sendKeys(ConfigReader.getProperty("kullaniciadi"));
        tc05pages.mailTexBox.sendKeys(ConfigReader.getProperty("validMail"));
    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        tc05pages.signupButton.click();
    }

    @Then("Verify error Email Address already exist! is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        assertTrue(tc05pages.errorLetter.isDisplayed());
    }

    @Then("close the browser as want")
    public void closeTheBrowserAsWant() {
        Driver.closeDriver();
    }
}
