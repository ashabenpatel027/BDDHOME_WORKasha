Feature: referproducttoafriend
  @referAProductToFriend
  Scenario: AS a register user ,I should be able to refer a product to friend successfully
  so that
    Given I am on registration page
    When I enter required registration New details
    And Click on log in button and fill required details
    And Click on selected product
    Then I should able to email  this product to friend
    Then Friend should get message



