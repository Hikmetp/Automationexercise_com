package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC10_pages {
    public TC10_pages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='scrollUp']")
    public WebElement scroolUp;

    @FindBy(xpath = "//footer[@id='footer']")
    public WebElement footer;


    @FindBy(xpath = "//h2[.='Subscription']")
    public WebElement subscription;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailSubscription;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement arrowButon;

    @FindBy(xpath = "//div[@class='alert-success alert']")
    public WebElement verifyVisible;

}