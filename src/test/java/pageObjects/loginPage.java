package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class loginPage extends ActionCommands {


    WebDriver driver;
    private By Usernamebox=By.id("username");
    private By passwordbox=By.id("password");
    private By loginbutton=By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[2]/form/button");
    private By footerTxt=By.xpath("//p[contains(@class,'orangehrm-copyright')]");
    private By loginErrorMessage=By.xpath("//*[@id=\"root\"]/div[1]/ol/li/div/div[1]");

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String URL) {
        openurl(driver, URL);
    }

    public void enterUsername(String uname){
        waitTime(driver,Usernamebox);
        type(driver,Usernamebox,uname);
    }

    public void enterPassword(String pwd){
        waitTime(driver,passwordbox);
        type(driver,passwordbox,pwd);
    }

    public void clickLogin(){
        waitTime(driver,loginbutton);
        click(driver,loginbutton);
    }

    public void verifyTheErrorMessageAsInvalidCredentials() {
        waitTime(driver, loginErrorMessage);
        verifyText(driver, loginErrorMessage, "Login failed");
    }

    public void verifyFooterText(String text){
        waitTime(driver,footerTxt);
        verifyText(driver,footerTxt,text);
    }
}

