package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC12_Pages {
    public TC12_Pages() {

        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement products;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    public WebElement addToChart1;
    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
    public WebElement shoppingButon;
    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[1]")
    public WebElement firstProduct;
    @FindBy(xpath = "(//img[@alt='ecommerce website products'])[2]")
    public WebElement secondProduct;
    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a/text()")
    public WebElement addToChart2;

    @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u)")
    public WebElement viewChart;


}
