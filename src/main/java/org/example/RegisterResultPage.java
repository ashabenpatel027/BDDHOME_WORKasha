package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage  extends  Utils {

    private By _getMessage = By.xpath("//div[@class='result']");
    Loadprop loadProp = new Loadprop();

    public void VerifyUserRegisterSuccessfully() {

        Assert.assertEquals(getTextFromElement(_getMessage), loadProp.getProperty("expectedRegistrationCompleteMsg"));
    }
}






