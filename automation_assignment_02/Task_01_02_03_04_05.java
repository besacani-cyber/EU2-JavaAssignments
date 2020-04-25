package com.smlsnnshn.tests.automation_assignment_02;

import com.smlsnnshn.automation_assignment_00_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_01_02_03_04_05 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test // Test Case 01
    public void testCase_01() {

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[.='Registration Form']")).click();

//      Step 3. Enter “wrong_dob” into date of birth input box.
        driver.findElement(By.name("birthday")).sendKeys("wrong_dob");

//      Step 4. Verify that warning message is displayed: “The date of birth is not valid”
        String expectedResult = "The date of birth is not valid";
        String actualResult = driver.findElement(By.xpath("//small[.='The date of birth is not valid']")).getText();
        Assert.assertEquals(expectedResult,actualResult,"verifying the existence of invalid birthday message");

    }

    @Test // Test Case 02
    public void testCase_02(){

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[text()='Registration Form']")).click();

//      Step 3. Verify that following options for programming languages are displayed: c++, java, JavaScript
        Assert.assertTrue(driver.findElement(By.xpath("//label[.='C++']")).isDisplayed(),"verifying the existence ofC++");
        Assert.assertTrue(driver.findElement(By.xpath("//label[.='Java']")).isDisplayed(),"verifying the existence of Java");
        Assert.assertTrue(driver.findElement(By.xpath("//label[.='JavaScript']")).isDisplayed(),"verifying the existence of JavaScript");

    }

    @Test // Test Case 03
    public void testCase_03() {

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[.='Registration Form']")).click();

//      Step 3. Enter only one alphabetic character into first name input box.
        driver.findElement(By.name("firstname")).sendKeys("s");

//      Step 4. Verify that warning message is displayed: “first name must be more than 2 and less than 64 characters long”
        String expectedResult = "first name must be more than 2 and less than 64 characters long";
        String actualResult = driver.findElement(By.xpath("//small[contains(.,'first name must be more than 2')]")).getText();
        Assert.assertEquals(actualResult,expectedResult,"verifying the message");

    }

    @Test // Test Case 04
    public void testCase_04() {

//      Step 1. Go to https://practice-cybertekschool.herokuapp.com
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[.='Registration Form']")).click();

//      Step 3. Enter only one alphabetic character into last name input box.
        driver.findElement(By.name("lastname")).sendKeys("s");

//      Step 4. Verify that warning message is displayed: “The last name must be more than 2 and less than 64 characters long”
        String expectedResult = "The last name must be more than 2 and less than 64 characters long";
        String actualResult = driver.findElement(By.xpath("//small[contains(.,'last name must be more than 2')]")).getText();
        Assert.assertEquals(expectedResult, actualResult,"verifying the existence of short last name message");

    }

    @Test // Test Case 05
    public void testCase_05() throws InterruptedException {

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. Click on “Registration Form”
        driver.findElement(By.xpath("//a[.='Registration Form']")).click();

//      Step 3. Enter any valid first name.
        driver.findElement(By.name("firstname")).sendKeys("Mike");

//      Step 4. Enter any valid last name.
        driver.findElement(By.name("lastname")).sendKeys("Smith");

//      Step 5. Enter any valid user name.
        driver.findElement(By.name("username")).sendKeys("mikesmith");

//      Step 6. Enter any valid email and password.
        driver.findElement(By.name("email")).sendKeys("mikesmith@gmail.com");
        driver.findElement(By.name("password")).sendKeys("12345678");

//      Step 7. Enter any valid phone number.
        driver.findElement(By.name("phone")).sendKeys("123-456-7890");

//      Step 8. Select gender.
        driver.findElement(By.xpath("//input[@value='male']")).click();

//      Step 9. Enter any valid date of birth.
        driver.findElement(By.name("birthday")).sendKeys("01/01/2000");

//      Step 10. Select any department.
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='department']"));
        Select department = new Select(dropdownElement);
        department.selectByValue("DE");

//      Step 11. Enter any job title.
        dropdownElement = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select job_title = new Select(dropdownElement);
        job_title.selectByIndex(5);

//      Step 12. Select java as a programming language.
        driver.findElement(By.id("inlineCheckbox2")).click();

//      Step 13. Click Sign up.
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(4000);

//      Step 14. Verify that following success message is displayed: “You've successfully completed registration!”
        String expectedResult = "You've successfully completed registration!";
        String actualResult = driver.findElement(By.xpath("//div[@class='alert alert-success']/p")).getText();
        Assert.assertEquals(expectedResult, actualResult,"verifying the existence of the confirmation message");

    }

}
