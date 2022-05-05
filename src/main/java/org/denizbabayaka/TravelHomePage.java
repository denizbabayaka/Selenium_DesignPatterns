package org.denizbabayaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {

    By sectionElement=By.id("traveller-home");
    WebDriver driver;

    public TravelHomePage(WebDriver driver) {

     this.driver=driver;
    }
    public void goTo()
    {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    }

    public NavigationBar getNavigationBar() {return new NavigationBar();}


    public FooterNav getFooterNav()
    {
        return new FooterNav(driver,sectionElement);

    }



}
