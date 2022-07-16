package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC05_Pages {

    public TC05_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@style='color: orange;']")
    public WebElement homeWebElement;

    @FindBy(xpath = "(//span[.='Automation'])[1]")
    public WebElement automationExerciseFirst;

    @FindBy(xpath = "//span[.='Automation']")
    public WebElement automationExerciseWebList;

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement signUpLoginButton;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameTexBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement mailTexBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public  WebElement signupButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformation;

    @FindBy(xpath = "//*[.='Email Address already exist!']")
    public WebElement errorLetter;
}

