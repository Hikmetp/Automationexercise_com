Feature: Automation Exercise Register User

  @tag
  Scenario: TC_01_Test_Case
    Given launch the browser02
    When navigate to the url02
    Then verify the homepage if it is visible successfully02
    Then click on signup or login button
    And verify new user signup caution is visible
    Then enter name and email address
    And click on the signup button
    Then verify the ENTER ACCOUNT INFORMATION is visible
    Then fill details title name email password dob
    Then select the signup for our newsletter checkbox
    Then select the receive special offers from our partners checkbox
    Then fill details firstname lastname company address address2 country state city zipcode mobile number
    Then click create account button
    Then verify that ACCOUNT CREATED is visible
    Then click continue button
    Then verify Logged in as username is visible
    Then click Delete Account button
    Then verify that ACCOUNT DELETED is visible and click Continue button
    Then close the browser