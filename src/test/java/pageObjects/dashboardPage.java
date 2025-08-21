package pageObjects;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utillities.ActionCommands;
import utillities.ConfigDataProvider;

import java.time.Duration;

public class dashboardPage extends ActionCommands {

    WebDriver driver;


//    private By dashboardHeader=By.xpath("//*[@id=\"root\"]/div/header/h1");
    private By usernameIcon=By.xpath("//*[@id=\"root\"]/div[2]/div/header/div[2]/div[1]/div[1]/div[1]");
    private By logoutBtn=By.xpath("//*[@id=\"root\"]/div[2]/div/header/div[2]/div[2]/button");
    private By searchBox=By.xpath("//input[@placeholder='Search']");
    private By tab=By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span");
    private By upgradeBtn=By.xpath("/html/body/div[1]/div[1]/div[1]/header/div[1]/div[2]/a/button");
    private By minimizeArrow=By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/div/div/button");
    private By helpBtn=By.xpath("//button[@title='Help']");
    private By dashboardHeader=By.xpath("//*[@id=\"root\"]/div[2]/div/header/div[1]/div");

    public dashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logout(){
        waitTime(driver,usernameIcon);
        click(driver,usernameIcon);
        waitTime(driver,logoutBtn);
        click(driver,logoutBtn);
    }

    public void closeWindow(){
        driver.close();
    }

    public void enterSearchTxt(String text) {
        waitTime(driver,searchBox);
        type(driver,searchBox,text);
    }

    public void verifySeachedTab(String tabName) {
        waitTime(driver,tab);
        verifyText(driver,tab,tabName);
    }

    public void verifyUpgradeOption(){
        waitTime(driver,upgradeBtn);
        verifyText(driver,upgradeBtn,"Upgrade");
    }

    public void minimizeSidenav(){
        waitTime(driver,minimizeArrow);
        click(driver,minimizeArrow);
    }

    public void clickHelpBtn(){
        waitTime(driver,helpBtn);
        click(driver,helpBtn);
    }

    public void checkBugsDashboard(){
        waitTime(driver,dashboardHeader);
        Eyes eyes = new Eyes();
        eyes.setApiKey(ConfigDataProvider.getAPI_key());
        eyes.open(driver,"crud-app", "Dashboard Page");
        eyes.setMatchLevel(MatchLevel.EXACT);
        eyes.check(Target.window().fully().withName("Dashboard Page"));
        eyes.close();
    }

    public void verifydashboardheader(String text){
        waitTime(driver,dashboardHeader);
        verifyText(driver,dashboardHeader,text);
    }
}
