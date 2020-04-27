package com.smlsnnshn.tests.automation_assignment_02;

import com.smlsnnshn.automation_assignment_00_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class Task_09_10_11_12_with_DataProvider {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){ driver = WebDriverFactory.getDriver("chrome"); }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @DataProvider (name = "data")
    public Object[][] data(){
        driver.get("https://practice-cybertekschool.herokuapp.com/status_codes");
        List<WebElement> allCodes = driver.findElements(By.xpath("//div/ul/li"));
        Object[][] statusCodes = new String[allCodes.size()][1];
        for (int i = 0; i < allCodes.size(); i++) {
            statusCodes[i][0] = allCodes.get(i).getText();
        }
        return statusCodes;
    }

    @Test (dataProvider = "data")
    public void testCase_09_10_11_12(String statusCode) {
        String xPath = "//a[.='" + statusCode + "']";
        driver.findElement(By.xpath(xPath)).click();

        String actualResult = driver.findElement(By.xpath("//p")).getText();
        String expectedResult = "This page returned a " + statusCode + " status code";
        Assert.assertTrue(actualResult.contains(expectedResult));

        driver.navigate().back();

    }

}
