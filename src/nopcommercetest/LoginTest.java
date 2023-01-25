package nopcommercetest;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

    @Test
            public void login() {   // cliick on login

        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();
        WebElement welcomeMsg = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualText = welcomeMsg.getText();
        String expectedText = "Welcome, Please Sign In!";
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials(){
        // click on login details
        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();
        //enter email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc@gmail.com");
        // enter password field
        WebElement passwordField = driver.findElement(By.xpath("//input[@class='password']"));
        passwordField.sendKeys("123456");
        // click finally on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        // Verify log out is display
        WebElement logOut = driver.findElement(By.className("ico-logout"));
        String actualText = logOut.getText();
        String expectedText = "Log out";
        Assert.assertEquals(expectedText,actualText);

    }

    @Test
    public void verifyTheErrorMessage(){
        // click on login
        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();
        //enter email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc@gmail.com");
        // enter password field
        WebElement passwordField = driver.findElement(By.xpath("//input[@class='password']"));
        passwordField.sendKeys("123455");
        // click finally on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        // Verify log out is display
        String actualText = loginButton.getText();
        String expectedText = "Login was Unsuccesful. Please correct the error.No customer account found";
        Assert.assertEquals(expectedText,actualText);


    }

}
