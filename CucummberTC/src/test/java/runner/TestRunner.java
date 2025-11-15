package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\lenovo\\Desktop\\Testing Workshop\\CucummberTC\\src\\test\\java\\features\\Login.feature",
        glue = {"stepdefiniton"},
        plugin = {"pretty","html:target/cucumber-reports.html"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
