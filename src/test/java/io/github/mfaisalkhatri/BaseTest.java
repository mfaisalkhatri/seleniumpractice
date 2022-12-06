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

    @Parameters ("browser")
    @BeforeClass
    public void setupTest (String browser) {
        driverManager = new DriverManager ();
        driverManager.startBrowser (browser);
        driverManager.getDriver ()
            .get ("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown () {
        driverManager.stopDriver ();
    }

}
