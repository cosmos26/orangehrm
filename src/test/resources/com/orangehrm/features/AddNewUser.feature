Feature: To Add a New User

  Background: Login Website
    Given User should go to login page
    And User enter the username
    And User enter the password
    And User click the login button

  @addNewUser @regression
  Scenario Outline: As a Admin create a new user
    Given Admin click Admin button
    And Page shows System Users module
    Then Admin click add button
    Then Admin select user role as ESS
    And Admin enter an employee name <employee_name>
    And Admin enter an user name <user_name>
    And Admin select status as enabled
    And Admin enter a password <password>
    And Admin confirm the password <password>
    Then Admin click save button
    Then Page shows Welcome Admin type
    Given Admin should logout
    And User enter the username <user_name>
    And User enter the password <password>
    And User click the login button
    Then Page shows Welcome Linda type

    Examples: 
      | employee_name    | user_name       | password            |
      | "Linda Anderson" | "LindaAnderson" | "LindaAnderson123!" |
	
	
