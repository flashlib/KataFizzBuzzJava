package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public class FizzBuzz {
    public static String say(int number) {
//        if (number%15 == 0)
//            return "FizzBuzz";
//        if (number%5 == 0)
//            return "Buzz";
//        if (number%3 == 0)
//            return "Fizz";
//        return Integer.valueOf(number).toString();
        FizzBuzzBaseHandler normalHandler = new NormalHandler(null);
        FizzBuzzBaseHandler fizzHandler = new FizzHandler(normalHandler);
        FizzBuzzBaseHandler buzzHandler = new BuzzHandler(fizzHandler);
        FizzBuzzBaseHandler fizzBuzzHandler = new FizzBuzzHander(buzzHandler);
        return fizzBuzzHandler.generate(number);
    }
}
