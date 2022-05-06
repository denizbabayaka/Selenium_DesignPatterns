package org.denizbabayaka.PageComponents;

import org.denizbabayaka.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 public class NavigationBar extends AbstractComponent {
    WebDriver driver;
     //This element is common for header and Footer
     By flights = By.cssSelector("[title='Flights']");
     By Links= By.cssSelector("a");

     //Those arguments coming from Travelhome page
     public NavigationBar(WebDriver driver,By sectionElement) {
         //This super will initialize Abstract class constructoa and pass those arguments
         super(driver,sectionElement);

     }


     public void getFlightAttribute()
    {
        //driver.findElement(flights).click();
        //findElement method is coming from abstract class and we pass flights argument
        System.out.println(findElement(flights).getAttribute("class"));
    }

     public void getAnchorCount() {

         System.out.println("Navigation Link size :" +findElements(Links).size());
     }

}
