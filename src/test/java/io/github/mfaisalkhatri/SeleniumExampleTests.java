package io.github.mfaisalkhatri;

import static org.testng.Assert.assertEquals;

import io.github.mfaisalkhatri.pages.HomePage;
import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/1/2022
 **/
public class SeleniumExampleTests extends BaseTest {

    @Test
    public void testTitleOfInternetWebsite () {
        HomePage homePage = new HomePage (driverManager.getDriver ());
        String title = homePage.getTitle ();
        assertEquals (title, "The Internet");

    }

}
