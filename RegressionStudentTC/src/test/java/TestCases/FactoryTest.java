package TestCases;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryTest {

    String browser;

    public FactoryTest(String browser) {
        this.browser = browser;
    }

    @Test
    public void launchBrowser() {
        System.out.println("Launching browser: " + browser);

    }

    @Factory
    public static Object[] factoryData()
    {
        return new Object[]{
                new FactoryTest("chrome"),
                new FactoryTest("firefox"),
                new FactoryTest("edge")
        };
    }
}
