package com.step_definitions.utils;

public enum TestScenarios {

    //Modul Login Invalid Klik Sign In
    T1("Login user valid"),
   T2("Add new employee"),
   T3("Update data new employee"),
    T4 ("Upload Photo Profil Employee"),
    T5 ("Delete data employee");
//    T6 ("Login With New User "),
//    T7 ("Edit Data New User"),
//    T8 ("Login User With Old Username And Password"),
//    T9 ("Login User With New Username And Password"),
//    T10 ("Reset Password User"),
//    T11 ("Login Old Password After Reset Password"),
//    T12 ("Login With Reset Password"),
//    T13 ("Disable User Account"),
//    T14 ("Login With Disabled Password"),
//    T15 ("Enable User Account"),
//    T16 ("Login After Enable User Account"),
//    T17 ("Delete Account");



    private final String testName;

    private TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
