package com.demo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.Set;

public class TestSeleniumBasics {

    static WebDriver drive;

    public static void main(String[] args) throws InterruptedException, IOException {

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
//
//        String pageTitle = drive.getTitle();
//
//        System.out.println(pageTitle);
//
//        String currentURL = drive.getCurrentUrl();
//
//        System.out.println(currentURL);
//
//        String pageSource = drive.getPageSource();
//
//        System.out.println(pageSource);
//
//
//        drive.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
//
//        JavascriptExecutor js = (JavascriptExecutor) drive;
//
//        js.executeScript("window.scrollBy(0,300)");
//
//        drive.findElement(By.xpath("//a[@id=\"gobasicajax\"]")).click();
//
//        drive.findElement(By.xpath("//a[@href=\"/styled/attributes-test.html\"]")).click();
//
//        Thread.sleep(5000);
//
//        Set<String> windowsNames = drive.getWindowHandles();
//
//        for(String windowName : windowsNames) {
//            System.out.println("The windows Id's are"+windowName);
//        }
//
//        drive.switchTo().window("FDDB7CE0611E04F52FD99C9F71B4AA1B");
//
//        Thread.sleep(5000);
//
//        System.out.println(drive.getTitle());
//
//
//
//        WebElement leftframe = drive.findElement(By.xpath("//frame[@name=\"left\"]"));
//
//        drive.switchTo().frame(leftframe);
//
//        Thread.sleep(5000);
//
//        String leftFrametext  = drive.findElement(By.xpath("//li[@id=\"left0\"]")).getText();
//
//        System.out.println(leftFrametext);
//
//        Actions a = new Actions(drive);
//
//        WebElement dragMe1 = drive.findElement(By.xpath("//div[@id=\"draggable2\"]/p[1]"));
//
//        WebElement dropMe1 = drive.findElement(By.xpath("//div[@id=\"droppable1\"]/p"));
//
//        a.dragAndDrop(dragMe1,dropMe1).build().perform();
//
//        Thread.sleep(3000);
//
//        a.moveToElement(drive.findElement(By.xpath("//a[text()='About']"))).click().build().perform();
//
//        Thread.sleep(3000);
//
//        for(int i = 0;i<5;i++) {
//            a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
//        }
//
//
//
//        a.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL).sendKeys("s").build().perform();
//
//        Thread.sleep(5000);
//
//        System.out.println("The Action drag and drop is successful");

        drive.quit();

    }
}
