@development
Feature: User added Comment in one of card name
  User able to added Comment  one of card name

  @AddnewComment
  Scenario Outline: User added Comment in one of card name
    Given User want to add Comment in a board
    And User choose cardname will be add to comment
    When User put "<comment>" the comments
    And User Click Save Button
    Then User get Message Success

    Examples: 
      | comment                 |
      | Testing Add New Comment |
