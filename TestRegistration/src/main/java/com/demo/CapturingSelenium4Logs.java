package com.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

public class CapturingSelenium4Logs {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com/register/Q2R4KL15");

        LogEntries logs = driver.manage().logs().get(LogType.DRIVER);

//        System.out.println("Logs:"+logs);

        for(LogEntry log : logs){
            System.out.println("The driver logs are:"+log.getMessage());

        }

        driver.quit();
    }
}
