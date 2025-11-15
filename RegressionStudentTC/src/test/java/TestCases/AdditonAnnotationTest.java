package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdditonAnnotationTest {

    static WebDriver driver;


    @Parameters({"browser","url"})
    @Test
    public void launchApplication(String browser, String url)
    {

        if(browser.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get(url);
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
