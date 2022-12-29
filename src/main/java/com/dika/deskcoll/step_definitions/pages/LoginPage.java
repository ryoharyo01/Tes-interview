package com.dika.deskcoll.step_definitions.pages;

import com.dika.deskcoll.step_definitions.drivers.DriverSingleton;
import com.dika.deskcoll.step_definitions.utils.Constants;
import com.dika.deskcoll.step_definitions.utils.Utils;
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

    public void loginOne(String username, String password){
        this.txtUsername.sendKeys(username);
        this.txtPassword.sendKeys(password);
    }
//
//
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

//
    public String getTxtWelcome() {
        return txtWelcome.getText();
    }
//
//
    public void clickOk() {
        Utils.driverWaitTxt(driver, Constants.TIMEOUT, btnOk);
        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
        btnOk.click();
        Utils.delay(1, Constants.GLOB_PARAM_DELAY);
    }
}
