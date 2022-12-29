package com.dika.deskcoll.step_definitions;

import com.dika.deskcoll.step_definitions.pages.ManagementPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class TestManagement {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private final ManagementPage managementPage = new ManagementPage();

    public TestManagement() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User go to Modul Management")
    public void User_go_to_Modul_Management() {

        //        ManagementPage managementPage = new ManagementPage();
//        managementPage.ModulManagement();
        Hooks.delay(2);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://10.0.2.8:8443/collectdev/");
        driver.navigate().refresh();
        Hooks.delay(2);
        upHold();
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@id='54265_query']/span")).click();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User go to Modul Management");
    }

    @And("User klik Add User")
    public void User_Add_User() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@id='53741_query']/span")).click();
        extentTest.log(LogStatus.PASS, "User klik Add User");
    }
    @And("User Input Form")
    public void User_Input_Form() {
        managementPage.InputForm();
        managementPage.SubmitForm();
        extentTest.log(LogStatus.PASS, "User Input Form");
        Hooks.delay(2);
    }
    @And("User Search Data")
    public void User_Search_Data() {
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_text")).click();
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_text")).clear();
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_text")).sendKeys("Saman Brembo");
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_finder")).click();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "User Search Data");
        Hooks.delay(2);
    }
    @And("Logout Recent User")
    public void Logout_Recent_User() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@id='54327_query']/span")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='TIDAK'])[1]/following::span[1]")).click();
        //label[@id='dc_login-1-54291_text']/span

        extentTest.log(LogStatus.PASS, "Logout Recent User");
    }

    @And("Input New User Username And Password")
    public void Input_New_User_Username_And_Password() {
        Hooks.delay(2);
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys("racingman");
        Hooks.delay(2);
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys("1111aaaa");
        extentTest.log(LogStatus.PASS, "Input New User Username And Password");
    }
    @And("Klik Login")
    public void Klik_Login() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@id='53203_query']/span")).click();
        Hooks.delay(3);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")).click();
        extentTest.log(LogStatus.PASS, "Klik Login");
    }
    @And("Go To Management")
    public void Go_To_Management() {
        driver.findElement(By.xpath("//button[@id='54265_query']/span")).click();
        extentTest.log(LogStatus.PASS, "Go To Management");
    }
    @And("Search New User")
    public void Search_New_User() {
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_text")).click();
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_text")).clear();
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_text")).sendKeys("Jack Separo");
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_finder")).click();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Search New User");
        Hooks.delay(2);
    }
    @And("Edit Data User")
    public void Edit_Password_And_Data_User() {
        driver.findElement(By.id("--_text")).click();
        Hooks.delay(2);
        driver.findElement(By.id("dc_agent_editable-21-53175_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_agent_editable-21-53175_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_agent_editable-21-53175_text")).sendKeys("Jack Separo");
        Hooks.delay(2);
        driver.findElement(By.id("dc_agent_editable-21-53176_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_agent_editable-21-53176_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_agent_editable-21-53176_text")).sendKeys("Jack Separo");
        Hooks.delay(2);
        Select Supervisor = new Select(driver.findElement(By.id("dc_agent_editable-21-53179_text")));
        Supervisor.selectByVisibleText("Jeffry");
        Hooks.delay(2);
        Select Skill = new Select(driver.findElement(By.id("dc_agent_editable-21-53181_text")));
        Skill.selectByVisibleText("skill 2");
        Hooks.delay(2);
        driver.findElement(By.id("dc_agent_editable-21-53186_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_agent_editable-21-53186_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_agent_editable-21-53186_text")).sendKeys("dikatester");
        Hooks.delay(2);
        //
        driver.findElement(By.xpath("//button[@id='53194_query']/span")).click();
        driver.findElement(By.id("dc_agent_edit_pass-1000-53293_text")).clear();
        driver.findElement(By.id("dc_agent_edit_pass-1000-53293_text")).sendKeys("1212aaaa");
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@id='53292_query']/span")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No'])[2]/following::span[1]")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@id='53189_query']/span")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No'])[2]/following::span[1]")).click();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Edit Data User");
    }
