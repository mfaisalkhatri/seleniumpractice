package io.github.mfaisalkhatri;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * @author Faisal Khatri
 * @since 12/1/2022
 **/
public class BaseTest {

    DriverManager driverManager;

    public BaseTest () {

        System.out.println ("Class created!");
        driverManager = new DriverManager ();
    }

    @Parameters ("browser")
    @BeforeClass
    public void setupTest (String browser) {
        driverManager.startBrowser (browser);
        driverManager.getDriver ()
            .get ("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown () {
        driverManager.stopDriver ();
    }

}
