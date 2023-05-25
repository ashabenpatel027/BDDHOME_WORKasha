package org.example;

import org.openqa.selenium.By;

public class GuestCheckoutButton extends Utils {
    //storing all locators from gust button to orderConfirm
    private By _guestButton =By.xpath("//button[@class='button-1 checkout-as-guest-button']");
    private By _firstName =By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastName =By.cssSelector("input#BillingNewAddress_LastName");
    private By _email =By.cssSelector("input#BillingNewAddress_Email");
    private By _company=By.cssSelector("input#BillingNewAddress_Company");
    private By _country=By.xpath("//select[@name='BillingNewAddress.CountryId']");
    private By _city= By.xpath("//input[@name='BillingNewAddress.City']");
    private By _address1=By.cssSelector("input#BillingNewAddress_Address1");
    private By _zip =By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _phoneNumber=By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    private By _faxNumber=By.xpath("//input[@id=\"BillingNewAddress_FaxNumber\"]");
    private By _billingCheckOutButton =By.xpath("(//button[@class='button-1 new-address-next-step-button'])[1]");
    private By _nextDayAir =By.cssSelector("input#shippingoption_1");
    private By _shippingContinueButton=By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    private By _creditcard=By.cssSelector("input#paymentmethod_1");
    private By _creditCardContinueButton =By.xpath("//button[@onclick='PaymentMethod.save()']");
    private By _cardHolderName =By.cssSelector("input#CardholderName");
    private By _cardNumber =By.cssSelector("input#CardNumber");
    private By _month=By.xpath("//select[@name='ExpireMonth']");
    private By _year=By.id("ExpireYear");
    private By _cardCode=By.xpath("//input[@id='CardCode']");
    private By _continueAfterCardDetail =By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private By _orderConfirm =By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    Loadprop loadProp = new Loadprop();
    public void guestCanCheckOutSuccessfully() {
        clickOnElement(_guestButton);}

    public void userCanEnterGuestDetail(){
        //guest details
        typeText(_firstName,loadProp.getProperty("Vidya"));
        typeText(_lastName,loadProp.getProperty("Rathod"));
        typeText(_email,loadProp.getProperty("rowdy_rathod@gmail.com"));
        typeText(_company,loadProp.getProperty("police ltd"));
        selectDropDownElements(_country,loadProp.getProperty("India"));
        typeText(_city,loadProp.getProperty("RamDev"));
        typeText(_address1,loadProp.getProperty("01"));
        typeText(_zip,loadProp.getProperty("34536"));
        typeText(_phoneNumber,loadProp.getProperty("0123456"));
        typeText(_faxNumber,loadProp.getProperty("0123456"));
        clickOnElement(_billingCheckOutButton);
        clickOnElement(_nextDayAir);
        clickOnElement(_shippingContinueButton);
        // selecting card type and entering details
        clickOnElement(_creditcard);
        clickOnElement(_creditCardContinueButton);
        typeText(_cardHolderName,loadProp.getProperty("Nathan Berry"));
        typeText(_cardNumber,loadProp.getProperty("4527886398742518"));
        selectOptionByIndex(_month,Integer.parseInt(loadProp.getProperty(8)));
        selectOptionByValue(_year,"2027");
        typeText(_cardCode,"807");
        clickOnElement(_continueAfterCardDetail);
        clickOnElement(_orderConfirm);


    }}

