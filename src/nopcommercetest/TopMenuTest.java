package nopcommercetest;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
        driver.manage().window().maximize();// maximise the browser
        //implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Test
    // user on computer tab
    public void  userShouldNavigateToComputerPageSuccessFully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

        WebElement computer = driver.findElement(By.className("page-title"));
        String actualText = computer.getText();
        String expectedText ="Computers";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsSuccessFully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        WebElement electro = driver.findElement(By.className("page-title"));
        String actualText = electro.getText();
        String expectedText ="Electronics";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userNavigateToApparel(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        WebElement appar = driver.findElement(By.className("page-title"));
        String actualText = appar.getText();
        String expectedText ="Apparel";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPage(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        WebElement digi = driver.findElement(By.className("page-title"));
        String actualText = digi.getText();
        String expectedText ="Digital downloads";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userNavigateToBooksPage(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        WebElement book = driver.findElement(By.className("page-title"));
        String actualText = book.getText();
        String expectedText ="Books";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userNavigateToJewelry(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        WebElement orna = driver.findElement(By.className("page-title"));
        String actualText = orna.getText();
        String expectedText ="Jewelry";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userNavigatToGiftCardsPageSuccessFully(){
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        WebElement gc = driver.findElement(By.className("page-title"));
        String actualText = gc.getText();
        String expectedText ="Gift Cards";
        Assert.assertEquals(expectedText,actualText);
    }
    

}
