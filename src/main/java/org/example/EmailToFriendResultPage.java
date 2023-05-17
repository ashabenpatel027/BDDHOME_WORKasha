package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailToFriendResultPage extends  Utils {

    // Write xpath
    private By _userGetMessage = By.xpath("//div[@class='result']");
    Loadprop loadProp = new Loadprop();
    public void VerifyUserSendEmailFriendsSuccessfully(){
        // Get result message
        Assert.assertEquals(getTextFromElement(_userGetMessage),loadProp.getProperty("expectedReferProductMessage"));
    }
}

