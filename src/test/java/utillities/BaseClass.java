package utillities;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver = null;

    protected static ConfigDataProvider config;


    public static WebDriver setupBrowser() {
        if (driver == null) {
            config = new ConfigDataProvider();
            driver = BrowserFactory.startApplication(driver, config.getBrowser());
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(1000000, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

}
