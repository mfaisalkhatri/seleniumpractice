package io.github.mfaisalkhatri.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Faisal Khatri
 * @since 12/9/2022
 **/
public class JSAlertPage {

    private WebDriver     driver;
    private WebDriverWait wait;
    private Alert         alert;

    public JSAlertPage (WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait (driver, Duration.ofSeconds (10));
    }

    public WebElement jsAlertButton () {
        return driver.findElement (By.cssSelector ("ul > li:nth-child(1) > button"));
    }

    public WebElement jsConfirmButton () {
        return driver.findElement (By.cssSelector ("ul > li:nth-child(2) > button"));
    }

    public WebElement jspromptButton () {
        return driver.findElement (By.cssSelector ("ul > li:nth-child(3) > button"));
    }

    public void checkForAlert () {
        wait.until (ExpectedConditions.alertIsPresent ());
        alert = driver.switchTo ()
            .alert ();
    }

    public void acceptAlert () {
        alert.accept ();
    }

    public void dismissAlert () {
        alert.dismiss ();
    }

    public String getAlertText () {
        return alert.getText ();
    }

    public String getJSAlertText () {
        jsAlertButton ().click ();
        checkForAlert ();
        return getAlertText ();

    }

    public String getConfirmAlertText () {
        jsConfirmButton ().click ();
        checkForAlert ();
        return getAlertText ();
    }

    public String getTextAfterAcceptingAlert () {
        acceptAlert ();
        return resultText ();
    }

    public String dismissAlertText () {
        jsConfirmButton ().click ();
        checkForAlert ();
        return getAlertText ();
    }

    public String getTextAfterDismissingAlert () {
        dismissAlert ();
        return resultText ();
    }

    public String getJSPromptText () {
        jspromptButton ().click ();
        checkForAlert ();
        return getAlertText ();
    }

    public void typeTextInAlert (String text) {
        alert.sendKeys (text);
    }

    public String resultText () {
        return driver.findElement (By.id ("result"))
            .getText ();
    }
}
