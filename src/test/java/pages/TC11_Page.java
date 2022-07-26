package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TC11_Page {
    public TC11_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "fa fa-shopping-cart")
    public WebElement cartButton;

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement textSubscription;

    @FindBy(id = "susbscribe_email")
    public WebElement emailBox;

    @FindBy(className = "fa fa-arrow-circle-o-right")
    public WebElement arrowButton;

    @FindBy(xpath = "//*[text()='You have been successfully subscribed!']")
    public WebElement subscriptionVerify1;

    @FindBy(id = "success-subscribe")
    public WebElement subscriptionVerify2;

    @FindBy(className = "col-md-9 form-group hide")
    public WebElement subscriptionVerify3;

    @FindBy(className = "alert-success alert")
    public WebElement subscriptionVerify4;

    @FindBy(xpath = "//footer/div/div/div/div/div/div")
    public WebElement subscriptionVerify5;

     /*
     subscription onay kismi sonuclari degerlendirmek amaciyla 5 farkli sekilde locate i alindi
     */

}
