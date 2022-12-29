package io.github.mfaisalkhatri.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

/**
 * @author Faisal Khatri
 * @since 12/28/2022
 **/
public class Base {

    @BeforeClass
    public void beforeClass () {
        System.out.println ("This is before class!");
    }

    @BeforeTest
    public void beforeTest () {
        System.out.println ("This is before Test");
    }

    @AfterClass
    public void afterClass () {
        System.out.println ("This is after class");
    }

    @AfterTest
    public void afterTest () {
        System.out.println ("This is after test");
    }
}
