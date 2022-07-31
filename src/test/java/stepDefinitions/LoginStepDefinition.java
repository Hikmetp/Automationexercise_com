package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;


import java.net.MalformedURLException;


import static utilities.Driver.*;


public class LoginStepDefinition {

    private LoginPage loginPage = null;


    @Before
    public void beforeScenario() throws Exception {
        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));
        //openBrowser(ConfigReader.getProperty("automation_url"));
        Thread.sleep(3000);
        loginPage = new LoginPage(driver);
    }

    @After
    public void afterScenario() {
        quitBrowser();
    }

    @When("kullanici tarayiciyi baslatir")
    public void kullanici_tarayiciyi_baslatir() {

    }

    @Then("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() throws MalformedURLException {


    }

    @Then("ana sayfanin gorunur oldugunu test eder")
    public void ana_sayfanin_gorunur_oldugunu_test_eder() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("kullanici signup-login butonuna tiklar")
    public void kullanici_signup_login_butonuna_tiklar() {

        loginPage.login_butonuna_tiklar();

    }


    @Then("kullanicinin Login to your account yazisinin gorunur oldugunu test eder")
    public void kullanicinin_login_to_your_account_yazisinin_gorunur_oldugunu_test_eder() {
        loginPage.loginYaziTest();
    }

    @Then("kullanici yanlis email ve sifreyi  girer")
    public void kullanici_yanlis_email_ve_sifreyi_girer() {
        loginPage.yanlisMailSifre();

    }

    @Then("kullanici Your email or password is incorrect! yazisinin goruldugunu test eder")
    public void kullanici_your_email_or_password_is_incorrect_yazisinin_goruldugunu_test_eder() {
        loginPage.inYazisininGorul();
    }


}
