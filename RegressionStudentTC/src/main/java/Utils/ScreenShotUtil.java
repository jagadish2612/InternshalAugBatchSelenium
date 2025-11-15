package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotUtil {

    public static String captureScreenShot(WebDriver driver, String filename) throws IOException {

        String timestamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        String filepath =  System.getProperty("user.dir")+"\\"+filename+" "+timestamp+".jpeg";

        TakesScreenshot s = (TakesScreenshot) driver;

        File srcFile = s.getScreenshotAs(OutputType.FILE);

        File destFile = new File(filepath);

        FileHandler.copy(srcFile,destFile);

        return filepath;




    }
}

