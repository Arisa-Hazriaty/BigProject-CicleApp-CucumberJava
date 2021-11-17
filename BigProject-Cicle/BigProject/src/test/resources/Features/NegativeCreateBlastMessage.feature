@development
Feature: User Blast the message but empty all Mandatory Fields
  User wants to Blast the message but empty all Mandatory Fields

  @negativeblast
  Scenario: User wants to Blast Message but empty all Mandatory Fields
    Given User on Boards Page
    When User Open the Blast Page
    And User Publish the Blast Message
    Then User get message Field parameter not complete
