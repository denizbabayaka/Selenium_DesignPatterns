package org.denizbabayaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNav extends AbstractComponent {
    WebDriver driver;

    By flights = By.cssSelector("[title='Flights']");

    public FooterNav(WebDriver driver, By sectionElement) {
        super(driver,sectionElement);

    }
    //method to handle flights
    //when selenium executes any method in this class- scope of selenium
    //should be in the footer only1


    public void selectFlight()
    {
        //driver.findElement(flights).click();
        System.out.println(findElement(flights).getAttribute("class"));
    }




}
