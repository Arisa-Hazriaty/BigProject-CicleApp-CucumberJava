@development
Feature: User Blast the message
  User wants to Blast the message

  @blast
  Scenario Outline: User wants to Blast Message
    Given User on the Board Page
    When User go to Blast Page
    And User type a "<title>" as Title and User set "<story>" as Story
    Then User set "<duedate>" and set  "<time>" time
    And User Publish the Blast Message
    Then User see List Blast

    Examples: 
      | title         | story                  | duedate    | time     |
      | Blast Testing | Testing Blast Messages | 2021/10/25 | 01:00 AM |
