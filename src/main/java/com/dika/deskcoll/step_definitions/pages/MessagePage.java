package com.dika.deskcoll.step_definitions.pages;

import com.dika.deskcoll.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MessagePage {

    private WebDriver driver;

    public MessagePage() {

        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }



//    @FindBy(xpath = "//input[@id='composeText']")
//    WebElement searchMsg;

    //*[@id="composeText"]
    public void clickBtnMessage() {
        WebElement element = driver.findElement(By.xpath("//button[@id='54290_query']/span"));
        element.click();
    }
    public void inputSearch() {
        // searchMsg.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().frame("dc_message--54413");

        WebElement element = driver.findElement(By.xpath("//input[@id='composeText']"));
        element.sendKeys("admin");

    }

    public void klikCntc() {
        WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div[3]/div/div[2]/div/div"));
        element.click();
    }
    public void inputMsg() {
        WebElement element = driver.findElement(By.id("comment"));
        element.sendKeys("coba input");
        element.sendKeys(Keys.ENTER);

//-------------------------------------------------------------------------------------------//
    }
    public void inputSearch2() {
        WebElement element = driver.findElement(By.xpath("//input[@id='composeText']"));
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys("dikacoll05");
        element.sendKeys(Keys.ENTER);
    }
    public void klikCntc2() {
        WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div[3]/div/div[2]/div/div"));
        element.click();
    }
    public void inputMsg2() {
        WebElement element = driver.findElement(By.id("comment"));
        element.sendKeys("hallo");
        element.sendKeys(Keys.ENTER);
        //-------------------------------------------------------------------------------------------//
    }
    public void inputSearch3() {
        WebElement element = driver.findElement(By.xpath("//input[@id='composeText']"));
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        element.sendKeys("Jeffry");
    }
    public void klikCntc3() {
        WebElement element = driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div[3]/div/div[2]/div/div"));
        element.click();
    }
    public void inputMsg3() {
        WebElement element = driver.findElement(By.id("comment"));
        element.sendKeys("tes pesan");
        element.sendKeys(Keys.ENTER);



    }
    }


