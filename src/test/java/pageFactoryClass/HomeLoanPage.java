package pageFactoryClass;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLoanPage {


    public HomeLoanPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy (id="Button-237896")
    WebElement eligibilityButton;

    public void verifyHomeLoanPageIsDisplayed() {
        //assert(eligibilityButton.isDisplayed());
        Assert.assertTrue("home loan is displayed",eligibilityButton.isDisplayed());
    }
}
