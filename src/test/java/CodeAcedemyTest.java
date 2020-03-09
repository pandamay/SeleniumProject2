
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.HomePage;
import pageobject.LoginPage;

import java.io.IOException;

public class CodeAcedemyTest extends Base {


    @Test(dataProvider = "getData")
//    @Test
    public void LoginIntoCodeAcademy(String name, String passwd) throws IOException {
        driver = instatiateDriver();
        String urlValue = prop.getProperty("url");
        driver.get(urlValue);

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.enterUserName(name);
        loginPage.enterPassword(passwd);
        loginPage.clickOnLogin();

//        driver.close();

    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][2];
        data[0][0] = "ran@mail.com";
        data[0][1] = "abcd";
        data[1][0] = "hiba@mail.com";
        data[1][1] = "12345";

        return data;
    }
}
