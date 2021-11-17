@development
Feature: User Add list Board
  User want Add list Board

  @AddList
  Scenario Outline: User Add List Board
    Given User access Board page
    And User Add List "<addlist>" Board
    And User Click Save button
    Then User successfully to Add list Board

    Examples: 
      | addlist              |
      | Ready for Production |
