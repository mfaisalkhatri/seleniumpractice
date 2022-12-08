package io.github.mfaisalkhatri.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Faisal Khatri
 * @since 12/8/2022
 **/
public class CheckboxPage {

    private WebDriver driver;

    public CheckboxPage (final WebDriver driver) {
        this.driver = driver;
    }

    public WebElement checkboxOne () {
        return checkboxes ().get (0);
    }

    public WebElement checkboxTwo () {
        return checkboxes ().get (1);
    }

    public String pageHeader () {
        return driver.findElement (By.tagName ("h3"))
            .getText ();
    }

    private List<WebElement> checkboxes () {
        return driver.findElements (By.cssSelector ("#checkboxes > input[type=checkbox]"));
    }



}
