package org.denizbabayaka.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public abstract class AbstractComponent {
    WebElement sectionElement;





    //Those arguments coming from drived classes FooterNav and NavigationBar
    public AbstractComponent(WebDriver driver,By sectionElement) {
        this.sectionElement = driver.findElement(sectionElement);


    }




    //This method will chain our locators so we can locate the specific element inside the part of the app
    public WebElement findElement(By findElementBy)

    {

        return sectionElement.findElement(findElementBy);

        //driver.findElement(By.id("traveller-home).findElement(findElementBy)

    }

    public List<WebElement> findElements(By findElementBy)
    {
        return sectionElement.findElements(findElementBy);
    }



}
