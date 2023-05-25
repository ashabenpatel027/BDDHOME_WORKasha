package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MyStepdefs  extends Utils{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    ProductPge productPge = new ProductPge();
    LoginPage loginPage =new LoginPage();
    LoginResultPage loginResultPage = new LoginResultPage();
    EmailToFriendPage emailToFriendPage = new EmailToFriendPage();
    EmailToFriendResultPage sendEmailResultPage = new EmailToFriendResultPage();

// Registration feature step definitions.......
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
    //Friend email step definitions getting from Email to friend class
    @Then("I should able to email  this product to friend")
    public void i_should_able_to_email_this_product_to_friend() {
        emailToFriendPage.enterFriendEmailsDetail();


    }
    @Then("Friend should get message")
    public void friend_should_get_message() {
        sendEmailResultPage.VerifyUserSendEmailFriendsSuccessfully();


    }
    //login steps implementation
    @And("I am on login page")
    public void iAmOnLoginPage() {
        loginPage.enterLoginEmail();
    }

    @When("I enter required registration New details")
    public void iEnterRequiredRegistrationNewDetails() {
        registerPage.enterRegistrationNewDetails();
        
    }
     //steps for login page
    @And("Click on log in button and fill required details")
    public void clickOnLogInButtonAndFillRequiredDetails() {
        loginPage.enterLoginEmail();
        
    }
//from product class getting step definitions and implementing
    @And("Click on selected product")
    public void clickOnSelectedProduct() {
        productPge.userShouldReferAppleProductToFriend();

    }

    @Given("I am on Demonopcommerce homepage")
    public void iAmOnDemonopcommerceHomepage() {
    }
  // making method  parameterizes xpath
    @When("I click on {string} button")
    public void iClickOnButton(String button_name) {
        //concatenation parameterizes xpath
        clickOnElement(By.xpath("//a[text()='"+button_name+" ']"));
        homePage.clickOnCategory(button_name);
    }

    @Then("I should able to verify I am navigated to related page {string} successfully")
    public void iShouldAbleToVerifyIAmNavigatedToRelatedPageSuccessfully(String page_url) {
        Assert.assertEquals(driver.getCurrentUrl(),page_url);
    }

    @And("I should able verify the page title as {string}")
    public void iShouldAbleVerifyThePageTitleAs(String page_title ){
         homePage.verifyPageTitle(page_title);
       // we can use below assert direct or above which we created in home page
       // Assert.assertEquals(getTextFromElement(By.tagName("h1")),page_title);
    }
    @When("I hover over {string} category link")
    public void i_hover_over_category_link(String categoryName) {
        homePage.hoverOverCategoryButton(categoryName);
    }

    @Then("I should able to verify after hover changes")
    public void iShouldAbleToVerifyAfterHoverChanges() {

    }

    @When("I click on Subcategory {string} link")
    public void iClickOnSubcategoryLink(String subCategory) {
        homePage.verifySubCategory(subCategory);

    }

    @Then("I should able to successfully navigated to {string} page")
    public void iShouldAbleToSuccessfullyNavigatedToPage(String page) {
        homePage.verifySubCategoryPage(page);
    }
}







