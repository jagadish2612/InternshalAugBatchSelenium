package TestCases;

import Utils.ExcelDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class ExcelDataTest {

    static WebDriver driver;

    @DataProvider (name = "Exceldata")
    public Object[][] getExcelData() throws IOException {
        return ExcelDataUtil.readExcelData
                ("C:\\Users\\lenovo\\Desktop\\Testing Workshop\\RegressionStudentTC\\src\\main\\resources\\Data Driven Testing Excel Sheet.xlsx","Sheet1");

    }

    @BeforeMethod
    public void openBrowser()
    {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test(dataProvider = "Exceldata")
    public void TC1(String email,String password)
    {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("loginbutton")).click();

        String invaliderror = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();

        Assert.assertEquals(invaliderror,"Enter Correct mail and password");
    }

    @Test (dataProvider = "Exceldata")
    public void TC2(String email,String password)
    {

    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }
}
