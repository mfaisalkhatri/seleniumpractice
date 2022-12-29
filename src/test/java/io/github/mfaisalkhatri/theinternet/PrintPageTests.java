package io.github.mfaisalkhatri.theinternet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import io.github.mfaisalkhatri.BaseTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.print.PrintOptions;
import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/16/2022
 **/
public class PrintPageTests extends BaseTest {

    @Test
    public void printPageTest () throws IOException {

        driverManager.getDriver ()
            .get ("https://www.selenium.dev");
        PrintsPage printer = (PrintsPage) driverManager.getDriver ();

        PrintOptions printOptions = new PrintOptions ();
        printOptions.setPageRanges ("1-2");
        Path printPage = Paths.get ("./PrintPageFirefox.pdf");

        Pdf pdf = printer.print (printOptions);
        Files.write (printPage, OutputType.BYTES.convertFromBase64Png (pdf.getContent ()));

    }
}
