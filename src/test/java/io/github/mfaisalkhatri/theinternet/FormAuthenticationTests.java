package io.github.mfaisalkhatri.theinternet;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import io.github.mfaisalkhatri.BaseTest;
import io.github.mfaisalkhatri.pages.CheckboxPage;
import io.github.mfaisalkhatri.pages.FormAuthenticationPage;
import io.github.mfaisalkhatri.pages.HomePage;
import io.github.mfaisalkhatri.pages.SecurePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/1/2022
 **/

public class FormAuthenticationTests extends BaseTest {

    private HomePage homePage;

    @BeforeClass
    public void testSetup () {
        driverManager.getDriver ()
            .get ("https://the-internet.herokuapp.com/");
        homePage = new HomePage (driverManager.getDriver ());
    }

    @Test
    public void testTitleOfInternetWebsite () {
        String title = homePage.getTitle ();
        assertEquals (title, "The Internet");
        String currentUrl = driverManager.getDriver ().getCurrentUrl ();
        System.out.println (currentUrl);
        String pageSource = driverManager.getDriver ().getPageSource ();
        System.out.println (pageSource);
    }


    @Test(priority = 1)
    public void testFormAuthentication () {
        homePage.openMenu ("Form Authentication");

        FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage (driverManager.getDriver ());
        assertEquals (formAuthenticationPage.pageHeader (), "Login Page");
        String expectedSubHeader = "This is where you can log into the secure area. Enter tomsmith for the username and SuperSecretPassword! for the password. If the information is wrong you should see error messages.";
        assertEquals (formAuthenticationPage.subHeader (), expectedSubHeader);

        SecurePage securePage = formAuthenticationPage.login ("tomsmith","SuperSecretPassword!");
        //assertEquals (securePage.getFlashMessage (), "You logged into a secure area!\n×");
        assertTrue (securePage.getFlashMessage ().contains ("You logged into a secure area"));
    }


}
