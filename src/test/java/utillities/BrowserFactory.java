package utillities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver startApplication(WebDriver driver,String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectLocation+"/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--incognito");
            options.addArguments("--headless"); // Uncomment this line to run Chrome in headless mode
            options.addArguments("--ignore-certificate-errors");
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.firefox.driver", projectLocation+"/drivers/geckodriver");
            driver = new FirefoxDriver();

        } else {
            System.out.println("Not support for " + browserName);
        }
        return driver;
    }


}
