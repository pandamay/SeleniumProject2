import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    WebDriver driver;
    Properties prop;

    public WebDriver instatiateDriver() throws IOException {
        prop = new Properties();
        FileInputStream file = new FileInputStream("src/main/resources/props.properties");
        prop.load(file);
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/etc/gumtree/chromedriver");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","/etc/gumtree/geckodriver");
            driver = new FirefoxDriver();
        }
        else{
            System.out.println("ERROR... READING props file");

        }

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        return driver;
    }

}
