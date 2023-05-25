package org.example;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.example.BasePage.driver;

public class DriverManager  extends Utils {
    Loadprop loadprop = new Loadprop();

    MutableCapabilities sauceOptions = new MutableCapabilities();
    public String USERNAME = loadprop.getProperty("SAUCE_USERNAME");
    public String ACCESS_KEY = loadprop.getProperty("SAUCE_ACCESS_KEY");
    public String URL = "https://"+ USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";
    // Running in to SauceLab
    public boolean SAUCE_LAB=false;

    // This below line will connect with jenkin or system
   //public boolean SAUCE_LAB =Boolean.parseBoolean(System.getProperty("Sauce"));
   // public String browserName = loadprop.getProperty("browser");
    String browserName = loadprop.getProperty("browser");
    //This below line connect with jenkin
 //  public String browserName = System.getProperty("browser");

    @BeforeMethod
    public void openBrowser() {

            if (SAUCE_LAB)
            {
                //it will run in sauce lab
                System.out.println("Running is sauceLab......" + browserName );

                if (browserName.equalsIgnoreCase("Chrome")) {
                    ChromeOptions browserOptions = new ChromeOptions();
                    browserOptions.setExperimentalOption("w3c", true);
                    browserOptions.setCapability("platformName", "Windows 10");
                    browserOptions.setCapability("browserVersion", "112");
                    browserOptions.setCapability("sauce:options", sauceOptions);
                    try {
                        driver = new RemoteWebDriver(new URL(URL), browserOptions);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                } else if (browserName.equalsIgnoreCase("FireFox")) {
                    FirefoxOptions browserOptions = new FirefoxOptions();
                    browserOptions.setPlatformName("Window10");
                    browserOptions.setBrowserVersion("latest");
                    browserOptions.setCapability("sauce:options", sauceOptions);
                    try {
                        driver = new RemoteWebDriver(new URL(URL), browserOptions);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
            }else
            { //running locally browser
                System.out.println("Running local machine with browser name..." + browserName );

                if (browserName.equalsIgnoreCase("Chrome")) {
                    //Open Chrome browser
                    driver = new ChromeDriver();
                } else if (browserName.equalsIgnoreCase("firefox")){
                    //Open Firefox browser
                    driver = new FirefoxDriver();
                } else if (browserName.equalsIgnoreCase("edge")) {
                    //Open Edge browser
                    driver = new EdgeDriver();
                } else {
                    System.out.println("Browser name is wrong or not implemented :" + browserName);
                }
            }
            //type the url
        driver.get(loadprop.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @AfterMethod

        public void closeBrowser ()
        {
            driver.close();
        }
            }



