package org.example;

import org.openqa.selenium.By;

public class ProductPge extends  Utils{
    //click on Apple MacBook
    private By _appleProductName =By.linkText("Apple MacBook Pro 13-inch");
    Loadprop loadProp = new Loadprop();

public void userShouldReferAppleProductToFriend(){
    clickOnElement(_appleProductName);
}
    }


