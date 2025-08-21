package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "Features/login.feature", // Correct feature file path
        glue = {"stepDefinitions"},
        plugin = {
                "json:target/cucumber.json",
//                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@test",
        monochrome = true
)
public class testRunner {
}
