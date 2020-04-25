package com.smlsnnshn.tests.automation_assignment_02;

import com.smlsnnshn.automation_assignment_00_utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_06 {

    @Test
    public void TestCase_06() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

//      Step 1. Go to "https://www.tempmailaddress.com/"
        driver.get("https://www.tempmailaddress.com/");

//      Step 2. Copy and save email as a string.
        String email = driver.findElement(By.id("email")).getText();

//      Step 3. Then go to “https://practice-cybertekschool.herokuapp.com”
        driver.get("https://practice-cybertekschool.herokuapp.com");

//      Step 4. And click on “Sign Up For Mailing List".
        driver.findElement(By.xpath("//a[.='Sign Up For Mailing List']")).click();

//      Step 5. Enter any valid name.
        driver.findElement(By.name("full_name")).sendKeys("Mike Smith");

//      Step 6. Enter email from the Step 2.
        driver.findElement(By.name("email")).sendKeys(email);

//      Step 7. Click Sign Up
        driver.findElement(By.name("wooden_spoon")).click();

//      Step 8. Verify that following message is displayed: “Thank you for signing up.
//              Click the button below to return to the home page.”
        String expectedResult1 = "Thank you for signing up. Click the button below to return to the home page.";
        String actualResult1 = driver.findElement(By.name("signup_message")).getText();
        Assert.assertEquals(actualResult1,expectedResult1,"verifying the signup message");

//      Step 9. Navigate back to the “https://www.tempmailaddress.com/”
        driver.get("https://www.tempmailaddress.com/");
        Thread.sleep(5000);

//      Step 10. Verify that you’ve received an email from “do-not-reply@practice.cybertekschool.com”
//        String expectedResult2 = "do-not-reply@practice.cybertekschool.com";
//        String actualResult2 = driver.findElement(By.xpath("//td[contains(.,' do-not-reply@practice.cybertekschool.com')]")).getText();
//        System.out.println(actualResult2);
//        System.out.println("exp: " + expectedResult2);
//        System.out.println("act: " + actualResult2);
        //Assert.assertEquals(actualResult2,expectedResult2,"verifying the mail is in the box");

//      Step 11. Click on that email to open it.
        driver.findElement(By.xpath("//td[contains(.,' do-not-reply@practice.cybertekschool.com')]")).click();

//      Step 12. Verify that email is from: “do-not-reply@practice.cybertekschool.com”
        String expectedResult3 = "do-not-reply@practice.cybertekschool.com";
        String actualResult3 = driver.findElement(By.id("odesilatel")).getText();
        Assert.assertEquals(actualResult3,expectedResult3,"verifying the mail is from Cybertek");

//      Step 13. Verify that subject is: “Thanks for subscribing to practice.cybertekschool.com!”
        String expectedResult4 = "Thanks for subscribing to practice.cybertekschool.com!";
        String actualResult4 = driver.findElement(By.id("predmet")).getText();
        Assert.assertEquals(actualResult4,expectedResult4,"verifying the thanks message");

        driver.quit();

    }

}
