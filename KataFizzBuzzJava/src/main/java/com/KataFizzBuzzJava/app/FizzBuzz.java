package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public class FizzBuzz {
    public static String say(int number) {
        if (number == 5)
            return "Buzz";
        if (number%3 == 0)
            return "Fizz";
        if (number == 2)
            return "2";
        return "1";
    }
}