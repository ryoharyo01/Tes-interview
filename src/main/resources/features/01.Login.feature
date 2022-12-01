Feature: User login

  Scenario:TCC.DC.003 Login Valid
    When TCC.DC.003 User go to Web Deskcoll
    And TCC.DC.003 User click button advance
    And TCC.DC.003 User click button unsafe
    And TCC.DC.003 User enter username dan password valid
    And TCC.DC.003 User click button login valid
    Then TCC.DC.003 User valid credentials