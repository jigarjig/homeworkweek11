package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseurl){
        ChromeOptions options = new ChromeOptions();  // setting webdriver
        driver =new ChromeDriver(options);
        driver.get(baseurl);    //launch the url
        driver.manage().window().maximize();  // maximise the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser() {
        driver.quit();
    }
}
