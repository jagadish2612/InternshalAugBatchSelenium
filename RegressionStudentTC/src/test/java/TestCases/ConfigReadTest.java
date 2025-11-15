package TestCases;

import Utils.ConfigReaderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class ConfigReadTest {

    static WebDriver driver;

    @BeforeMethod
    public void openBrowser() throws IOException {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get(ConfigReaderUtil.getPropertyValue("C:\\Users\\lenovo\\Desktop\\Testing Workshop\\RegressionStudentTC\\src\\main\\resources\\config.properties","url"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void TC1() throws IOException {
        driver.findElement(By.id("email")).sendKeys(ConfigReaderUtil.getPropertyValue("C:\\Users\\lenovo\\Desktop\\Testing Workshop\\RegressionStudentTC\\src\\main\\resources\\config.properties","email"));
        driver.findElement(By.id("pass")).sendKeys(ConfigReaderUtil.getPropertyValue("C:\\Users\\lenovo\\Desktop\\Testing Workshop\\RegressionStudentTC\\src\\main\\resources\\config.properties","password"));
        driver.findElement(By.id("loginbutton")).click();

        String invaliderror = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();

        Assert.assertEquals(invaliderror,"Enter Correct mail and password");
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }
}
