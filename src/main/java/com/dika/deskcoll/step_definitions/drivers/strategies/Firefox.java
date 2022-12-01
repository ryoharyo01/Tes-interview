package com.dika.deskcoll.step_definitions.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "G:\\Bootcamp SQA\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
