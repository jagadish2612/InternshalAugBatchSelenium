package Listners;

import TestCases.RegressionTC1;
import Utils.ScreenShotUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListners implements ITestListener {

    static WebDriver driver;

    public void onTestStart(ITestResult result) {
        // not implemented
    }

    /**
     * Invoked each time a test succeeds.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SUCCESS
     */
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed"+result.getName());
    }

    /**
     * Invoked each time a test fails.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#FAILURE
     */
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getName());

        WebDriver driver = RegressionTC1.getDriver(); // ✅ Access driver here

        if (driver != null) {
            try {
                ScreenShotUtil.captureScreenShot(driver,result.getName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Driver is null — cannot capture screenshot!");
        }
    }

    /**
     * Invoked each time a test is skipped.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SKIP
     */
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());

        WebDriver driver = RegressionTC1.getDriver(); // ✅ Access driver here

        if (driver != null) {
            try {
                ScreenShotUtil.captureScreenShot(driver,result.getName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Driver is null — cannot capture screenshot!");
        }
    }

}
