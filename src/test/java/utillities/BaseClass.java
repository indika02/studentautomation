package utillities;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver = null;

    protected static ConfigDataProvider config;


    public static WebDriver setupBrowser() {
        if (driver == null) {
            config = new ConfigDataProvider();
            driver = BrowserFactory.startApplication(driver, config.getBrowser());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().window().maximize();
        }
        return driver;
    }

}
