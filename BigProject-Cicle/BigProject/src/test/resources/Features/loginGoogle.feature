Feature: User Access Board
  User want to Access Board Cicle App

  @login
  Scenario: User Access Board via social media google
    Given User on the Sign In page
    When User choose signin Google
    Then Board Staging Cicle displayed
