package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TwoLocatorTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver elements = new ChromeDriver();

        elements.manage().window().maximize();

        elements.get("https://www.google.com/");

        elements.findElement(By.id("APjFqb")).sendKeys("Automation Java"); //Id Locator

//        elements.findElement(By.className("MV3Tnb")).click(); //classname Locator

//        elements.findElement(By.name("btnK")).click(); //name Locator

//        elements.findElement(By.linkText("Store")).click(); //linktext Locator

//        elements.findElement(By.partialLinkText("Sto")).click(); //Partiallinktext Locator

//        elements.findElement(By.tagName("a")).click();

//        List<WebElement> linktagsdata = elements.findElements(By.tagName("a")); // tagname locator
//
//        for (WebElement linktagsdataelement : linktagsdata) {
//
//            linktagsdataelement.click();
//            elements.navigate().back();
//        }

//        elements.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Java Automation"); //csslocator #

//        elements.findElement(By.cssSelector("a.gb_Z")).click(); //csslocator .

//        elements.findElement(By.cssSelector("input[value=\"I'm Feeling Lucky\"]")).click(); //csslocator complete syntax

//        elements.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("API testing");

        elements.findElement(By.xpath("//ul[@jsname=\"bw4e9b\"]/li[4]")).click();

        Thread.sleep(5000);

        elements.quit();


    }
}
