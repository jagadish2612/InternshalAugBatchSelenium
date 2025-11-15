package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

public class Test2SeleniumBasics {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Implicit Wait

        driver.get("https://testpages.eviltester.com/styled/frames/frames-test.html");

//        String parentTab = driver.getWindowHandle();
//
////        System.out.println("Parent tab: " + parentTab);
//
//        driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
//
////        String childTab = driver.getWindowHandle();
//
////        System.out.println("Child tab: " + childTab);
//
////        Thread.sleep(3000);
////
////        String childTab = driver.getWindowHandle();
////        driver.switchTo().window(parentTab);
//
//
//
//        Set<String> getWindowsID =  driver.getWindowHandles();
//
//        for (String windowID : getWindowsID) {
//
//            System.out.println(windowID);
//            if(windowID.equals(parentTab))
//            {
//                driver.switchTo().window(windowID);
//                break;
//            }
//        }
//
//        driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();

//        List<WebElement> middleText =  driver.findElements(By.xpath("//frame[@name=\"middle\"]"));
//
//        for (WebElement text:middleText)
//        {
//            System.out.println(text.getText());
//        }



        driver.switchTo().frame(0);

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(5)); //WebDriverWait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"../page?app=framestest&t=About\"]"))).click(); //Explicit Wait


        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMinutes(1))
                        .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

        WebElement element = wait1.until(new Function<WebDriver, WebElement>() { //Fluent Wait
            @Override
            public WebElement apply(WebDriver driver) {
                WebElement click =  driver.findElement(By.xpath("sdsd"));
                if(click.isDisplayed())
                {
                    click.click();
                    return click;
                }
                else {
                    System.out.println("Waiting....");
                    return null;
                }
            }
        });


        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name=\"middle\"]")));



        String text = driver.findElement(By.xpath("//h1[text()='Middle']")).getText();

        System.out.println(text);

        driver.switchTo().parentFrame();





       driver.quit();
    }
}
