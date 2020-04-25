package com.smlsnnshn.tests.automation_assignment_02;

import com.smlsnnshn.automation_assignment_00_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_07 {

    @Test
    public void testCase_07(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

//      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 2. And click on “File Upload
        driver.findElement(By.xpath("//a[.='File Upload']")).click();

//      Step 3. Upload any file with .txt extension from your computer.
        driver.findElement(By.id("file-upload")).sendKeys("/Users/sahin/Desktop/sample.txt");

//      Step 4. Click “Upload” button.
        driver.findElement(By.id("file-submit")).click();

//      Step 5. Verify that subject is: “File Uploaded!”
        String expectedResult1 = "File Uploaded!";
        String actualResult1 = driver.findElement(By.xpath("//*[.='File Uploaded!']")).getText();
        Assert.assertEquals(actualResult1,expectedResult1,"verifying the File Uploaded message");

//      Step 6. Verify that uploaded file name is displayed.
        String expectedResult2 = "sample.txt";
        String actualResult2 = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(actualResult2,expectedResult2,"verifying the uploaded file name");

        driver.quit();

//      Note: use element.sendKeys(“/file/path”) with specifying path to the file for uploading.
//      Run this method against “Choose File” button.

    }

}
