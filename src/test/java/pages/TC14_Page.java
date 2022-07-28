package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC14_Page {

    public  TC14_Page(){
        PageFactory.initElements((Driver.getDriver()),this);}



    @FindBy(xpath = "//*[@href='/product_details/1']")
    public WebElement AddcartButton;

    @FindBy(className = "modal-footer")
    public WebElement continueShoppingButton;

    @FindBy(className = "fa fa-shopping-cart")
    public WebElement cartButton;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement ProceedToCheckout;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement RegisterLogin;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement SignupNameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement SignupEmailBox;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement SignupButton;
    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrButton;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement day;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement months;
    @FindBy(xpath = "  //select[@id='years']")
    public WebElement years;
    @FindBy(xpath = " //input[@id='newsletter']")
    public WebElement textNewsletter;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement adress;
    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipCode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobile;
    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccontButton;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement AccountCreatedText;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;












}
