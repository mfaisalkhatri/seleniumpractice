package io.github.mfaisalkhatri.testng;

import org.testng.annotations.Test;

/**
 * @author Faisal Khatri
 * @since 12/28/2022
 **/
public class TestClassTwo extends Base {

    @Test
    public void testOne () {
        System.out.println ("This is test one of Test Class Two");
    }

    @Test
    public void testTwo () {
        System.out.println ("This is test two of Test Class Two");
    }
}
