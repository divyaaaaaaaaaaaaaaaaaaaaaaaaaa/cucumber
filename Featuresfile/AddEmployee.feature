@tag
Feature: 
  As admin user add new employee

  @addemp
  Scenario Outline: Add employee with multiple data

    Given user navigates url as "http://orangehrm.qedgetech.com/" in a browser
    When user logs as "Admin" in username
    And user logs as "Qedge123!@#"in password
    And user click login data
    Then user login success
    When user clicks pim
    When user click Add button
    When user enter as "<Firstname>" in fname
    And user enter as "<Middlename>" in mname
    And user enter as"<Lastname>" in lname
    And user capture Eid before adding
    And user clicks save button
    And user capture Eid after adding
    Then user validates eid
    Then user close browser

    Examples: 
      | Firstname | Middlename | lastname |
      | sai1      | divya2     | buduru3  |
      | sai4      | divya5     | buduru6  |
      | sai3      | divya2     | buduru1  |
      | sai10     | divya3     | buduru10 |
      | sai11     | divya6     | buduru9  |
      | sai12     | divya7     | buduru8  |
