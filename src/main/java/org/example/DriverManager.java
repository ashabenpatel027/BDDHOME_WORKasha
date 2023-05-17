package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.example.BasePage.driver;

public class DriverManager  extends Utils {
    Loadprop loadprop = new Loadprop();
    String browserName = loadprop.getProperty("browser");
    // this all step will run ChoreDriver,get URL,
    // Make Window maximize
    //should not change frequently
    @BeforeMethod
    public void openBrowser() {
        if (browserName.equalsIgnoreCase("Chrome")){
            // open Chrome browser
           driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            //open Firefox browser
            driver= new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            //open  Edge browser

        }else {
            System.out.println("Browser name is wrong or not implemented :"+ browserName);
        }
       // driver= new ChromeDriver();
        //type the URL
        driver.get(loadprop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }@AfterMethod

    public void closeBrowser() {
         driver.close();

    }}


