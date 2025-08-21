package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.dashboardPage;
import utillities.BaseClass;

public class dashboardPageSteps {

    dashboardPage dashboardPage=new dashboardPage(BaseClass.setupBrowser());


    @Then("Logout from the system")
    public void logout() {
        dashboardPage.logout();
    }

    @And("Close the window")
    public void closeWindow() {
        dashboardPage.closeWindow();
    }
    @Then("^Enter the search Text as (.*)$")
    public void enterSearchText(String text){
        dashboardPage.enterSearchTxt(text);
    }

    @Then("^Verify the ([^ ]+) tab is available$")
    public void verifyTabIsAvailable(String tabname){
        dashboardPage.verifySeachedTab(tabname);
    }

    @Then("Verify the upgrade option in navbar")
    public void verifyUpgradeOptionInNavbar(){
        dashboardPage.verifyUpgradeOption();
    }

    @Then("Click the Minimize arrow in side navigation bar")
    public void minimizeSidenav(){
        dashboardPage.minimizeSidenav();
    }

    @Then("Click the help button in dashboard")
    public void clickHelpBtn(){
        dashboardPage.clickHelpBtn();
    }

    @Then("Check the visual bugs in Dashboard")
    public void checkVisualBugsDashboard(){
        dashboardPage.checkBugsDashboard();
    }

    @Then("^Verify the dashboard header as (.*)$")
    public void verifyDashboardHeader(String text){
        dashboardPage.verifydashboardheader(text);
    }
}
