package io.github.mfaisalkhatri.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Faisal Khatri
 * @since 12/6/2022
 **/
public class SecurePage {

    private WebDriver driver;

    private By flashMessage = By.id ("flash");

    public SecurePage (final WebDriver driver) {
        this.driver = driver;
    }

    public String getFlashMessage () {
        return driver.findElement (flashMessage)
            .getText ();
    }

}
