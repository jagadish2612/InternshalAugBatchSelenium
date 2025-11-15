package TestCases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ExtentReportsTest {

    static WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void setupReport()
    {
        ExtentSparkReporter report =
                new ExtentSparkReporter("C:\\Users\\lenovo\\Desktop\\Testing Workshop\\RegressionStudentTC\\src\\test\\Reports\\ExtentReport.html");
        report.config().setDocumentTitle("Automation Execution Report");
        report.config().setReportName("Regression TC Report");
        extent = new ExtentReports();
        extent.attachReporter(report);
        extent.setSystemInfo("TesterName", "PersonA");
    }

    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");
    }

    @Test (priority = 1)
    public void TC1()
    {
        test = extent.createTest("Verify Google Title");
        String title = driver.getTitle();
        test.info("Google Title is: " + title);
        if(title.equals("Google"))
        {
           test.pass("Google Title Is Correct");
        }
        else
        {
            test.fail("Google Title Is Not Correct");
        }
    }

    @Test (priority = 0)
    public void TC2()
    {
        test = extent.createTest("Verify Google Currenturl");
        String title = driver.getCurrentUrl();
        test.info("Google Currenturl is: " + title);
        Assert.assertEquals(title, "https://www.google.com/");
        test.pass("Google Currenturl Is Correct");
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }

    @AfterSuite
    public void endReport()
    {
        extent.flush();
    }
}
