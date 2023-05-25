package org.example;

import org.openqa.selenium.By;



    public class RegisterPage extends Utils{
        private By _firstName = By.xpath("//input[@id='FirstName']");
        private By _lastName =By.xpath("//input[@id='LastName']");
        private By _dayOfBirth =By.xpath("//select[@name='DateOfBirthDay']");
        private By _monthOfYear = By.xpath("//select[@name='DateOfBirthMonth']");
        private By _birthOfYear =By.xpath("//select[@name='DateOfBirthYear']");
        private By _EmailAddress   = By.xpath("//input[@id='Email']");
        private By _password =By.xpath("//input[@id='Password']");
        private By _confirmPassword =By.xpath("//INPUT[@ID=\"ConfirmPassword\"]");
        private By _registerSubmitButton =By.id("register-button");
        Loadprop loadProp = new Loadprop();

        public  void enterRegistrationDetails() {
            //type first name
            typeText(_firstName,loadProp.getProperty("firstName"));
            //type last name
            typeText(_lastName,loadProp.getProperty("lastName"));
            //D.O.B can use text or value
            selectOptionByValue(_dayOfBirth,loadProp.getProperty("dayOfBirth"));
            //MONTH.called index bcz its countable
            selectOptionByIndex(_monthOfYear,Integer.parseInt(loadProp.getProperty("birthOfMonth")));
            //year. called value
            selectOptionByValue(_birthOfYear,loadProp.getProperty("birthOfYear"));
            //type email address
            typeText(_EmailAddress,loadProp.getProperty("EmailAddress"));
            //type password
            typeText(_password,loadProp.getProperty("password"));
            //type confirm password
            //click on register submit button
            clickOnElement(_registerSubmitButton);

        }
        //made extra method to run program
        public void enterRegistrationNewDetails() {
            //enter first name
            typeText(_firstName, loadProp.getProperty("firstName"));
            //enter last name
            typeText(_lastName, loadProp.getProperty("lastName"));
            //type date of birth
            selectOptionByValue((_dayOfBirth), loadProp.getProperty("dayOfBirth"));
            //type month of birth
            selectOptionByIndex(_monthOfYear, Integer.parseInt(loadProp.getProperty("birthOfMonth")));
            //type year of birth
            selectOptionByValue(_birthOfYear, loadProp.getProperty("birthOfYear"));
            //type email address
            typeText(_EmailAddress, loadProp.getProperty("emailAddressNew"));
            //type password
            typeText(_password ,loadProp.getProperty("password"));
            //type confirm password
            typeText(_confirmPassword, loadProp.getProperty("confirmPassword"));
            //click on register submit button
            clickOnElement(_registerSubmitButton);


        }}



