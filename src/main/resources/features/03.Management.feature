Feature: Add User login

  Scenario: Adding New User
    When User go to Modul Management
    And User klik Add User
    And User Input Form
    And User Search Data
    Then Succesfully Adding User Login

  Scenario: Login With New User
    And Logout Recent User
    And Input New User Username And Password
    And Klik Login
    Then Succesfully Login With New User

  Scenario: Edit Data New User
    And Go To Management
    And User Search Data
    And Edit Data User
    Then Succesfully Edit Data

  Scenario: Login User With Old Username And Password
   Then Logout Recent User
    And Login With Old Username And Password
    Then Fail To Login

  Scenario: Login User With New Username And Password
    And Login With New Username And Password
    Then Succesfully Login

  Scenario: Reset Account Password
    And Go To Management
    And Search New User
    And Klik Checkbox New User
    And Klik Reset Password
    Then Succesfully Reset Password

  Scenario: Login Old Password After Reset Password
   And Logout Recent User
   And Login With Recent Password
    Then Fail To Login

  Scenario: Login With Reset Password
   And Login With Reset Password
   Then Succesfully Login

  Scenario: Disable User Account
    And Go To Management
    And Search New User
    And Klik Checkbox New User
    And Klik Disable
    Then Succesfully Disabled User

    Scenario: Login With Disabled Password
    And Logout Recent User
    And Login With Reset Password
    Then Fail To Login

  Scenario: Enable User Account
    And Login With User Super Admin
    And Go To Management
    And Search New User
    And Klik Checkbox New User
    And Klik Enable
    Then Succesfully Enabled User

    Scenario: Login After Enable User Account
    And Logout Recent User
    And Login With Reset Password
    Then Succesfully Login

  Scenario: Delete Account
    And Go To Management
    And Search New User
    And Klik Checkbox New User
    And Klik Delete Button
    Then Succecfully Delete Account

