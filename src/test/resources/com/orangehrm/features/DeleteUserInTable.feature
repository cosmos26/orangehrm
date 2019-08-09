Feature: Delete an User

  Background: Login Website
    Given User should go to login page
    And User enter the username
    And User enter the password
    And User click the login button

  @deleteUser @regression
  Scenario Outline: Delete an user in the table
    Given Admin click Admin button
    And Page shows System Users module
    Then Admin enter an user name <user_name> in system users module
    And Admin click search button
    Then User is showed in system users table <user_name>
    And User select user in the table
    And User click delete button

    Examples: 
      | user_name       |
      | "LindaAnderson" |

  @deleteUsers @regression
  Scenario Outline: Delete users in the table
    Given Admin click Admin button
    And Page shows System Users module
    Then Admin select users <user_name> in table
    And User click delete button

    Examples: 
      | user_name                           |
      | "hannah.flores" && "jasmine.morgan" |
