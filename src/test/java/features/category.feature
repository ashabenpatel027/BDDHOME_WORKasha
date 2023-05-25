Feature: Category

  Background:
    Given  I am on Demonopcommerce homepage

  @Category
  Scenario Outline: category feature

    Given I am on Demonopcommerce homepage
    When I click on "<button_name>" button
    Then I should able to verify I am navigated to related page "<page_url>" successfully
    And I should able verify the page title as "<page_title>"
    Examples:
      | button_name       | page_url                                       | page_title        |
      | Computers         | https://demo.nopcommerce.com/computers         | Computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       | Electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           | Apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads | Digital downloads |
      | Books             | https://demo.nopcommerce.com/books             | Books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           | Jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        | Gift Cards        |
