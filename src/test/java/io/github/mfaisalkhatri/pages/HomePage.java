package io.github.mfaisalkhatri.pages;

import java.sql.Driver;

import io.github.mfaisalkhatri.DriverManager;
import org.openqa.selenium.WebDriver;

/**
 * @author Faisal Khatri
 * @since 12/1/2022
 **/
public class HomePage {

private WebDriver driver;

    public HomePage (final WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle () {
        return driver.getTitle ();
    }
}
