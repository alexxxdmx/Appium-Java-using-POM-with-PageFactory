package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import static setups.DriverPool.getDriverInstance;

public class HomePageStep {

    HomePage homePage = new HomePage(getDriverInstance());

    @Given("^User launch the aut$")
    public void userLaunchTheAut() throws Throwable {

    }

    @Then("^User on homepage$")
    public void userOnHomepage() throws Throwable {
        homePage.tapCustomLocale();
        homePage.inputLang("ID");
        homePage.inputCountry("ID");
        homePage.tapSet();
        Thread.sleep(3000);
    }
}