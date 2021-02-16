Feature: Login Functionality


  Background:
    Given the user is on the main page

  @wip
  Scenario: Verify that, User should be able to login as HR user with Valid Credentials
    When User login as HR user
    Then User should see "(1) Portal" as a title

  Scenario: Verify that, User should be able to login as Helpdesk user with Valid Credentials
    When User login as Helpdesk user
    Then User should see "Portal" as a title

  Scenario: Verify that, User should be able to login as Marketing user with Valid Credentials
    When User login as Marketing user
    Then User should see "(1) Portal" as a title


  Scenario Outline: Verify that as a user, I should not be able to login with invalid credentials

    When User login with "<userType>" and "<password>"
    Then User should see "Incorrect login or password" error message


    Examples:
      | userType                     | password |
      | hr3@cybertekschool.com       | UserUser |
      | Wrong                        | UserUser |
      | Wrong                        | Wrong    |
      | helpdesk1@cybertekschool.com |          |
      |                              | UserUser |
      |                              |          |



