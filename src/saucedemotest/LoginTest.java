package saucedemotest;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {
    String baseurl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {openBrowser(baseurl);
    }
    @Test
            public void userSholudLoginWithValidCredentials() {


        WebElement login = driver.findElement(By.id("user-name"));
        login.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        WebElement heading = driver.findElement(By.className("title"));
        String actualText = heading.getText();
        String expectedText = "PRODUCTS";
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void verifySixProductsAreDisplayOnPage(){
        WebElement login = driver.findElement(By.id("user-name"));
        login.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        List<WebElement>links=driver.findElements(By.id("inventory_container"));
        int numberOfLinks=links.size();
        System.out.println(numberOfLinks);

        List<WebElement> product= driver.findElements(By.className("inventory_item_name"));
        System.out.println(product.size());
    }
    }
