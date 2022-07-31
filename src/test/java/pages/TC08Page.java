
package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.ParentPage;


import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class TC08Page extends ParentPage {



    public TC08Page(WebDriver driver) {
        super(driver);
    }




    public TC08Page clickProductsButton() {
        // productsButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//*[@href='/products']")).click();
        return this;
    }

    //fffff

    public TC08Page verifyPageSuccessfully() {
        WebElement allProductsPage = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        assertTrue(allProductsPage.isDisplayed());
        return this;
    }


    public TC08Page productsListIsVisible() {
        List<WebElement> allproductList = driver.findElements(By.xpath("//*[@class='productinfo text-center']"));
        assertEquals(34, allproductList.size());
        return this;
    }


    public TC08Page clickOfFirstProduct() {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//*[@href='/product_details/1']")).click();
        // firstPictureViewProduct.click();
        return this;
    }


    public TC08Page userIsLandedToProductDetailPage() {
        String expectedUrl = "https://automationexercise.com/product_details/1";
        String actualUrl = driver.getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
        return this;

    }


    public TC08Page verifyThatDetailDetailIsVisibleProduct() {

        WebElement firstPictureProductName = driver.findElement(By.xpath("//*[.='Blue Top']"));


        WebElement firstPictureCategory = driver.findElement(By.xpath("//*[.='Category: Women > Tops']"));


        WebElement firstPicturePrice = driver.findElement(By.xpath("//*[.='Rs. 500']"));

        WebElement firstPictureAvalibility = driver.findElement(By.xpath("//*[.='Availability:']"));


        WebElement firstPictureCondition = driver.findElement(By.xpath("//*[.='Condition:']"));
        WebElement firstPictureBrand = driver.findElement(By.xpath("//*[.='Brand:']"));


        assertTrue(firstPictureProductName.isDisplayed());
        assertTrue(firstPictureCategory.isDisplayed());
        assertTrue(firstPicturePrice.isDisplayed());
        assertTrue(firstPictureAvalibility.isDisplayed());
        assertTrue(firstPictureCondition.isDisplayed());
        assertTrue(firstPictureBrand.isDisplayed());
        return this;


    }


    public TC08Page click_button() {
        driver.findElement(By.xpath("//a[@href='/test_cases']")).click();

        return this;

    }


    public TC08Page verify_user_is_navigated_to_test_cases_page_successfully() {
        WebElement testCasesText = driver.findElement(By.xpath("(//h2)[1]"));
        assertTrue(testCasesText.isDisplayed());
        return this;
    }
}








