package com.dika.deskcoll.step_definitions.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class Utils {
    private static Robot robot;
    private static JavascriptExecutor js;
    public static int testCount = 0;
    public static int countOutline = 1;


    public static String driverWaitTxt(WebDriver driver, int delays, WebElement element) {
        return new WebDriverWait(driver,(delays))
                .until(ExpectedConditions.visibilityOf(element)).getText();
    }
    public static void delay(int detik, String delays) {
        if(delays.equals("y"))
        {
            try {
                Thread.sleep(1000*detik);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}