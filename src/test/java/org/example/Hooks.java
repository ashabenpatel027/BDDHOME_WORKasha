package org.example;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.example.BasePage.driver;

public class Hooks {
    DriverManager driverManager= new DriverManager();
    @Before
    public void setUp(){
        driverManager.openBrowser();
    }
    @After
    public  void tearDOwn(Scenario scenario){
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }
        driverManager.closeBrowser();

    }
}// THIS BELOW METHOD IS SUCCESS RESULT PICTURE
//@AfterMethod
//public void tearDown(ITestResult result){
//    if(!result.isSuccess()){
//        captureScreenshot(result.getName());
//    }
//
//    driverManager.closeBrowser();
//}