
Feature: Category
  Background:
    Given  I am on Demonopcommerce homepage
@hoverCategory
Scenario: I hover over the category link and verify the changes
When  I hover over "Electronics" category link
Then I should able to verify after hover changes
When I click on Subcategory "Camera & photo" link
  Then I should able to successfully navigated to "camera-photo" page













