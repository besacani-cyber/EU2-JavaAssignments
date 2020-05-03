package com.smlsnnshn.tests.automation_assignment_02;

import com.smlsnnshn.automation_assignment_00_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Task_13_HoverOver {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test_hoverOver() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");
        WebDriverWait wait = new WebDriverWait(driver,2);
        List<WebElement> images = driver.findElements(By.tagName("img"));
        Actions actions = new Actions(driver);

        for (WebElement each : images){
            actions.moveToElement(each).perform();
            wait.until(ExpectedConditions.visibilityOf(each));
            WebElement link = driver.findElement(By.linkText("View profile"));
            Assert.assertTrue(link.isDisplayed(),"Verifying the link message");
        }

    }

}
