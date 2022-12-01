package io.github.mfaisalkhatri;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/1/2022
 **/
public class SampleSeleniumTests {

    @Test
    public void testChromeBrowser () {

        //System.setProperty ("webdriver.chrome.driver", System.getProperty ("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        driver.navigate ()
            .to ("https://the-internet.herokuapp.com/");
        String title = driver.getTitle ();
        assertEquals (title, "The Internet");

        driver.quit ();

    }

    @Test
    public void testFirefoxBrowser () {

        WebDriver driver = new FirefoxDriver ();
        driver.navigate ()
            .to ("https://the-internet.herokuapp.com/");
        String title = driver.getTitle ();
        assertEquals (title, "The Internet");

        driver.quit ();

    }

    @Test
    public void testEdgeBrowser () {

        WebDriver driver = new EdgeDriver ();
        driver.navigate ()
            .to ("https://the-internet.herokuapp.com/");
        String title = driver.getTitle ();
        assertEquals (title, "The Internet");

        driver.quit ();

    }

}
