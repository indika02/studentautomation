package testRunner;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/Features/login.feature", // Path to feature files
        glue = "stepDefinitions", // Package containing step definitions
        plugin = {
                "pretty", // Console output
                "json:target/cucumber.json", // JSON report
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // Allure report
        },
        monochrome = true, // Makes console output more readable
        tags = "@test" // Filters scenarios with the @test tag
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