@And("Login With Old Username And Password")
public void Login_With_Old_Username_And_Password() {
    driver.findElement(By.id("dc_login-1-53201_text")).sendKeys("racingman");
    Hooks.delay(2);
    driver.findElement(By.id("dc_login-1-53202_text")).sendKeys("1111aaaa");
    driver.findElement(By.xpath("//button[@id='53203_query']/span")).click();
    extentTest.log(LogStatus.PASS, "Login With Old Username And Password");
}
    @And("Login With New Username And Password")
    public void Login_With_New_Password() {
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys("dikatester");
        Hooks.delay(2);
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys("1212aaaa");
        driver.findElement(By.xpath("//button[@id='53203_query']/span")).click();
        extentTest.log(LogStatus.PASS, "Login With New Password");
    }
    @And("Klik Checkbox New User")
    public void Klik_Checkbox_New_User() {
        driver.findElement(By.name("dc_user_management--53746_text")).click();
        extentTest.log(LogStatus.PASS, "Klik Checkbox New User");
    }
    @And("Klik Reset Password")
    public void Klik_Reset_Password() {
        driver.findElement(By.xpath("//button[@id='53743_query']/span")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NO'])[1]/following::span[1]")).click();
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Klik Reset Password");
    }
    @And("Login With Recent Password")
    public void Login_With_Recent_Password() {
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys("dikatester");
        Hooks.delay(2);
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys("1212aaaa");
        driver.findElement(By.xpath("//button[@id='53203_query']/span")).click();
        extentTest.log(LogStatus.PASS, "Login With Recent Password");
    }
    @And("Login With Reset Password")
    public void Login_With_Reset_Passworrd() {
        Hooks.delay(2);
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys("dikatester");
        Hooks.delay(2);
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys("1");
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@id='53203_query']/span")).click();

        extentTest.log(LogStatus.PASS, "Login With Reset Password");
    }
    @And("Klik Disable")
    public void Klik_Disable() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@id='53740_query']/span")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NO'])[1]/following::span[1]")).click();
        extentTest.log(LogStatus.PASS, "Klik Disable");
    }
    @And("Login With User Super Admin")
    public void Login_With_User_Super_Admin() {
        Hooks.delay(2);
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys("somad");
        Hooks.delay(2);
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys(Keys.CONTROL + "a");
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys("somad12345");
        driver.findElement(By.xpath("//button[@id='53203_query']/span")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")).click();
        extentTest.log(LogStatus.PASS, "Login With User Super Admin");
    }
    @And("Klik Enable")
    public void Klik_Enable() {
        driver.findElement(By.xpath("//button[@id='53738_query']/span")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NO'])[1]/following::span[1]")).click();
        extentTest.log(LogStatus.PASS, "Klik Enable");
    }
    @And("Klik Delete Button")
    public void Klik_Delete_Button() {
        driver.findElement(By.xpath("//td[16]/div/table/tbody/tr/td[2]/div/img")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Tidak'])[1]/following::span[1]")).click();
        extentTest.log(LogStatus.PASS, "Klik Enable");
    }

    //---------------------------------------------------------------------------------------------------//

    @Then("Succesfully Adding User Login")
    public void Succesfully_Adding_User_Login() {
        assertEquals(driver.findElement(By.id("dc_user_management--53746-cell-0-2")).getText(), "Saman Brembo");
        extentTest.log(LogStatus.PASS, "Succesfully Adding User Login");
        Hooks.delay(2);
    }
    @Then("Succesfully Login With New User")
    public void Succesfully_Login_With_New_User() {
        assertEquals(driver.findElement(By.xpath("//button[@id='54221_query']/span")).getText(), "Racingman");
        extentTest.log(LogStatus.PASS, "Succesfully Login With New User");
        Hooks.delay(2);
    }
    @Then("Succesfully Edit Data")
    public void Succesfully_Edit_Data() {
        driver.findElement(By.xpath("//button[@id='54265_query']/span")).click();
        Hooks.delay(2);
        driver.findElement(By.id("dc_user_management--53748_text")).sendKeys("Jack Separo");
        driver.findElement(By.xpath("//button[@id='53750_query']/span")).click();
        assertEquals(driver.findElement(By.id("dc_user_management--53746-cell-0-6")).getText(), "Jeffry");
        extentTest.log(LogStatus.PASS, "Succesfully Edit Data");
        Hooks.delay(2);
    }
    @Then("Succesfully Reset Password")
    public void Succesfully_Reset_Password() {
        Hooks.delay(2);
        assertEquals(driver.findElement(By.xpath("//div[@id='nikita-form-dialog']/p")).getText(), "PASSWORD BERHASIL DI RESET");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")).click();
        extentTest.log(LogStatus.PASS, "Succesfully Reset Password");
        Hooks.delay(2);
    }
    @Then("Fail To Login")
    public void Fail_To_Login() {
        Hooks.delay(2);
        assertEquals(driver.findElement(By.xpath("//div[@id='nikita-form-dialog']/p")).getText(), "Username atau password tidak ditemukan atau akun anda tidak aktif");
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[2]/following::span[2]")).click();
        extentTest.log(LogStatus.PASS, "Fail To Login");
        Hooks.delay(2);
    }
    @Then("Succesfully Login")
    public void Succesfully_Login () {
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")).click();
        assertEquals(driver.findElement(By.xpath("//button[@id='54221_query']/span")).getText(), "Dikatester");
        extentTest.log(LogStatus.PASS, "Succesfully Login");

    }
    @Then("Succesfully Disabled User")
    public void Succesfully_Disabled_User() {
        Hooks.delay(2);
        assertEquals(driver.findElement(By.xpath("//div[@id='nikita-form-dialog']/p")).getText(), "DATA BERHASIL DI UBAH");
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")).click();
        extentTest.log(LogStatus.PASS, "Succesfully Disabled User");
    }
    @Then("Succecfully Delete Account")
    public void Succecfully_Delete_Account() {
        assertEquals(driver.findElement(By.id("dc_user_management--53746-cell-0-2")).getText(), "Jack Separo");
        extentTest.log(LogStatus.PASS, "Succecfully Delete Account");
        Hooks.delay(2);
    }
    @Then("Succesfully Enabled User")
    public void Succesfully_Enabled_User() {
        Hooks.delay(2);
        assertEquals(driver.findElement(By.xpath("//div[@id='nikita-form-dialog']/p")).getText(), "DATA BERHASIL DI UBAH");
        Hooks.delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")).click();
        extentTest.log(LogStatus.PASS, "Succesfully Enabled User");
        Hooks.delay(2);

    }



    public void upHold() {
            for (int i = 0; i < 30; i++) {
                try {
                    Robot r = new Robot();
                    r.keyPress(KeyEvent.VK_UP);
                    r.keyRelease(KeyEvent.VK_UP);
                } catch (AWTException e) {
                    e.printStackTrace();
                }
            }
        }}