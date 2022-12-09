package io.github.mfaisalkhatri.theinternet;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.github.mfaisalkhatri.BaseTest;
import io.github.mfaisalkhatri.pages.RadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/9/2022
 **/
public class RadioBtnTests extends BaseTest {

    @BeforeClass
    public void testSetup () {
    driverManager.getDriver ().get ("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
}

@Test
    public void testRadioBtn () {
    RadioButtonPage radioButtonPage = new RadioButtonPage (driverManager.getDriver ());
    radioButtonPage.clickMaleRadioBtn ();
    assertTrue (radioButtonPage.isMaleRadioBtnSelected ());
}

}
