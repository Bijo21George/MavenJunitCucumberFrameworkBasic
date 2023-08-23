package testRunner;

import Utilities.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature", glue="stepDefinition")

public class Runnerfile {
public static WebDriver driver;
    @BeforeClass
    public static void setup(){
/*
        System.setProperty("webdriver.edge.driver", "C:\\software\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver();
*/
        System.setProperty("webdriver.edge.driver", "C:\\software\\edgedriver_win64\\msedgedriver.exe");
        /*ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");*/
        WebDriverManager.setLocalEdgeDriver(new EdgeDriver());

    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverManager.getDriver().quit();
    }
}
