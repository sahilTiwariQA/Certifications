Feature: To check the Edit Profile  functionality for each user

  Scenario Outline: Successful login with valid credentials
    Given user is on PackAndGo login page
    When user enters the "<username>" and "<password>" credentials
    Then user logged in and checks for Edit Profile
    And user logout from application

    Examples: 
      | username  | password  |
      | pgAlmacho | freezeray |
      | pgScarlet | freezeray |
