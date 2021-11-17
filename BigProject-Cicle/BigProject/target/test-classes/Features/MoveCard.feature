@development
Feature: User Move Card Name
  The User able to Move Cardname then chat to the group

  @movecard
  Scenario Outline: User Chat to Group Chat after Move Card Name
    Given User on the Board Page
    When User select Card will be move
    And User move the card to Todo list board
    Then User successfully to Moved Card

    Examples: 
      | success messages       |
      | Moving card is success |

 
      