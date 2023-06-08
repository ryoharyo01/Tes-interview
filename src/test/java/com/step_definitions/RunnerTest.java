package com.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/00.LoginPage.feature",
                "src/main/resources/features/01.Create.feature",
                "src/main/resources/features/02.Update.feature",
                "src/main/resources/features/03.UploadFile.feature",
                "src/main/resources/features/04.Delete.feature"},


        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}