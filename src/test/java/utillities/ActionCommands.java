package utillities;


import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActionCommands {

    WebDriver driver;

    protected void openurl(WebDriver driver, String URL) {
        driver.get(URL);
    }

    protected void click(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    protected void type(WebDriver driver, By locator, String input) {
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(input);
        } catch (NoSuchElementException e) {
            System.out.println("No such a element " + e.getMessage());
            throw e;
        }
    }

    protected String verifyText(WebDriver driver, By locator, String expectedResults) {
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(element.getText(), expectedResults);
        return expectedResults;
    }

    protected void waitTime(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void openEyesSession(WebDriver driver,Eyes eyes,String appName,String pageName){
        eyes.setApiKey(ConfigDataProvider.getAPI_key());
        eyes.open(driver, appName, pageName,new RectangleSize(1200, 800));
        eyes.check(Target.window());
    }

}