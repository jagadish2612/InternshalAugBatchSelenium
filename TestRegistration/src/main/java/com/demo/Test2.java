package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Test2 {

    static WebDriver drive;

    public static void main(String[] args) throws IOException {

        ConfigReader config = new ConfigReader();
        String browser = config.getProperty("browser");
        String url = config.getProperty("url");

        if(browser.equalsIgnoreCase("chrome")){
            drive= new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {

            drive = new FirefoxDriver();

        }
        else
        {
            System.out.println("Browser not supported");
        }


        drive.manage().window().maximize();

        drive.get(url);

    }
}
