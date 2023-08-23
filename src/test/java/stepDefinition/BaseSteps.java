package stepDefinition;

import org.openqa.selenium.WebDriver;
import pageFactoryClass.HomeLoanPage;
import pageFactoryClass.HomePage;

public class BaseSteps {
public     HomePage homePage;
    public HomeLoanPage homeLoanPage;
    public void setupScreen(WebDriver driver)
    {
        homePage=new HomePage(driver);
        homeLoanPage =new HomeLoanPage(driver);
    }

}
