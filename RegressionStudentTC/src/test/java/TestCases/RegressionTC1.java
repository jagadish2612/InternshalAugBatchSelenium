package TestCases;

import POM.GooglePage;
import Utils.ScreenShotUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

@Listeners(Listners.TestListners.class)
public class RegressionTC1 {

    public static WebDriver driver;
    GooglePage googlePage;


    @BeforeMethod
    public void start(){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.google.com/");

        googlePage = new GooglePage(driver);


    }

    @Test
    public void TC1() throws IOException {



        Assert.assertEquals(googlePage.getPageTitle(), "Google");


    }

    @Test
    public void TC2() throws IOException {
        Assert.assertEquals(googlePage.getPageTitle(), "Java");

    }

    @Test
    public void TC3()
    {
        Assert.assertEquals(googlePage.getaboutLinkText(), "Abouttt"); //TC3
    }

    @Test
    public void TC4()
    {

        Assert.assertTrue(googlePage.checkGoogleSearchButton(),"Search Button is not enabled"); //TC4
    }

//    @AfterMethod
//    public void stop(){
//
//        driver.quit();
//    }

    public static WebDriver getDriver() {
        return driver;
    }
}
