package pageFactoryClass;

import Utilities.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


//    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy (name="home-loans")
    WebElement homeLoans;

    public void launchHomePage(){
        WebDriverManager.getDriver().get("https://www.bendigobank.com.au/");
        WebDriverManager.getDriver().manage().window().maximize();
    }

    public void clickOnHomeLoans() {
        homeLoans.click();
    }
}