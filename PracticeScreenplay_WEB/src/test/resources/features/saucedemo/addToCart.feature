Feature: Add to cart functionality
  As a user of the platform
  I wish to add a product to the shopping cart
  To verify its functionality

  Scenario: AddToCartSuccessfully
    Given the user is in the main page
    When he login with his credentials
      | username      | password     |
      | standard_user | secret_sauce |
    And add a item "Sauce Labs Bike Light" to the cart
    And proceed to complete the purchase of your item
    Then should see the message "THANK YOU FOR YOUR ORDER"