package org.example;

import org.openqa.selenium.By;

public class EmailToFriendPage extends  Utils {

    private By _emailAFriend =By.xpath("//div[@class='email-a-friend']");
    private By _FriendEmail = By.xpath("//input[@class='friend-email']");
    private By _writeMessage= By.id("PersonalMessage");
    private By _sendEmailButton =By.xpath("//button[@name='send-email']");
    Loadprop loadProp = new Loadprop();

    public void enterFriendEmailsDetail(){
        //click on product
       // clickOnElement(By.xpath("//a[@title=\"Show details for Apple MacBook Pro 13-inch\"]"));
        //click on email a friend
        clickOnElement(_emailAFriend);
        //Enter friend email
        typeText(_FriendEmail,loadProp.getProperty("FriendEmail"));
        //type massage
        typeText(_writeMessage,loadProp.getProperty("writeMessage"));
        //click on send email button
        clickOnElement(_sendEmailButton);

    }
}
