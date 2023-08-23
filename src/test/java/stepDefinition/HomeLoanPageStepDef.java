package stepDefinition;

import Utilities.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import pageFactoryClass.HomeLoanPage;


public class HomeLoanPageStepDef extends BaseSteps{

    @Before
    public void setupHomeLoanPageSteps()
    {
        setupScreen(WebDriverManager.getDriver());
    }

    @Then("home loan page is displayed")

    public void homeLoanPageIsDisplayed() {
        homeLoanPage.verifyHomeLoanPageIsDisplayed();
    }

}
