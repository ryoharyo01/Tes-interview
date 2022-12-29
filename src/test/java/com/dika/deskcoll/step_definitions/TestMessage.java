package com.dika.deskcoll.step_definitions;

import com.dika.deskcoll.step_definitions.pages.MessagePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.testng.AssertJUnit.assertEquals;

public class TestMessage {
    private static WebDriver driver;
    private static ExtentTest extentTest;


    public TestMessage() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User go to Modul Message")
    public void User_go_to_modul_message() {
        MessagePage messagePage = new MessagePage();
        messagePage.clickBtnMessage();
        extentTest.log(LogStatus.PASS, "User go to Modul Message");
        Hooks.delay(7);
    }
   //
   @And("User Search Contact 1")
   public void User_Search_Contact1() {
       //driver.switchTo().frame(driver.findElement(By.id("composeText")));
       MessagePage messagePage = new MessagePage();
       messagePage.inputSearch();
       extentTest.log(LogStatus.PASS, "User Search Contact 1");
   }
   @And("User Klik Contact 1")
   public void User_Klik_Contact1() {
        MessagePage messagePage = new MessagePage();
        messagePage.klikCntc();
        extentTest.log(LogStatus.PASS, "User Send Message 1");
        Hooks.scroll(500);
}
    @And("User Input Message 1")
    public void User_Input_Message1() {
        MessagePage messagePage = new MessagePage();
        messagePage.inputMsg();
        extentTest.log(LogStatus.PASS, "User Input Message 1");
        Hooks.delay(2);
    }
    //-------------------------------------------------------------------------------
    @And("User Search Contact 2")
    public void User_Search_Contact2() {
        //driver.switchTo().frame(driver.findElement(By.id("composeText")));
        MessagePage messagePage = new MessagePage();
        messagePage.inputSearch2();
        extentTest.log(LogStatus.PASS, "User Search Contact 2");
    }
    @And("User Klik Contact 2")
    public void User_Klik_Contact2() {
        Hooks.delay(2);
        MessagePage messagePage = new MessagePage();
        messagePage.klikCntc2();
        extentTest.log(LogStatus.PASS, "User Send Message 2");
        Hooks.scroll(500);
    }
    @And("User Input Message 2")
    public void User_Input_Message2() {
        Hooks.delay(2);
        MessagePage messagePage = new MessagePage();
        messagePage.inputMsg2();
        extentTest.log(LogStatus.PASS, "User Input Message 2");
        Hooks.delay(2);
    }
    //--------------------------------------------------------------------------------
    @And("User Search Contact 3")
    public void User_Search_Contact3() {
        //driver.switchTo().frame(driver.findElement(By.id("composeText")));
        MessagePage messagePage = new MessagePage();
        messagePage.inputSearch3();
        extentTest.log(LogStatus.PASS, "User Search Contact 3");
    }
    @And("User Klik Contact 3")
    public void User_Klik_Contact3() {
        Hooks.delay(2);

        MessagePage messagePage = new MessagePage();
        messagePage.klikCntc3();
        extentTest.log(LogStatus.PASS, "User Send Message 3");
        Hooks.scroll(500);
    }
    @And("User Input Message 3")
    public void User_Input_Message3() {
        Hooks.delay(2);
        downHold();
        Hooks.delay(2);
        MessagePage messagePage = new MessagePage();
        messagePage.inputMsg3();
        extentTest.log(LogStatus.PASS, "User Input Message 3");
        Hooks.delay(2);

    }
    @Then("Succesfully Send Messege to Admin")
    public void Succesfully_Send_Messege_to_Admin() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[66]/div")).click();
        Hooks.delay(2);
        downHold();
        Hooks.delay(2);
        assertEquals(driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[70]/div/div/div")).getText(), "coba input");
        extentTest.log(LogStatus.PASS, "Succesfully Send Messege to Admin");
        Hooks.delay(2);
    }
    @Then("Succesfully Send Messege to Deskcoll")
    public void Succesfully_Send_Messege_to_Deskcoll() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[41]/div")).click();
        Hooks.delay(2);
        downHold();
        Hooks.delay(2);
        assertEquals(driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[28]/div/div/div")).getText(), "hallo");
        extentTest.log(LogStatus.PASS, "Succesfully Send Messege to Deskcoll");
        Hooks.delay(2);
    }
    @Then("Succesfully Send Messege to Supervisor")
    public void Succesfully_Send_Messege_to_Supervisor() {
        Hooks.delay(2);
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[7]/div")).click();
        Hooks.delay(2);
        downHold();
        Hooks.delay(2);
        assertEquals(driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[13]/div/div/div")).getText(), "tes pesan");
        extentTest.log(LogStatus.PASS, "Succesfully Send Messege to Supervisor");
        Hooks.delay(2);


    }

    public void downHold() {
        for (int i = 0; i < 30; i++) {
            try
            {
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_DOWN);
                r.keyRelease(KeyEvent.VK_DOWN);
            }
            catch (AWTException e)
            {
                e.printStackTrace();
            }
        }

    }
    public void upHold() {
        for (int i = 0; i < 30; i++) {
            try
            {
                Robot r = new Robot();
                r.keyPress(KeyEvent.VK_UP);
                r.keyRelease(KeyEvent.VK_UP);
            }
            catch (AWTException e)
            {
                e.printStackTrace();
            }
        }

    }








}
