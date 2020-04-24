package com.smlsnnshn.tests.automation_assignment_01;

import com.smlsnnshn.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task02_xPath {

    //go to amazon 
    //Go to ebay 
    //enter search term 
    //click on search button 
    //verify title contains search term

    public static void main(String[] args) {

        String item = "shoes";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().to("https://www.ebay.com");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys(item);

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        String title = driver.getTitle();

        if (title.contains(item)){
            System.out.println("The title is containing search item");
            System.out.println("Title        : " + title);
            System.out.println("Search Item  : " + item);
        }
        else{
            System.out.println("The title is NOT containing search item");
            System.out.println("Title        : " + title);
            System.out.println("Search Item  : " + item);
        }

    }

}
