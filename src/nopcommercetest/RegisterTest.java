package nopcommercetest;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }
    @Test
    public void login() {   // cliick on login

        WebElement login = driver.findElement(By.className("ico-login"));
        login.click();}

    @After
    public void userShouldNavigateToRegisterPageSuccessFully() {
        driver.findElement(By.xpath("//button[@class='button-1 register-button']")).click();
        driver.findElement(By.xpath("//span[@class='male']")).click();
        WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstname.sendKeys("Raja");
        WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastname.sendKeys("Patel");
        //WebElement dob = driver.findElement(By.xpath("//div[@class='date-picker-wrapper']"));
        //WebElement dob = driver.findElement(By.xpath("//select[@class='valid']"));
        //dob.sendKeys("//select[@class='valid']");

        //driver.findElement(By.xpath("//select[@name='DateOfBirthDay']//option[text()='1']")).click();
        WebElement Day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select select = new Select(Day);
        select.selectByValue(String.valueOf(5));

        WebElement Month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Select select1 = new Select(Month);
        select1.selectByValue(String.valueOf(5));

        WebElement Year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select select2 = new Select(Year);
        select2.selectByValue(String.valueOf(1980));

//        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']//option[@value='1']"));
//        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']//option[@value='1913']"));

        WebElement email = driver.findElement(By.xpath("//input[@name='Email']"));
        email.sendKeys("abcd@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys(("123456"));
        WebElement confirmpasscode =driver.findElement(By.name("ConfirmPassword"));
        confirmpasscode.sendKeys("123456");
        WebElement completed = driver.findElement(By.id("register-button"));
        completed.click();

        WebElement Continue = driver.findElement(By.xpath("//a[text()='Continue']"));
        Continue.click();






    }


}


