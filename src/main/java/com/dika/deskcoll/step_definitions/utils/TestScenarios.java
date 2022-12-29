package com.dika.deskcoll.step_definitions.utils;

public enum TestScenarios {

/*
    AHLAN REZKI
 */
    //Modul Login Invalid Klik Sign In
    T1("TCC.PO.003 invalid login username password kosong"),
    T2("Enter Modul Message"),
    T3 ("Send Messege to Deskcoll"),
    T4 ("Send Messege to Supervisor "),
    T5 ("Adding New User"),
    T6 ("Login With New User "),
    T7 ("Edit Data New User"),
    T8 ("Login User With Old Username And Password"),
    T9 ("Login User With New Username And Password"),
    T10 ("Reset Password User"),
    T11 ("Login Old Password After Reset Password"),
    T12 ("Login With Reset Password"),
    T13 ("Disable User Account"),
    T14 ("Login With Disabled Password"),
    T15 ("Enable User Account"),
    T16 ("Login After Enable User Account"),
    T17 ("Delete Account");



    private final String testName;

    private TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
