package com.dika.deskcoll.step_definitions.pages;

import com.dika.deskcoll.step_definitions.drivers.DriverSingleton;
import com.dika.deskcoll.step_definitions.utils.Constants;
import com.dika.deskcoll.step_definitions.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "details-button")
    WebElement btnAdvance;

    @FindBy(id = "proceed-link")
    WebElement btnUnsave;

    @FindBy(id = "dc_login-1-53201_text")
    WebElement txtUsername;

    @FindBy(id = "dc_login-1-53202_text")
    WebElement txtPassword;
    //
    @FindBy(xpath = "//*[@id=\"53203_query\"]/span")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
    WebElement txtWelcome;

    @FindBy(xpath="/html/body/div[8]/div[3]/div/button/span")
    private WebElement btnOk;

//
//    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
//    WebElement txtInvalidCredentials;
//
//    @FindBy(xpath = "/html/body/div[10]/div[3]/div/button/span")
//    WebElement btnOkeInvalid;
//

//
//    @FindBy(xpath="//button[@id='52706_query']/span")
//    private WebElement btnAkunAdmin;
//
//    @FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='TIDAK'])[1]/following::span[1]")
//    private WebElement btnYesLogout;
//
//    @FindBy(xpath="//button[@id='52706_query']/span")
//    private WebElement btnDeveloper;
//
//    @FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::span[2]")
//    private WebElement btnNoLogout;
//
//    @FindBy(xpath="//font[normalize-space()='PSIKOTEST']")
//    private WebElement txtPsikotes;
//
//    @FindBy(xpath="//*[@id=\"ui-id-1\"]")
//    private WebElement txtSignIn;


    //login
//    public void LoginOne() {
//            driver.findElement(By.id("details-button")).click();
//            driver.findElement(By.id("proceed-link")).click();
//        driver.findElement(By.id("dc_login-1-53201_text")).click();
//        driver.findElement(By.id("dc_login-1-53201_text")).clear();
//        driver.findElement(By.id("dc_login-1-53201_text")).sendKeys("somad");
//        driver.findElement(By.id("dc_login-1-53202_text")).click();
//        driver.findElement(By.id("dc_login-1-53202_text")).clear();
//        driver.findElement(By.id("dc_login-1-53202_text")).sendKeys("somad12345");
//        driver.findElement(By.xpath("//button[@id='53203_query']/span")).click();
//    }
    public void loginOne(String username, String password){
        this.txtUsername.sendKeys(username);
        this.txtPassword.sendKeys(password);
    }
//
//    public void loginValidTwo(String username, String password) {
//        Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtUsername);
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        this.txtUsername.sendKeys(username);
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        this.txtPassword.sendKeys(password);
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        btnLogin.click();
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        btnOk.click();
//    }
//
//    public void loginValidThree(String username, String password) {
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        this.txtUsername.sendKeys(username);
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        this.txtPassword.sendKeys(password);
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        btnLogin.click();
//
//    }
//
//    public void logout() {
//        btnAkunAdmin.click();
//        btnYesLogout.click();
//    }
//    public void clickEnterKeyboard() {
//        this.txtPassword.sendKeys(Keys.ENTER);
//    }
//
    public void clickBtnLogin() {
        btnLogin.click();
    }

    public void clickBtnAdvanced() {
        btnAdvance.click();
    }

    public void clickBtnUnsafe() {
        btnUnsave.click();
    }

//    public void clickBtnDeveloper() {
//        btnDeveloper.click();
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//    }
//
//    public void clickBtnNoLogout() {
//        btnNoLogout.click();
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//    }
//
//    public void clickBtnYesLogout() {
//        btnYesLogout.click();
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//    }
//
    public String getTxtWelcome() {
        return txtWelcome.getText();
    }
//
//    public String getTxtInvalidCredentials(){
//        return txtInvalidCredentials.getText();
//    }
//
//    public String getTxtPsikotes() {
//        Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtPsikotes);
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        return txtPsikotes.getText();
//    }
//
//    public String getTxtSignIn() {
//        Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtSignIn);
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        return txtSignIn.getText();
//    }
//
//    public String getTxtGagalLogin() {
//        Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtInvalidCredentials);
//        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//        return txtInvalidCredentials.getText();
//    }
//
    public void clickOk() {
        Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnOk);
        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
        btnOk.click();
        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
    }
}
