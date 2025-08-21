package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.loginPage;
import utillities.BaseClass;
import utillities.ConfigDataProvider;

public class loginPageSteps {

    pageObjects.loginPage loginPage=new loginPage(BaseClass.setupBrowser());
    ConfigDataProvider configDataProvider = new ConfigDataProvider();


    @Given("^Load UI$")
    public void loadUI(){
        loginPage.openPage(configDataProvider.getURL());
    }

    @Then("^Enter the Username (.*)$")
    public void enterUsername(String uname) {
        loginPage.enterUsername(uname);
    }

    @Then("^Enter the password as (.*)$")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @Then("Click the login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @Then("^Verify the Footer text is (.*)$")
    public void verifyFooterText(String text) {
        loginPage.verifyFooterText(text);
    }


}
