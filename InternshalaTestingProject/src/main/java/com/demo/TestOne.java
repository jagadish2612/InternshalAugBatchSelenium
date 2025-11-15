package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestOne {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");



        driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("Java");

        driver.findElement(By.name("btnK")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
