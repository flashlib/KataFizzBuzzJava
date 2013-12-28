package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public class FizzBuzzWhizzHandler extends FizzBuzzBaseHandler {
    public FizzBuzzWhizzHandler(FizzBuzzBaseHandler successor) {
        super(successor);
    }

    @Override
    public String generate(int number) {
        if (number%105 == 0)
        {
            return "FizzBuzzWhizz";
        }

        return this.successor.generate(number);
    }
}
