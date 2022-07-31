package utilities;

import org.openqa.selenium.WebDriver;

public abstract class ParentPage  {
    protected WebDriver driver;
    protected ParentPage(WebDriver driver) {
        this.driver = driver;

    }

}