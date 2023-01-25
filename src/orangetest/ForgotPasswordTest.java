package orangetest;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ForgotPasswordTest extends BaseTest {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
        driver.manage().window().maximize();// maximise the browser
        //implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));}
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessFully() {
        WebElement forgot = driver.findElement(By.className("orangehrm-login-forgot"));
        forgot.click();

        WebElement forgot1 = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
        String actualText = forgot1.getText();
        String expectedText ="Reset Password";
        Assert.assertEquals(expectedText,actualText);

    }
}
