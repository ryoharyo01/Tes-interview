package com.dika.deskcoll.step_definitions;


import com.dika.deskcoll.step_definitions.drivers.DriverSingleton;
import com.dika.deskcoll.step_definitions.utils.Constants;
import com.dika.deskcoll.step_definitions.utils.TestScenarios;
import com.dika.deskcoll.step_definitions.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports("target/extent-reports.html");

    private static TestScenarios[] tests = TestScenarios.values();
    private String testReport = "";
    @Before
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        testReport = tests[Utils.testCount].getTestName();
        extentTest = reports.startTest(testReport);
        {
            Utils.countOutline=0;
            Utils.testCount++;
        }
        Utils.countOutline++;
    }

    @After
    public void closeObject() {
        reports.endTest(extentTest);
        reports.flush();
    }

//    @AfterAll
//    public static void closeBrowser() {
//        delay(3);
//        DriverSingleton.closeObjectInstance();
//    }

    public static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void scroll(int vertical) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+vertical+")");
    }

}