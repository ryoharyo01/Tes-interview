package com.dika.deskcoll.step_definitions.utils;

public enum TestScenarios {

/*
    AHLAN REZKI
 */
    //Modul Login Invalid Klik Sign In
    T1("TCC.PO.004 invalid login username password kosong");
    private String testName;

    private TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
