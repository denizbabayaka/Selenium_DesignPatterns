package org.denizbabayaka.PageObjects;

import org.denizbabayaka.AbstractComponents.SearchFlightAvail;
import org.denizbabayaka.PageComponents.FooterNav;
import org.denizbabayaka.PageComponents.MultiTrip;
import org.denizbabayaka.PageComponents.NavigationBar;
import org.denizbabayaka.PageComponents.RoundTrip;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TravelHomePage {

    //We define all  main locators in this class
    By sectionElement=By.id("traveller-home");
    By navigationHome= By.id("buttons");
    WebDriver driver;
    SearchFlightAvail searchFlightAvail;
    int classs_count=2;
    Object run_object=null;


    public TravelHomePage(WebDriver driver) {

     this.driver=driver;
    }
    public void goTo()
    {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    }

    public NavigationBar getNavigationBar()


        {
            return new NavigationBar(driver,navigationHome);
        }



    public FooterNav getFooterNav()
            //This will go and initialize FooterNav and pass return arguments to Footernav constructor
    {
        return new FooterNav(driver,sectionElement);

    }
    //MultiTrip object coming here from DemoTest class  and searchFlightAvail var has the ability of executing
    //Multitrip methods, it is like WebDriver driver =new ChromeDriver() happening here
    public void setBookingStrategy(SearchFlightAvail searchFlightAvail)

    {
        this.searchFlightAvail=searchFlightAvail;


    }

    public void checkAvail(String origin,String destination)


    {
        // now it will execute the method of RoundTrip class checkAvail method
        //RoundTrip.checkAvail(origin,destination);
        // searchFlight avail var has the all feature of RoundTrip class
        //like driver.click(); happening here
        searchFlightAvail.checkAvail(origin, destination);
    }













    }