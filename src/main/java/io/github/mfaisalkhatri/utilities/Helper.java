package io.github.mfaisalkhatri.utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import io.github.mfaisalkhatri.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Faisal Khatri
 * @since 12/9/2022
 **/
public class Helper {

    private WebDriver driver;

    public Helper (final WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot() {
        Date date = new Date ();
        SimpleDateFormat format = new SimpleDateFormat ("dd_MM_YYYY_HH_mm");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("./screenshot_" + format.format (date.getTime ()) +".png"));
        } catch (IOException e) {
            throw new RuntimeException (e);
        }
    }
}
