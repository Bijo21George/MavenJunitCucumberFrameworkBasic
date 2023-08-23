package Utilities;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManager {
    private static WebDriver driver;
/*
    public static RemoteWebDriver getDriver() {
        */
/*System.setProperty("webdriver.edge.driver","C:\\software\\edgedriverwin64\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        return driver;*//*

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "11");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("resolution", "1366x768");
        caps.setCapability("browserstack.video", "true");
        //caps.setCapability("browser_version", "114.0");
        //caps.setCapability("browserstack.local", "false");
        //caps.setCapability("browserstack.selenium_version", "3.14.0");
        RemoteWebDriver remoteWebDriver = null;
        try {
            remoteWebDriver = new RemoteWebDriver(new URL("http://bijogeorge_LRQl5i:xAsnGU8emgzbszpUbGBG@hub-cloud.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return remoteWebDriver;
    }
*/


    /*
        public static WebDriver getLocalEdgeDriver() {
            System.setProperty("webdriver.edge.driver", "C:\\software\\edgedriver_win64\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            return driver;
        }
    */
    public static WebDriver getDriver() {
        return driver;
    }

    public static void setLocalEdgeDriver(WebDriver driver1) {
        driver = driver1;
    }

}
