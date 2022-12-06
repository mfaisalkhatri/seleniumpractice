package io.github.mfaisalkhatri.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Faisal Khatri
 * @since 12/2/2022
 **/
public class FormAuthenticationPage {


    private WebDriver driver;

    public FormAuthenticationPage (final WebDriver driver) {
        this.driver = driver;
    }

    public String pageHeader () {
        return driver.findElement (By.tagName ("h2")).getText ();
    }

    public String subHeader () {
        return driver.findElement (By.tagName ("h4")).getText ();
    }

    private WebElement form() {
        return driver.findElement (By.id ("content"));
    }


    private WebElement passwordField () {
        return form().findElement (By.id ("password"));
    }

    private WebElement userNameField () {
        return form().findElement (By.id ("username"));
    }

    private WebElement loginBtn () {
        return form().findElement (By.className ("radius"));
    }

    public SecurePage login(String username, String pswd) {
        userNameField ().clear ();
        userNameField ().sendKeys (username);
        passwordField ().clear ();
        passwordField ().sendKeys (pswd);
        loginBtn ().click ();

        return new SecurePage (driver);
    }



}
