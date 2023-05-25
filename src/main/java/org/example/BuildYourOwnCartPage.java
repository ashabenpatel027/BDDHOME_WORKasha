package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuildYourOwnCartPage  extends  Utils{
    private By _productInCart =By.cssSelector("td.product");
    private By _termsOfService =By.xpath("//input[@id='termsofservice']");
    private By _checkOut =By.xpath("//button[@id='checkout']");
    Loadprop loadProp = new Loadprop();

    public void productShoppinCart() {
        List<WebElement> productList = driver.findElements(_productInCart);
        for (WebElement e : productList) {
            System.out.println(e.getText());

        }
    }public void checkOut(){
        clickOnElement(_termsOfService);
        clickOnElement(_checkOut);
    }}


