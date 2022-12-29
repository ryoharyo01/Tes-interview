Feature: User Send Message

  Scenario: Enter Modul Message
    When User go to Modul Message
    And User Search Contact 1
    And User Klik Contact 1
    And User Input Message 1
    Then Succesfully Send Messege to Admin

  Scenario: Send Messege to Deskcoll
    And User Search Contact 2
    And User Klik Contact 2
    And User Input Message 2
    Then Succesfully Send Messege to Deskcoll

  Scenario: Send Messege to Supervisor
    And User Search Contact 3
    And User Klik Contact 3
    And User Input Message 3
    Then Succesfully Send Messege to Supervisor






