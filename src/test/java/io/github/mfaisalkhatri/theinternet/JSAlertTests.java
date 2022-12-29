package io.github.mfaisalkhatri.theinternet;

import static org.testng.Assert.assertEquals;

import io.github.mfaisalkhatri.BaseTest;
import io.github.mfaisalkhatri.pages.HomePage;
import io.github.mfaisalkhatri.pages.JSAlertPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/9/2022
 **/
public class JSAlertTests extends BaseTest {
    private JSAlertPage jsAlertPage;
    @BeforeClass
    private void setupTest () {
        driverManager.getDriver ()
            .get ("https://the-internet.herokuapp.com/");
        HomePage homePage = new HomePage (driverManager.getDriver ());
        homePage.openMenu ("JavaScript Alerts");
        jsAlertPage = new JSAlertPage (driverManager.getDriver ());
    }

    @Test
    public void alertTest () {
        assertEquals (jsAlertPage.getJSAlertText (), "I am a JS Alert");
        assertEquals (this.jsAlertPage.getTextAfterAcceptingAlert (), "You successfully clicked an alert");
    }

    public void confirmAlertTest () {
        assertEquals (jsAlertPage.getConfirmAlertText (), "I am a JS Confirm");
        assertEquals (this.jsAlertPage.getTextAfterAcceptingAlert (), "You clicked: Ok");
    }

    @Test
    public void dismissAlertTest () {
        assertEquals (jsAlertPage.dismissAlertText (), "I am a JS Confirm");
        assertEquals (this.jsAlertPage.getTextAfterDismissingAlert(), "You clicked: Cancel");
    }

    @Test
    public void jsPromptDismissTest () {
        assertEquals (jsAlertPage.getJSPromptText (), "I am a JS prompt");
        assertEquals (this.jsAlertPage.getTextAfterDismissingAlert (), "You entered: null");
    }

    @Test
    public void jsPromptTypeAndAcceptTest () {
        assertEquals (jsAlertPage.getJSPromptText (), "I am a JS prompt");
        final String text = "Testing by typing text in JS Alert";
        this.jsAlertPage.typeTextInAlert (text);
        this.jsAlertPage.acceptAlert ();
        assertEquals (this.jsAlertPage.resultText (), "You entered: " + text);
    }


}
