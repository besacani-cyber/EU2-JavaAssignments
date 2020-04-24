package com.smlsnnshn.tests.automation_assignment_01;

import com.smlsnnshn.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task01_xPath {

    //Go to ebay 
    //enter search term 
    //click on search button 
    //print number of results

    public static void main(String[] args) {

        String item = "shoes";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.ebay.com");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("item");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        String results = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']")).getText();
        String numberOfResults = results.split(" ")[0];
        System.out.println("Number of Results for '" + item + "' is : " + numberOfResults);
        driver.quit();

    }

}
