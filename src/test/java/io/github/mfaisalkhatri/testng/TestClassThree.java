package io.github.mfaisalkhatri.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/28/2022
 **/
public class TestClassThree {

    @BeforeClass
    public void beforeClass () {
        System.out.println ("This is before class in Test Class Three");
    }

    @BeforeTest
    public void beforeTest () {
        System.out.println ("This is before test in Test Class Three");
    }

    @Test
    public void testOne () {
        System.out.println ("This is test one of Test Class Three");
    }

    @Test
    public void testTwo () {
        System.out.println ("This is test two of Test Class Three");
    }

}
