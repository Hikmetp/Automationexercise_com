package pages;

import utilities.ParentPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ConfigReader;


public class LoginPage extends ParentPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


      // @FindBy(partialLinkText = "Signup")
      // public WebElement signUpLoginButton;

      // @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
      // public WebElement LoginYazisi;

    //  @FindBy(xpath = "//input[@data-qa='login-email']")
    //  public WebElement emailTextBox;

    //  @FindBy(xpath = "//input[@placeholder='Password']")
    //  public  WebElement passTextBox;

    //  @FindBy(xpath = "//button[normalize-space()='Login']")
    //  public WebElement loginButton;

    //  @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    //  public WebElement incorrectYazisi;




        public LoginPage login_butonuna_tiklar() {
                driver.findElement(By.xpath("//*[@href='/login']")).click();
                return this;
    }

        public LoginPage loginYaziTest() {
               WebElement LoginYazisi=driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
                Assert.assertTrue(LoginYazisi.isDisplayed());
                return this;
        }

        public LoginPage yanlisMailSifre() {

               driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(ConfigReader.getProperty("Wrongemail"));
                driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ConfigReader.getProperty("Wrongpassword"));
                driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

                return this;
        }

        public LoginPage inYazisininGorul() {
                WebElement incorrectYazisi=driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));

                Assert.assertTrue(incorrectYazisi.isDisplayed());
                return this;
        }

}


