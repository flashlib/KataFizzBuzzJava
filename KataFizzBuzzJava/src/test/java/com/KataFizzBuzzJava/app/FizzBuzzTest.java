package com.KataFizzBuzzJava.app;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 13-12-28
 * Time: 下午3:15
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
    public void fourShouldSayFour()
    {
        assertEquals("4 should return '4'", "4", FizzBuzz.say(4));
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
    public void sevenShouldSayWhizz()
    {
        assertEquals("7 should say 'Whizz'", "Whizz", FizzBuzz.say(7));
    }

    @Test
    public void tenShouldSayBuzz()
    {
        assertEquals("10 should return 'Buzz'", "Buzz", FizzBuzz.say(10));
    }

    @Test
    public void thirteenShouldSayFizz()
    {
        assertEquals("13 should say 'Fizz'", "Fizz", FizzBuzz.say(13));
    }

    @Test
    public void fifteenShouldSayFizzBuzz()
    {
        assertEquals("15 should return 'FizzBuzz'", "FizzBuzz", FizzBuzz.say(15));
    }

    @Test
    public void thirtyFiveShouldSayFizzBuzzWhizz()
    {
        assertEquals("35 should return 'FizzBuzzWhizz'", "FizzBuzzWhizz", FizzBuzz.say(35));
    }

    @Test
    public void oneHundredAndFiveShouldSayFizzBuzzWhizz()
    {
        assertEquals("105 should return 'FizzBuzzWhizz'", "FizzBuzzWhizz", FizzBuzz.say(105));
    }

    @Test
    public void oneHundredAndThirtyShouldSayFizzBuzz()
    {
        assertEquals("130 should return 'FizzBuzz'", "FizzBuzz", FizzBuzz.say(130));
    }
}
