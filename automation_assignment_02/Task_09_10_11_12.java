package com.smlsnnshn.tests.automation_assignment_02;

import com.smlsnnshn.automation_assignment_00_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_09_10_11_12 {

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

    @Test // Test Case 09
    public void task_09(){

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. And click on “Status Codes”.
        driver.findElement(By.xpath("//a[.='Status Codes']")).click();

//      Step 3. Then click on “200”.
        driver.findElement(By.xpath("//a[@href='status_codes/200']")).click();

//      Step 4. Verify that following message is displayed: “This page returned a 200 status code”
        String actualResult = driver.findElement(By.xpath("//p")).getText();
        String expectedResult = "This page returned a 200 status code";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test // Test Case 10
    public void task_10(){

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. And click on “Status Codes”.
        driver.findElement(By.xpath("//a[.='Status Codes']")).click();

//      Step 3. Then click on “301”.
        driver.findElement(By.xpath("//a[@href='status_codes/301']")).click();

//      Step 4. Verify that following message is displayed: “This page returned a 301 status code”
        String actualResult = driver.findElement(By.xpath("//p")).getText();
        String expectedResult = "This page returned a 301 status code";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test // Test Case 11
    public void task_11(){

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. And click on “Status Codes”.
        driver.findElement(By.xpath("//a[.='Status Codes']")).click();

//      Step 3. Then click on “404”.
        driver.findElement(By.xpath("//a[@href='status_codes/404']")).click();

//      Step 4. Verify that following message is displayed: “This page returned a 404 status code”
        String actualResult = driver.findElement(By.xpath("//p")).getText();
        String expectedResult = "This page returned a 404 status code";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

    @Test // Test Case 12
    public void task_12(){

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. And click on “Status Codes”.
        driver.findElement(By.xpath("//a[.='Status Codes']")).click();

//      Step 4. Then click on “500”.
        driver.findElement(By.xpath("//a[@href='status_codes/500']")).click();

//      Step 5. Verify that following message is displayed: “This page returned a 500 status code”
        String actualResult = driver.findElement(By.xpath("//p")).getText();
        String expectedResult = "This page returned a 500 status code";
        Assert.assertTrue(actualResult.contains(expectedResult));

    }

}
