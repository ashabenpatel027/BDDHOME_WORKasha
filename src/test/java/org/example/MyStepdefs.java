package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ProductPge productPge = new ProductPge();
    LoginPage loginPage =new LoginPage();
    LoginResultPage loginResultPage = new LoginResultPage();
    EmailToFriendPage emailToFriendPage = new EmailToFriendPage();
    EmailToFriendResultPage sendEmailResultPage = new EmailToFriendResultPage();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registerPage.enterRegistrationDetails();
    }

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.VerifyUserRegisterSuccessfully();
    }
    @When("I click on Apple Macbook product")
    public void i_click_on_apple_macbook_product() {
        productPge.userShouldReferAppleProductToFriend();



    }
    @Then("I should able to email  this product to friend")
    public void i_should_able_to_email_this_product_to_friend() {
        emailToFriendPage.enterFriendEmailsDetail();


    }
    @Then("Friend should get message")
    public void friend_should_get_message() {
        sendEmailResultPage.VerifyUserSendEmailFriendsSuccessfully();


    }
    @And("I am on login page")
    public void iAmOnLoginPage() {
        loginPage.enterLoginEmail();
    }

    @When("I enter required registration New details")
    public void iEnterRequiredRegistrationNewDetails() {
        registerPage.enterRegistrationNewDetails();
        
    }

    @And("Click on log in button and fill required details")
    public void clickOnLogInButtonAndFillRequiredDetails() {
        loginPage.enterLoginEmail();
        
    }

    @And("Click on selected product")
    public void clickOnSelectedProduct() {
        productPge.userShouldReferAppleProductToFriend();

    }
}




