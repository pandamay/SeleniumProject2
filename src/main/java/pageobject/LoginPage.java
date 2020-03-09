package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    String userNameSelector = "[name='user[email]']";
    String passwordSelector = "user_password";
    String loginButtonSelector = ".login-button";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String username){
        WebElement userName = driver.findElement(By.cssSelector(userNameSelector));
        userName.sendKeys(username);
    }

    public void enterPassword(String password){
        WebElement passwordField = driver.findElement(By.id(passwordSelector));
        passwordField.sendKeys(password);
    }

    public void clickOnLogin(){
        driver.findElement(By.cssSelector(loginButtonSelector)).click();
    }
}
