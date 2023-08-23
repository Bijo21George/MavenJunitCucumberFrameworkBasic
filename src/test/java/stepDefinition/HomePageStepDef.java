package stepDefinition;

import Utilities.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactoryClass.HomePage;


public class HomePageStepDef extends BaseSteps {


    @Before
    public void setupHomePageSteps() {
        setupScreen(WebDriverManager.getDriver());
    }

    @Given("user launches home page")
    public void userLaunchesHomePage() {

        homePage.launchHomePage();

    }

    @When("user clicks on home loans")
    public void userClicksOnHomeLoans() {
        homePage.clickOnHomeLoans();
    }


}
