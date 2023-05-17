package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static org.example.BasePage.driver;

public class Utils  extends BasePage {
    static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    //Text
    public static void selectElementByText(By by, String text) {
        Select select1 = new Select(driver.findElement(by));
        select1.selectByVisibleText(text);
    }
    //By value
    public static void selectOptionByValue(By by, String value) {
        Select select2 = new Select(driver.findElement(by));
        select2.selectByValue(value);
    }
    //Index
    public static void selectOptionByIndex(By by, int index) {
        Select select3 = new Select(driver.findElement(by));
        select3.selectByIndex(index);
    }

    public static void selectDropDownCurrency(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    // Select DropDown Elements
    public static void selectDropDownElements(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);

    }// reusable method for Radiobutton
    public static void clickOnRadioButtonElement(By by) {
        driver.findElement(by).click();


        // Wait for element visible
        //  public static void waitForVisibilityOfElement(By by, int timeInSec) {
        //   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("")));
    }




    //Wait for ElementPresent
    public static void waitForElementPresent(WebDriver driver, By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        //return driver.findElement(locator);
    }

    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new
                SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }

    public static void captureScreenshot( String fileName)
    {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File
                SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile=new
                File("src\\test\\Screenshots\\"+fileName+""+currentTimeStamp()+".png");
        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, destFile );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





