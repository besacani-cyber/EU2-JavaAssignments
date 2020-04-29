package com.smlsnnshn.tests.automation_assignment_02;

import com.smlsnnshn.automation_assignment_00_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task_09_10_11_12_with_Array {

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

    @Test
    public void test5() { // Alternative solution
        String[] links = {"200","301","404","500"};
        for(String each:links){
            driver.get("https://practice-cybertekschool.herokuapp.com/");
            driver.findElement(By.linkText("Status Codes")).click();
            driver.findElement(By.linkText(each)).click();
            String actualText = driver.findElement(By.tagName("p")).getText();
            String expectedText = "This page returned a " + each + " status code.";
            Assert.assertTrue(actualText.contains(expectedText));
        }
    }
}
