
Feature: Delete Employee

  
   
   Scenario: User can delete existing employee
   	Given User should go to login page 
    And User enter the username
    And User enter the password
    And User click the login button
    Then User can see the Home Page
    And User click PIM button
    And User click Employee List button
    Then User can see the list of employees
    Then User click the employee search field
    Then User types <employee_name> and searches 
    And Click on employee name
    Then User clicks Job tab
    Then User presses Terminate Employee button
    Then User chooses reason dismissed 
    And presses confirm button
    
    
    