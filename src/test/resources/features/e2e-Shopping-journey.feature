Feature: End to End Shopping journey by customer
  As I a customer
  I login to saucedemo page and add highest & lowest product into basket
  and I checkout the products successfully

  @e2e
  Scenario: Checkout products successfully
    Given I login to saucedemo page
    And I sort the products by "hilo"
    And add them to basket
    And I Checkout the products
    And I enter personal details on Checkout Form
    Then I should see successful checkout message



