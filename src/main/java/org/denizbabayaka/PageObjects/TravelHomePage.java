package org.denizbabayaka.PageObjects;

import org.denizbabayaka.PageComponents.FooterNav;
import org.denizbabayaka.PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {

    By sectionElement=By.id("traveller-home");
    By navigationHome= By.id("buttons");
    WebDriver driver;

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



}
