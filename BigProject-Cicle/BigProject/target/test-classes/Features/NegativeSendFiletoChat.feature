@development
Feature: User send incorrect format Files to Group Chat
  User not able incorrect format Files to Group Chat
  
 @negativechatgambar
  Scenario Outline: User send incorrect format Files to Group Chat
    Given User has the Dashboard Page
    When User Attached "<files>" as files in Group Chat
    Then User unssuccessfully send file to Group Chat
    
        Examples: 
      | files             |
      | fileCSV.csv				|
      |	fileAPK.apk				|
  
