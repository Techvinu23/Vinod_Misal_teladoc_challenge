
Feature: Add User in Table

  
  Scenario: Add a user and validate the user has been added to the table
    Given Launch web application
    When User click on add user button  
    Then User should added in table

  
   Scenario: Delete the user and validate the user has been deleted from the table
    Given Launch web application
    When User click on delete user button  
    Then User should deleted from table

   