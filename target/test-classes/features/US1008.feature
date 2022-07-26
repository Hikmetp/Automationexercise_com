Feature:Verify All Products and product detail page
  @tc08
  Scenario:Verify All Products and product detail page
    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then The products list is visible
    Then  Click on View Product of first product
    Then User is landed to product detail page
    Then Verify that detail is visible: product name, category, price, availability, condition, brand