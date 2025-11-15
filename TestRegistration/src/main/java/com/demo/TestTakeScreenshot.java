package com.demo;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TestTakeScreenshot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testpages.eviltester.com/styled/page?app=framestest&t=About");

        takePicture(driver);

        System.out.println("Screenshot taken successfully");

        driver.quit();

    }

}

public static void takePicture(WebDriver driver)
{
    TakesScreenshot screenshot =  (TakesScreenshot) driver;

    File srcfile = screenshot.getScreenshotAs(OutputType.FILE);

    File destfile = new File("C:\\Users\\lenovo\\Desktop\\Testing Workshop\\TestRegistration\\src\\main\\resources.google.jpeg");

    FileHandler.copy(srcfile,destfile);
}
