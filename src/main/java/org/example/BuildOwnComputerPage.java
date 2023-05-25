package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuildOwnComputerPage  extends  Utils {
    //storing all locators
    private By _clickOnSelect =By.xpath("//select[@id='product_attribute_1']");
    private By _clickOnRam =By.xpath("//select[@id='product_attribute_2']");
    private By _clickOnHdd =By.xpath("//input[@id='product_attribute_3_6']");
    private By _clickOnOs =By.cssSelector("input#product_attribute_4_9");
    private By _click2ndMicro =By.xpath("//input[@id='product_attribute_5_11']");
    private By _click3rdMicro =By.xpath("//input[@id='product_attribute_5_12']");
    private By _addToCart =By.cssSelector("button#add-to-cart-button-1");
    private By _shoppingCart =By.linkText("shopping cart");
    Loadprop loadProp = new Loadprop();

    public void clickOnOwnComputer(){
        clickOnElement(_clickOnSelect);
        selectDropDownElements(_clickOnSelect,"2.2 GHz Intel Pentium Dual-Core E2200");
        selectDropDownElements(_clickOnRam,"8GB [+$60.00]");
        List<WebElement> r =driver.findElements(_clickOnHdd);
        for (WebElement e:r){
            if (e.getAttribute("value").equalsIgnoreCase("6")){
                e.click();
            }
            List<WebElement> o =driver.findElements(_clickOnOs);
            for (WebElement i:o){
                if (i.getAttribute("value").equalsIgnoreCase("9")){
                    i.click();
                }
            }
            clickOnElement(_click2ndMicro);
            clickOnElement(_click3rdMicro);
            clickOnElement(_addToCart);
            clickOnElement(_shoppingCart);

        }}}

