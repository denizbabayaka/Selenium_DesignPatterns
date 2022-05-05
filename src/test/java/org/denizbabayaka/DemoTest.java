package org.denizbabayaka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.denizbabayaka.TravelHomePage;
import org.testng.annotations.Test;
public class DemoTest {
    @Test
    public void flightTest() {
        System.setProperty("webdriver.chrome.driver", "C://Users//deniz//OneDrive//Desktop//Selenium-Grid//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        travelHomePage.getFooterNav().selectFlight();




    }
}