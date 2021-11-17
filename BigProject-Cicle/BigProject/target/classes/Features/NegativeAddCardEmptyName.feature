@development
Feature: User Add Card Name but Name card is Empty
  User want to Add Card Name but Name card is Empty

  @nagativecardname
  Scenario: User Add Card Name but Name card is Empty
    Given User on the Boards page
    And User Add Card Name but the name is Empty
    Then The User get message Card name cannot be empty
