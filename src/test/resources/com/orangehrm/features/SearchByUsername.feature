Feature: Search User By Username

  Background: Login Website
    Given User should go to login page
    And User enter the username
    And User enter the password
    And User click the login button

  @regression @searchUser
  Scenario Outline: Title of your scenario
    Given Admin click Admin button
    And Page shows System Users module 
    Then Admin enter an user name <user_name> in system users module
    And Admin click search button
    Then User is showed in system users table <user_name>

    Examples: 
      | user_name       |
      | "LindaAnderson" |
