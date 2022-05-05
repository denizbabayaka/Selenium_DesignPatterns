package org.denizbabayaka;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.denizbabayaka.TravelHomePage;
import org.testng.annotations.Test;
public class DemoTest {
    @Test
    public void flightTest() {
        //System.setProperty("webdriver.chrome.driver", "C://Users//deniz//OneDrive//Desktop//Selenium-Grid//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        travelHomePage.getFooterNav().selectFlight();






    }
}