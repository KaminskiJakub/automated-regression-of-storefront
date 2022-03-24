@login
Feature: Sign in
  Checking the user login process with previously created account

  @login_successful
  Scenario: Sign in with previously registered user
    Given I am on home page
    When I go to sign in section
    And I sign in with my credentials on login page
    Then I am on my account page as a logged in user

  @login_unsuccessful
  Scenario Outline: Sign in with wrong credentials
    Given I am on home page
    When I go to sign in section
    And I sign in with wrong credentials: <email> and <password>
    Then there is error message present
    And I am still on authentication page

    Examples:
      | email            | password   |
      | hippis@ymail.com | Testowe123 |
      | hippisymail.com  | Testowe123 |
      | hippis@ymailcom  | Testowe123 |
      | hippis@ymail.com |            |
      |                  |            |
      | hippis@ymail.com | s*h53@)gs  |

  @login_and_logout
  Scenario: Sign in and then log out
    Given I am on home page
    And I go to sign in section
    And I sign in with my credentials on login page
    And I am on my account page as a logged in user
    When I sign out
    Then I am on login page
