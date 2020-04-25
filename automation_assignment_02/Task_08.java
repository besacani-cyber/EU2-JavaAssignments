package com.smlsnnshn.tests.automation_assignment_02;

import com.smlsnnshn.automation_assignment_00_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_08 {

    @Test
    public void TestCase_08(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. And click on “Autocomplete”.
        driver.findElement(By.xpath("//a[.='Autocomplete']")).click();

//      Step 3. Enter “United States of America” into country input box.
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");

//      Step 4. Verify that following message is displayed: “You selected: United States of America”
        String expectedResult = "United States of America";
        String actualResult = driver.findElement(By.xpath("//strong[.='United States of America']")).getText();
        Assert.assertEquals(actualResult,expectedResult,"verifying the country name's message");

        driver.quit();

    }

}
