package io.github.mfaisalkhatri.pages;

import java.io.IOException;

import io.github.mfaisalkhatri.utilities.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Faisal Khatri
 * @since 12/9/2022
 **/
public class RadioButtonPage {

    private WebDriver driver;

    public RadioButtonPage (final WebDriver driver) {
        this.driver = driver;
    }

    public WebElement maleRadioBtn() {
        return driver.findElement (By.cssSelector ("input[value=Male][name=optradio]"));
    }

    public void clickMaleRadioBtn()  {
        maleRadioBtn ().click ();
        Helper helper = new Helper (driver);
        helper.takeScreenshot ();
    }

    public boolean isMaleRadioBtnSelected () {
        return maleRadioBtn ().isSelected ();
    }

}
