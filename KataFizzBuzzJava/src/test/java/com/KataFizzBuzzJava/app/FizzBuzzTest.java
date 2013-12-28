package com.KataFizzBuzzJava.app;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Jacky on 13-12-28.
 */
public class FizzBuzzTest {
    @Test
    public void oneShouldSayOne()
    {
        assertEquals("1 should return '1'", "1", FizzBuzz.say(1));
    }

    @Test
    public void twoShouldSayTwo()
    {
        assertEquals("2 should return '2'", "2", FizzBuzz.say(2));
    }

    @Test
    public void threeShouldSayFizz()
    {
        assertEquals("3 should return 'Fizz'", "Fizz", FizzBuzz.say(3));
    }

    @Test
    public void fiveShouldSayBuzz()
    {
        assertEquals("5 should return 'Buzz'", "Buzz", FizzBuzz.say(5));
    }

    @Test
    public void sixShouldSayFizz()
    {
        assertEquals("6 should return 'Fizz'", "Fizz", FizzBuzz.say(6));
    }

    @Test
    public void tenShouldSayBuzz()
    {
        assertEquals("10 should return 'Buzz'", "Buzz", FizzBuzz.say(10));
    }

    @Test
    public void fifteenShouldSayFizzBuzz()
    {
        assertEquals("15 should return 'FizzBuzz'", "FizzBuzz", FizzBuzz.say(15));
    }
}
