package com.dika.deskcoll.step_definitions;

import com.dika.deskcoll.step_definitions.drivers.DriverSingleton;
import com.dika.deskcoll.step_definitions.pages.LoginPage;
import com.dika.deskcoll.step_definitions.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.dika.deskcoll.step_definitions.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("TCC.DC.003 User go to Web Deskcoll")
    public void tccdc003_User_go_to_web_deskcoll() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "TCC.DC.003 User go to Web Deskcoll");
    }

    @And("TCC.DC.003 User click button advance")
    public void tccdc003_user_click_button_advanced() {
        loginPage.clickBtnAdvanced();
        extentTest.log(LogStatus.PASS, "TCC.DC.003 User click button advance");
    }

    @And("TCC.DC.003 User click button unsafe")
    public void tccdc003_user_click_button_unsafe() {
        loginPage.clickBtnUnsafe();
        extentTest.log(LogStatus.PASS, "TCC.DC.003 User click button unsafe");
    }

    @And("TCC.DC.003 User enter username dan password valid")
    public void tccdc003_user_enter_username_password_valid() {
        loginPage.loginOne("somad", "somad12345");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("TCC.DC.003 User click button login valid")
    public void tccdc003_user_click_button_login_valid() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC.DC.003 User click button login valid");
    }

    @Then("TCC.DC.003 User valid credentials")
    public void tccdc003_user_valid_credentials() {
        Assert.assertEquals(loginPage.getTxtWelcome(), "Welcome to Deskcoll");
        extentTest.log(LogStatus.PASS, "TCC.DC.003 User valid credentials");
        loginPage.clickOk();
        DriverSingleton.closeObjectInstance();
    }
}
