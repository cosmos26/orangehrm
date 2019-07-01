Feature: Login

  @login
  Scenario: User can login application
    Given User should go to login page 
    And User enter the username
    And User enter the password
    And User click the login button
    Then User can see the Home Page
