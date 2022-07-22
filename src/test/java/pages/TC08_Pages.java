package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TC08_Pages {

    /* Test Case 8: Verify All Products and product detail page
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
 3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. The products list is visible
7. Click on 'View Product' of first product
8. User is landed to product detail page
9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
*/

    public  TC08_Pages(){PageFactory.initElements((Driver.getDriver()),this);}

    @FindBy(xpath = "//*[.=' Home'][1]")
    public WebElement homePage;

    @FindBy(xpath = "//li[2][1]")
    public WebElement productsButton;
    ////i[@class='material-icons card_travel']

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsPage;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductListTitle;

    @FindBy(xpath = "//*[@href='/product_details/1']")
    public WebElement firstPictureViewProduct;
    ////*[text()='View Product']

    @FindBy(xpath = "//h2[contains(text(),'Blue Top')]")
    public WebElement firstPictureProductName;

    @FindBy(xpath = "//p[contains(text(),'Category')]")
    public WebElement firstPictureCategory;

    @FindBy(xpath = "//span[contains(text(),'Rs. 500')]")
    public WebElement firstPicturePrice;

    @FindBy(xpath = "//b[contains(text(),'Availability:')]")
    public WebElement firstPictureAvalibility;

    @FindBy(xpath = "//b[contains(text(),'Condition')]")
    public WebElement firstPictureCondition;

    @FindBy(xpath = "//b[contains(text(),'Brand')]")
    public WebElement firstPictureBrand;



    @FindBy(xpath = "//*[@class='productinfo text-center']")
    public List<WebElement> allproductList;

    @FindBy(xpath = "//a[@href='/test_cases']")
    public WebElement testCasesButton;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement testCasesText;


}

