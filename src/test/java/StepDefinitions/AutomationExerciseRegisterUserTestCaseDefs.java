package StepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.G3AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class AutomationExerciseRegisterUserTestCaseDefs {

    G3AutomationExercisePage automationExercisePage = new G3AutomationExercisePage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("launch the browser02")
    public void launch_the_browser02() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver();
        //throw new io.cucumber.java.PendingException();
    }
    @When("navigate to the url02")
    public void navigate_to_the_url02() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigReader.getProperty("automationexercise_url"));
        //throw new io.cucumber.java.PendingException();
    }
    @Then("verify the homepage if it is visible successfully02")
    public void verify_the_homepage_if_it_is_visible_successfully02() {
        // Write code here that turns the phrase above into concrete actions
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://automationexercise.com/";
        Assert.assertEquals(expectedUrl,actualUrl);
        //throw new io.cucumber.java.PendingException();
    }
    @Then("click on signup or login button")
    public void click_on_signup_or_login_button() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.signupLoginButton.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("verify new user signup caution is visible")
    public void verify_new_user_signup_caution_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(automationExercisePage.newUserSignUp.isDisplayed());
        //throw new io.cucumber.java.PendingException();
    }
    @Then("enter name and email address")
    public void enter_name_and_email_address() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.signupNameBox.sendKeys(faker.name().username());
        automationExercisePage.signupEmailBox.sendKeys(faker.internet().emailAddress());
        //throw new io.cucumber.java.PendingException();
    }
    @Then("click on the signup button")
    public void click_on_the_signup_button() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.signupButton.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("verify the ENTER ACCOUNT INFORMATION is visible")
    public void verify_the_enter_account_information_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(automationExercisePage.enterAccountInformation.isDisplayed());
        //throw new io.cucumber.java.PendingException();
    }
    @Then("fill details title name email password dob")
    public void fill_details_title_name_email_password_dob() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.mrGenderRadioButton.click();
        actions
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("August")
                .sendKeys(Keys.TAB)
                .sendKeys("1983")
                .perform();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("select the signup for our newsletter checkbox")
    public void select_the_signup_for_our_newsletter_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        actions.scrollToElement(automationExercisePage.newsletterCheckBox);
        automationExercisePage.newsletterCheckBox.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("select the receive special offers from our partners checkbox")
    public void select_the_receive_special_offers_from_our_partners_checkbox() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.specialOffersCheckBox.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("fill details firstname lastname company address address2 country state city zipcode mobile number")
    public void fill_details_firstname_lastname_company_address_address2_country_state_city_zipcode_mobile_number() {
        // Write code here that turns the phrase above into concrete actions
        actions.scrollToElement(automationExercisePage.firstnameBox);
        automationExercisePage.firstnameBox.sendKeys(faker.name().firstName());
        actions
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("click create account button")
    public void click_create_account_button() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.createAccountButton.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("verify that ACCOUNT CREATED is visible")
    public void verify_that_account_created_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(automationExercisePage.accountCreated.isDisplayed());
        //throw new io.cucumber.java.PendingException();
    }
    @Then("click continue button")
    public void click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.continueButton.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("verify Logged in as username is visible")
    public void verify_logged_in_as_username_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(automationExercisePage.userNameVisible.isDisplayed());
        //throw new io.cucumber.java.PendingException();
    }
    @Then("click Delete Account button")
    public void click_delete_account_button() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.deleteAccountButton.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("verify that ACCOUNT DELETED is visible and click Continue button")
    public void verify_that_account_deleted_is_visible_and_click_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        automationExercisePage.deletionConfirmButton.click();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("close the browser")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        Driver.closeDriver();
        //throw new io.cucumber.java.PendingException();
    }
}
