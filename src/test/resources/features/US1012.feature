#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click 'Products' button
#5. Hover over first product and click 'Add to cart'
#6. Click 'Continue Shopping' button
#7. Hover over second product and click 'Add to cart'
#8. Click 'View Cart' button
#9. Verify both products are added to Cart
#10. Verify their prices, quantity and total price

Feature: US1012 To make success shopping

  Scenario: TC12 shopping on website
    Given Navigate to url of automationexercise
    Then Verify that home page is visible successfully
    Then Click Products button
    When Hover over first product and click 'Add to cart'
    When Click Continue Shopping button
    And Click View Cart button
    And Hover over second product and click 'Add to cart'
    And Verify both products are added to Cart
    And Verify their prices quantity and total price
    And close the browser