package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public class FizzHandler extends FizzBuzzBaseHandler {
    public FizzHandler(FizzBuzzBaseHandler successor) {
        super(successor);
    }

    @Override
    public String generate(int number) {
        if (number%3 == 0)
        {
            return "Fizz";
        }

        String strNumber = Integer.valueOf(number).toString();
        if (strNumber.contains("3"))
        {
            return "Fizz";
        }

        return this.successor.generate(number);
    }
}
