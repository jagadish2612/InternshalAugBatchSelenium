package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationTest {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        String browser = "chrome";

        switch (browser) {

            case "chrome":

                System.out.println("Opening Chrome Driver");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.out.println("Opening firefox Driver");
                driver = new FirefoxDriver();
                break;

            case "edge":
                System.out.println("Opening edge Driver");
                driver = new EdgeDriver();
                break;

            default:
                System.out.println("Unable to open browser");
        }

//        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/r.php?entry_point=login");

        WebElement firstName = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));

        WebElement surName = driver.findElement(By.cssSelector("input[name=\"lastname\"]"));

        WebElement dayDropdown = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));

        WebElement monthDropdown = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));

        WebElement yearDropdown = driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));

        WebElement radioButton = driver.findElement(By.xpath("//label[text()='Male']"));

        WebElement mobileNumber = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));

        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));

        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Sign Up']"));

        firstName.sendKeys("PersonA");

        surName.sendKeys("Testing");

        Select s = new Select(dayDropdown);
        s.selectByValue("12");

        Select s1 = new Select(monthDropdown);
        s1.selectByIndex(3);

        Select s2 = new Select(yearDropdown);
        s2.selectByVisibleText("1970");

        radioButton.click();

        mobileNumber.sendKeys("81245678ASDSD");

        password.sendKeys("231243253asdasdf");

        submitButton.click();

        if (mobileNumber.equals("86547895158")) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile number is not valid");
        }

        Thread.sleep(5000);

        driver.quit();

    }

}