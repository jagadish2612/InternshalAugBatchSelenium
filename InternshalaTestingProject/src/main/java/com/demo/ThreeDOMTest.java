package com.demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeDOMTest {

    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.browserstack.com/?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=770554924013&utm_campaign=Search-Brand-IN-APAC-Des-Navigational-Beinc&utm_campaigncode=Core+9062134&utm_term=e+browserstack&gad_source=1&gad_campaignid=22920331187&gbraid=0AAAAADD4yG3q0ZDzXx94UsbzU-NhNUytJ&gclid=CjwKCAjwx-zHBhBhEiwA7Kjq68k0aqUlxhQDPtEjGtS2M8RzLrviMhYDRv_zex5tNDPrzArg5l7orBoC4B0QAvD_BwE");

        JavascriptExecutor js = (JavascriptExecutor) driver;



//        js.executeScript("document.getElementById('APjFqb').value='Java Automation'");
//
//        js.executeScript("document.getElementsByName('btnK')[0].click()");
        Thread.sleep(5000);

        js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(5000);

        driver.quit();

    }
}
