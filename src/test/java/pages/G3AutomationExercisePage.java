package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class G3AutomationExercisePage {

    public G3AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement newUserSignUp;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement signupNameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signupEmailBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement enterAccountInformation;

    @FindBy(id = "id_gender1")
    public WebElement mrGenderRadioButton;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletterCheckBox;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement specialOffersCheckBox;

    @FindBy(id = "first_name")
    public WebElement firstnameBox;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h2[@class='title text-center']//b")
    public WebElement accountCreated;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//b")
    public WebElement userNameVisible;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement deletionConfirmButton;


}
