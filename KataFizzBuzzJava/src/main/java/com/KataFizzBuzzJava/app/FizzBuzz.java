package com.KataFizzBuzzJava.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 13-12-28
 * Time: 下午3:13
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
        FizzBuzzBaseHandler whizzHandler = new WhizzHandler(normalHandler);
        FizzBuzzBaseHandler fizzHandler = new FizzHandler(whizzHandler);
        FizzBuzzBaseHandler buzzHandler = new BuzzHandler(fizzHandler);
        FizzBuzzBaseHandler fizzBuzzHandler = new FizzBuzzHander(buzzHandler);
        FizzBuzzBaseHandler fizzBuzzWhizz = new FizzBuzzWhizzHandler(fizzBuzzHandler);
        return fizzBuzzWhizz.generate(number);
    }
}
