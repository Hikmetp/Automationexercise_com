Feature: Register User with existing email


  Scenario: Register User with existing email


    Given  Navigate to url
    When Verify that home page is visible successfully
    Then  Click on Signup Login button
    Then  Verify New User Signup! is visible
    Then  Enter name and already registered email address
<<<<<<< HEAD
    Then  Click 'Signup' button
    Then  Verify error 'Email Address already exist!' is visible
    Then  close the browser as same
=======
    Then  Click Signup button
    Then  Verify error Email Address already exist! is visible
    Then  close the browser as want
>>>>>>> main
