package StepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ContactPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.awt.*;

import static utilities.ReusableMethods.*;

public class ContactStepDefinition {

    ContactPage contactPage= new ContactPage();


    @Then("{string} dugmesine tiklayin")
    public void dugmesine_tiklayin(String string) {
        contactPage.contactUsButton.click();
    }
    @Then("'GET IN TOUCH'un gorunur oldugunu dogrulayin")
    public void get_in_touch_un_gorunur_oldugunu_dogrulayin() {
        Assert.assertTrue(contactPage.getInTochYazisi.isDisplayed());
    }
    @Then("Adi, e-posta adresini, konuyu ve mesaji girin")
    public void adi_e_posta_adresini_konuyu_ve_mesaji_girin() {

        sendKeysElement(contactPage.nameKutusu, ConfigReader.getProperty("contactUsName"));
        sendKeysElement(contactPage.emailKutusu,ConfigReader.getProperty("contactUsEmail"));
        sendKeysElement(contactPage.subjectKutusu,ConfigReader.getProperty("contactUsSubject"));
        sendKeysElement(contactPage.mesajKutusu,ConfigReader.getProperty("contactUsMessage"));


    }
    @Then("Dosya yukle")
    public void dosya_yukle() {
    //contactPage.dosyaYukle.click();

    String dosya="C:\\Users\\Dell\\IdeaProjects\\Automationexercise_com\\contactUs.txt";
    contactPage.dosyaYukle.sendKeys(dosya);

    }
    @Then("{string} dugmesini tiklayin")
    public void dugmesini_tiklayin(String string) throws InterruptedException {
        scrollUpWithJS();
        clickWithJS(contactPage.submitButonu);
        //contactPage.submitButonu.click();
       // waitFor(3);


    }


    @Then("Tamam dugmesine tiklayin")
    public void tamam_dugmesine_tiklayin() throws InterruptedException {

        waitFor(5);
       Driver.getDriver().switchTo().alert().accept();





    }
    @Then("Basari mesajini dogrulayin {string} gorunur")
    public void basari_mesajini_dogrulayin_gorunur(String string) {
        waitFor(3);
    Assert.assertTrue(contactPage.succesYazisi.isDisplayed());
    }
    @Then("{string} dugmesini tiklayin ve ana sayfaya basariyla indigini dogrulayin")
    public void dugmesini_tiklayin_ve_ana_sayfaya_basariyla_indigini_dogrulayin(String string) {
    contactPage.homeButonu.click();
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Automation Exercise";
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}


