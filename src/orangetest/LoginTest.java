package orangetest;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
        driver.manage().window().maximize();// maximise the browser
        //implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));}
    @Test
    public void loginWithValidCredentials() {
            WebElement login = driver.findElement(By.name("username"));
            login.sendKeys("Admin");
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("admin123");
            WebElement Login = driver.findElement(By.className("oxd-button"));
            Login.click();

        WebElement computer = driver.findElement(By.className("oxd-topbar-header-title"));
        String actualText = computer.getText();
        String expectedText ="Dashboard";
        Assert.assertEquals(expectedText,actualText);

        }
    }

