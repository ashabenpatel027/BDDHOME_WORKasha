package org.example;

import org.openqa.selenium.By;

public class LoginPage  extends Utils{
    // login into main page to log in button
    private By _LoginIco =By.className("ico-login");
    private By _EnterEmail = By.xpath("//input[@class='email']");
    private By _PassWord =By.xpath("//input[@id='Password']");
    private By _LogInButtton = By.xpath("//button[@class='button-1 login-button']");
    Loadprop loadProp = new Loadprop();

    public void enterLoginEmail (){
        //click on login button
        clickOnElement(_LoginIco);
        //Type  email address
        typeText(_EnterEmail,loadProp.getProperty("emailAddressNew"));
        //Type password
        typeText(_PassWord,loadProp.getProperty("password"));
        //click on
        clickOnElement(_LogInButtton);

    }
}
