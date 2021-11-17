@development
Feature: User send Files to Group Chat
  User want to attached files to Group Chat
  
@chatgambar
  Scenario: User send Files to Group Chat
    Given User access the Dashboard Page
    When User Attached "testingfilePDF.pdf" as image in Group Chat
    Then User success send image and see the last image

    #Examples: 
      #| files             |
      #| fileJPEG.JPEG     |
      #| filePNG.png				|
      #| filePDF.pdf				|
      #| fileCSV.csv				|
      #|	fileAPK.apk				|
      #| fileXLSX.xlsx			|

      
 #@negativechatgambar
  #Scenario: User send Files to Group Chat
    #Given User access the Dashboard Page
    #When User Attached "fileCSV.csv" as image in Group Chat
    #Then User success send image and see the last image     