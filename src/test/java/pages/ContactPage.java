package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactPage {

    public ContactPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement contactUsButton;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement getInTochYazisi;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameKutusu;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectKutusu;


    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement mesajKutusu;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement dosyaYukle;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButonu;


    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement succesYazisi;

    @FindBy(xpath = "//a[@class='btn btn-success']")
    public WebElement homeButonu;

}
