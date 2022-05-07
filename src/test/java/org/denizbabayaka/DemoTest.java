package org.denizbabayaka;

import org.denizbabayaka.PageComponents.MultiTrip;
import org.denizbabayaka.PageComponents.RoundTrip;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.denizbabayaka.PageObjects.TravelHomePage;
import org.testng.annotations.Test;
public class DemoTest {
    //SRP(Single responsibility principle Design Pattern)
    @Test
    public void flightTest() {
        System.setProperty("webdriver.chrome.driver", "C://Users//deniz//OneDrive//Desktop//Selenium-Grid//chromedriver.exe");
        //ChromeOptions chromeOptions = new ChromeOptions();
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //This will go and initialize TeavelHomePage and pass driver as an argument
        TravelHomePage travelHomePage = new TravelHomePage(driver);

        travelHomePage.goTo();
        System.out.println(travelHomePage.getFooterNav().getFlightAttribute());
        System.out.println(travelHomePage.getNavigationBar().getFlightAttribute());
        System.out.println(travelHomePage.getNavigationBar().getAnchorCount());
        System.out.println(travelHomePage.getFooterNav().getAnchorCount());

        //one way, round trip, multi trip checkAvailibity(origin, destination)

        //travelHomePage.setBookingStrategy(new MultiTrip());
        // we call setBookingStrategy method and pass the object of RoundTrip class object
        //go and look setBookingStrategy method  how this object works

        //travelHomePage.setBookingStrategy(new RoundTrip());
        travelHomePage.setBookingStrategy(new MultiTrip());
        travelHomePage.checkAvail( "origin","destination");


        travelHomePage.checkAvail("origin", "destination");
         driver.close();

        //driver.findElement(By.id("traveller-home).findElement(By.cssSelector("[title='Flights']")










    }
}