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
    private WebElement passwordField () {
        return driver.findElement (By.id ("password"));
    }

    private WebElement userNameField () {
        return driver.findElement (By.id ("username"));
    }

    private WebElement loginBtn () {
        return driver.findElement (By.className ("radius"));
    }

    public void login(String username, String pswd) {
        userNameField ().clear ();
        userNameField ().sendKeys (username);
        passwordField ().clear ();
        passwordField ().sendKeys (pswd);
        loginBtn ().click ();
    }


}
