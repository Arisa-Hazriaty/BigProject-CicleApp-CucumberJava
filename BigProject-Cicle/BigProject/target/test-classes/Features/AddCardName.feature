@development
Feature: User Add Card Name on Board
  User want to Add Card Name on Board

  @cardname
  Scenario Outline: User Add Card Name
    Given User on the Board page
    And User Added "<cardname>" as card name
    Then The User get message Notification success

    Examples: 
      | cardname              |
      | Testing Add Card Name |

      
   