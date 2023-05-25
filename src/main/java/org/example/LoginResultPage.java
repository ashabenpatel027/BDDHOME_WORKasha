package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginResultPage extends  Utils{
    //login result implement
    static String expectedReferProductMessage = "Your message has been sent.";
    Loadprop loadProp = new Loadprop();

    public void OnlyRegisteredCustomerCanSendEmailToFri (){
        String actualMessage =getTextFromElement(By.xpath("//div[@class='result']"));
        System.out.println("My Message:" + actualMessage);
        Assert.assertEquals(actualMessage, expectedReferProductMessage , "Successfully message send");
    }
}
