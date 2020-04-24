package com.smlsnnshn.tests.automation_assignment_01;

import com.smlsnnshn.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task03_xPath {

    //Go to wikipedia.org (Links to an external site.) 
    //enter search term `selenium webdriver` 
    //click on search button 
    //click on search result `Selenium (software)` 
    //verify url ends with `Selenium_(software)'

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.navigate().to("https://www.wikipedia.org");

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        searchBox.sendKeys("selenium webdriver");

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
        searchButton.click();

        WebElement resultSeleniumSoftware = driver.findElement(By.xpath("//a[@title='Selenium (software)']"));
        resultSeleniumSoftware.click();

        String actualURL = driver.getCurrentUrl().toString();

        if (actualURL.endsWith("Selenium_(software)")){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

        driver.quit();

    }

}
