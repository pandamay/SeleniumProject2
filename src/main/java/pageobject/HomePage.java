package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    String loginSelector = "[href*='sign_in']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPage clickLoginButton(){
        driver.findElement(By.cssSelector(loginSelector)).click();
        return new LoginPage(driver);
    }
}
