Feature: Login

  Background: Login Website
    Given User should go to login page
    And User enter the username
    And User enter the password
    And User click the login button

  @login @regression @smoke @tet1
  Scenario: User can login application
    Then User can see the Home Page
  Scenario: User can login application
    Then User can see the Home Page
    