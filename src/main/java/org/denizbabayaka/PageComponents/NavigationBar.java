package org.denizbabayaka.PageComponents;

import org.denizbabayaka.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 public class NavigationBar extends AbstractComponent {
    WebDriver driver;

     By flights = By.cssSelector("[title='Flights']");

     public NavigationBar(WebDriver driver,By sectionElement) {
         super(driver,sectionElement);

     }


     public void selectFlight()
    {
        //driver.findElement(flights).click();
        //findElement method is coming from abstract class and we pass flights argument
        System.out.println(findElement(flights).getAttribute("class"));
    }

}
