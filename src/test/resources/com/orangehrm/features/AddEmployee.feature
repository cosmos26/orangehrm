Feature: Add an employee

  @addEmployee
  Scenario Outline: User can add employee
    Given User should go to login page
    And User enter the username
    And User enter the password
    And User click the login button
    Then User click PIM button
    Then User click Add Employee button
    And User enter employee data <first_name> <last_name> and location
    Then User click next button
    And User chooses region, fte and temporary_department
    When User click save button
    Then Employee's Personal Details page should be loaded

    Examples: 
      | first_name | last_name |
      | "Michael"  | "Huy"     |
   
