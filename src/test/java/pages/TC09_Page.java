package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC09_Page {


    public  TC09_Page(){PageFactory.initElements((Driver.getDriver()),this);}

   @FindBy(xpath = "//*[.=' Home'][1]")
   public WebElement homePage;

    @FindBy(xpath = "//li[2][1]")
    public WebElement productsButton;
    ////i[@class='material-icons card_travel']

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsPage;

    @FindBy(xpath = "//input[@id='search_product']")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement clickButton;

    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement searchedProductTextElement;

    @FindBy(xpath = "//*[.='Men Tshirt'][1]")
    public WebElement selectedProduct;













}
