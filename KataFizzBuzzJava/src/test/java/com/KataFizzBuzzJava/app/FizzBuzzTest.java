package com.KataFizzBuzzJava.app;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by it on 13-12-28.
 */
public class FizzBuzzTest {
    @Test
    public void oneShouldSayOne()
    {
        assertEquals("1 should return '1'", "1", FizzBuzz.say(1));
    }
}
