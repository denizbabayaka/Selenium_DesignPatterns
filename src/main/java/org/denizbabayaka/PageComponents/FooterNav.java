package org.denizbabayaka.PageComponents;

import org.denizbabayaka.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNav extends AbstractComponent {
    WebDriver driver;
     //with By we can store element to the flights variable
    By flights = By.cssSelector("[title='Flights']");
    By Links= By.cssSelector("a");

    //Those argument coming from Travel Home page
    public FooterNav(WebDriver driver, By sectionElement) {
        super(driver, sectionElement); //when you inherit parent class- you should invoke parent class constructor
        //in your own child constructor

    }
    //method to handle flights
    //when selenium executes any method in this class- scope of selenium
    //should be in the footer only1


    public String getFlightAttribute()
    {
        //driver.findElement(flights).click();
        //findElement method is coming from abstract class and we pass flights argument
        return findElement(flights).getAttribute("class");
    }

    public int getAnchorCount() {
        return findElements(Links).size();
    }





}
