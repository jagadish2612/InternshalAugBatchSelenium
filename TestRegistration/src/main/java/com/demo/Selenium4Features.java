package com.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Selenium4Features {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(1024, 768));

        driver.get("https://www.facebook.com/");

        System.out.println("Opening Chrome Browser");

        WebElement username = driver.findElement(By.id("email"));

        WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));

        username.sendKeys("person@gmail.com");
        password.sendKeys("password");

        driver.switchTo().newWindow(WindowType.TAB);

        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.facebook.com/");


    }
}
