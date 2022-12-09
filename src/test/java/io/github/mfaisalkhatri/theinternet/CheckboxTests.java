package io.github.mfaisalkhatri.theinternet;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import io.github.mfaisalkhatri.BaseTest;
import io.github.mfaisalkhatri.pages.CheckboxPage;
import io.github.mfaisalkhatri.pages.HomePage;
import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/9/2022
 **/
public class CheckboxTests extends BaseTest {



    @Test ()
    public void testCheckboxes() {
        driverManager.getDriver ()
            .get ("https://the-internet.herokuapp.com/");
        HomePage homePage = new HomePage (driverManager.getDriver ());
        homePage.openMenu ("Checkboxes");
        CheckboxPage checkboxPage = new CheckboxPage(driverManager.getDriver ());

        String pageHeader = checkboxPage.pageHeader();
        assertEquals(pageHeader, "Checkboxes");

        checkboxPage.checkboxOne().click();
        assertTrue(checkboxPage.checkboxOne().isSelected());

        assertTrue(checkboxPage.checkboxTwo().isSelected());

        checkboxPage.checkboxOne().click();
        assertFalse(checkboxPage.checkboxOne().isSelected());

        checkboxPage.checkboxTwo().click();
        assertFalse(checkboxPage.checkboxOne().isSelected());
    }

}
