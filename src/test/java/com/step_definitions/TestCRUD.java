package com.step_definitions;

import com.step_definitions.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class TestCRUD {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    public TestCRUD() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
   @When("Enter login page")
    public void enter_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        extentTest.log(LogStatus.PASS, "Enter login page");
    }
    @And("Input username")
    public void input_username() {
        driver.findElement(By.name("username")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("Admin");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Input username");
    }
    @And("Input password")
    public void input_password() {
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("password")).sendKeys("admin123");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Input password");
    }
    @And("Click button login")
    public void click_button_login() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Click button login");
    }
    @Then("Successfully login")
    public void succesfully_login() {
        Hooks.delay(2);
        assertEquals(driver.findElement(By.xpath("//div[@id='app']/div/div/header/div/div/span/h6")).getText(), "Dashboard");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS,"Successfully login");

    }
    @When("Click PIM")
    public void clickpim() {
        driver.findElement(By.linkText("PIM")).click();
        extentTest.log(LogStatus.PASS, "Click PIM");
    }
    @And("Click button add")
    public void click_button_add() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div/button")).click();
        extentTest.log(LogStatus.PASS, "Click button add");
    }
    @And("Input form data employee")
    public void input_form_employee() {
        Hooks.delay(2);
        driver.findElement(By.name("firstName")).click();
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Alisa");
        Hooks.delay(1);
        driver.findElement(By.name("middleName")).click();
        driver.findElement(By.name("middleName")).clear();
        driver.findElement(By.name("middleName")).sendKeys("Chanz");
        Hooks.delay(1);
        driver.findElement(By.name("lastName")).click();
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("Rodriguez");
        Hooks.delay(1);
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div/div/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div/div/div[2]/input")).sendKeys("0989");
        extentTest.log(LogStatus.PASS, "Input form data employee");
    }
    @Then("Click submit")
    public void click_submit() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        extentTest.log(LogStatus.PASS, "Click submit");
    }
//        ------------------------------------------------------------
@And("Search name")
public void search_name() {
        Hooks.delay(2);
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).clear();
    driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).sendKeys("Alisa Chanz Rodriguez");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    extentTest.log(LogStatus.PASS, "Search name");
    }
    @And("Click action edit")
    public void click_action_edit() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[2]/i\n")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div/div/div[2]/div/div/div[2]/i")).click();
        Hooks.delay(2);
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div[2]/div/div[2]/div/div/div")).click();
        extentTest.log(LogStatus.PASS, "Click action edit");
    }
    @And("Input form employee with new data")
    public void input_new_data() {
        Hooks.delay(2);
//        WebElement element = driver.findElement(By.xpath("//input[@id='composeText']"));
//        element.sendKeys(Keys.CONTROL + "a");
//        element.sendKeys(Keys.DELETE);
        WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/input"));
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/input")).sendKeys("1128");
        Hooks.delay(2);
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div[2]/div/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div[2]/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("4114");
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div/div/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div/div/div[2]/input")).sendKeys("21956");
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys("2024-07-09");

    }
        @Then("Click Save")
        public void click_Save() {
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
        driver.findElement(By.linkText("PIM")).click();
        extentTest.log(LogStatus.PASS, "Click Save");
    }
    @And("Edit photo employee")
            public void edit_photo_employee() {
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[2]/i")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/img")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div/div/div/div[2]/div/button/i")).click();
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Lenovo Mix\\Pictures\\Tes sampel pic\\sampl profil.jpg");
        extentTest.log(LogStatus.PASS, "Edit photo employee");
    }
    @Then("Click save photo")
    public void click_save_photo() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        extentTest.log(LogStatus.PASS, "Edit photo employee");
    }
    @Then("Click action delete")
    public void click_action_delete() {
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button/i")).click();
        driver.findElement(By.xpath("//div[@id='app']/div[3]/div/div/div/div[3]/button[2]")).click();
        extentTest.log(LogStatus.PASS, "Edit photo employee");
    }

//    @And("Click action edit")
//    public void click_action_edit() {
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[2]/i")).click();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/49");
//        Hooks.delay(2);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div/div/div[2]/div/div/div[2]/i")).click();
//        Hooks.delay(2);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div[2]/div/div[2]/div/div/div")).click();
//        extentTest.log(LogStatus.PASS, "Click action edit");
//    }

//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("PIM")).click();
//        Thread.sleep(2000);
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div/button")).click();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
//        Thread.sleep(2000);
//        driver.findElement(By.name("firstName")).click();
//        driver.findElement(By.name("firstName")).clear();
//        driver.findElement(By.name("firstName")).sendKeys("Alisa");
//        driver.findElement(By.name("middleName")).click();
//        driver.findElement(By.name("middleName")).clear();
//        driver.findElement(By.name("middleName")).sendKeys("Chanz");
//        driver.findElement(By.name("lastName")).click();
//        driver.findElement(By.name("lastName")).clear();
//        driver.findElement(By.name("lastName")).sendKeys("Rodriguez");
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div/div/div[2]/input")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div/div/div[2]/input")).clear();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div[2]/div/div[2]/div/div/div[2]/input")).sendKeys("0989");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(2000);
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/49");
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("PIM")).click();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).clear();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).sendKeys("alisa");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[2]/i")).click();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/49");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div/div/div[2]/div/div/div[2]/i")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div/div[2]/div/div[2]/div/div/div")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div/input")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div/ul/li[2]/div/i")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div/ul/li[2]/ul/li[25]")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[3]/div[2]/div/div/div[2]/div/div[2]/div/div[3]/div[9]/div")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/input")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/input")).clear();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/div/div/div/div[2]/input")).sendKeys("1128");
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
//        driver.findElement(By.linkText("PIM")).click();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).clear();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/div/div/input")).sendKeys("alisa");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button/i")).click();
//        driver.findElement(By.xpath("//div[@id='app']/div[3]/div/div/div/div[3]/button[2]")).click();
//    @When("TCC.DC.003 User go to Web Deskcoll")
//    public void tccdc003_User_go_to_web_deskcoll() {
//        driver.get(Constants.URL);
//        extentTest.log(LogStatus.PASS, "TCC.DC.003 User go to Web Deskcoll");
//    }
//
//    @And("TCC.DC.003 User click button advance")
//    public void tccdc003_user_click_button_advanced() {
//        loginPage.clickBtnAdvanced();
//        extentTest.log(LogStatus.PASS, "TCC.DC.003 User click button advance");
//    }
//
//    @And("TCC.DC.003 User click button unsafe")
//    public void tccdc003_user_click_button_unsafe() {
//        loginPage.clickBtnUnsafe();
//        extentTest.log(LogStatus.PASS, "TCC.DC.003 User click button unsafe");
//    }
//
//    @And("TCC.DC.003 User enter username dan password valid")
//    public void tccdc003_user_enter_username_password_valid() {
//        loginPage.loginOne("somad", "somad12345");
//        extentTest.log(LogStatus.PASS, "User enter username password valid");
//    }
//
//    @And("TCC.DC.003 User click button login valid")
//    public void tccdc003_user_click_button_login_valid() {
//        loginPage.clickBtnLogin();
//        extentTest.log(LogStatus.PASS, "TCC.DC.003 User click button login valid");
//    }
//
//    @Then("TCC.DC.003 User valid credentials")
//    public void tccdc003_user_valid_credentials() {
//        Assert.assertEquals(loginPage.getTxtWelcome(), "Welcome to Deskcoll");
//        extentTest.log(LogStatus.PASS, "TCC.DC.003 User valid credentials");
//        loginPage.clickOk();
//        DriverSingleton.closeObjectInstance();
    }


