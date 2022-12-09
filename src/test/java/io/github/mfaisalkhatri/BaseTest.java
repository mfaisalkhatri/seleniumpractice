package io.github.mfaisalkhatri;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * @author Faisal Khatri
 * @since 12/1/2022
 **/
public class BaseTest {

   public DriverManager driverManager;

    @Parameters ("browser")
    @BeforeClass(alwaysRun = true)
    public void setupTest (String browser) {
        driverManager = new DriverManager ();
        driverManager.startBrowser (browser);

    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        driverManager.stopDriver ();
    }

}
