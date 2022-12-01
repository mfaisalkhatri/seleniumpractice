package io.github.mfaisalkhatri;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Faisal Khatri
 * @since 12/1/2022
 **/
public class DriverManager {

    private WebDriver driver;

    public void startBrowser (String browser) {

        if (browser.equalsIgnoreCase ("chrome")) {
            createChromeDriver ();
        } else if (browser.equalsIgnoreCase ("firefox")) {
            createFirefoxDriver ();
        } else if (browser.equalsIgnoreCase ("edge")) {
            createEdgeDriver ();
        } else {
            System.out.println ("Browser name should be either Chrome, Firefox or Edge");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
    private  void createEdgeDriver () {
        driver = new EdgeDriver ();
    }

    private void createFirefoxDriver () {
        driver = new FirefoxDriver ();
    }

    private void createChromeDriver () {
        driver = new ChromeDriver ();
    }

    public void stopDriver () {
        driver.quit ();
    }
}
