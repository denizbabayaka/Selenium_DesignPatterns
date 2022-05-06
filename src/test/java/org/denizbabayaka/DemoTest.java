package org.denizbabayaka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.denizbabayaka.PageObjects.TravelHomePage;
import org.testng.annotations.Test;
public class DemoTest {
    @Test
    public void flightTest() {
        System.setProperty("webdriver.chrome.driver", "C://Users//deniz//OneDrive//Desktop//Selenium-Grid//chromedriver.exe");
        //ChromeOptions chromeOptions = new ChromeOptions();
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //This will go and initialize TeavelHomePage and pass driver as an argument
        TravelHomePage travelHomePage = new TravelHomePage(driver);

        travelHomePage.goTo();
        travelHomePage.getFooterNav().getFlightAttribute();
        travelHomePage.getNavigationBar().getFlightAttribute();
        travelHomePage.getNavigationBar().getAnchorCount();
        travelHomePage.getFooterNav().getAnchorCount();
        driver.close();

        //driver.findElement(By.id("traveller-home).findElement(By.cssSelector("[title='Flights']")










    }
}