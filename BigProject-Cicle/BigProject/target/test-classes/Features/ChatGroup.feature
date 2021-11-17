@development
Feature: User chat to Group Chat
  User want to chat to Group Chat

  @Groupchat
  Scenario Outline: User chat to Group Chat
    Given User already on the Dashboard Page
    When User Input "<message>" in Group Chat
    And User click Send Button
    Then User success send chat and see the last chat

    Examples: 
      | message                     |
      | Halo Ini Arisa testing Lagi |


