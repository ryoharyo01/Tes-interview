package com.dika.deskcoll.step_definitions.pages;

import com.dika.deskcoll.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManagementPage {
    private WebDriver driver;

    public ManagementPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    public void InputForm() {
        driver.findElement(By.id("dc_agent_editable-14-53175_text")).sendKeys("Saman Brembo");
        driver.findElement(By.id("dc_agent_editable-14-53176_text")).sendKeys("Saman Brembo");

        Select Privilege = new Select(driver.findElement(By.id("dc_agent_editable-14-53177_text")));
        Privilege.selectByVisibleText("Admin");

        Select Supervisor = new Select(driver.findElement(By.id("dc_agent_editable-14-53179_text")));
        Supervisor.selectByVisibleText("Super Admin");

        Select Skill = new Select(driver.findElement(By.id("dc_agent_editable-14-53181_text")));
        Skill.selectByVisibleText("skill 1");

        driver.findElement(By.id("dc_agent_editable-14-53182_text")).sendKeys("787978");

        Select Status = new Select(driver.findElement(By.id("dc_agent_editable-14-53184_text")));
        Status.selectByVisibleText("ACTIVE");

        driver.findElement(By.id("dc_agent_editable-14-53185_text")).sendKeys("1111");

        driver.findElement(By.id("dc_agent_editable-14-53192_text")).sendKeys("21");

        driver.findElement(By.id("dc_agent_editable-14-53186_text")).sendKeys("racingman");

        driver.findElement(By.id("dc_agent_editable-14-53187_text")).sendKeys("1111aaaa");
    }
        public void SubmitForm() {
        driver.findElement(By.xpath("//button[@id='53188_query']/span")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No'])[2]/following::span[1]")).click();
    }
}
