package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public class WhizzHandler extends FizzBuzzBaseHandler {
    public WhizzHandler(FizzBuzzBaseHandler successor) {
        super(successor);
    }

    @Override
    public String generate(int number) {
        if (number%7 == 0)
        {
            return "Whizz";
        }

        return this.successor.generate(number);
    }
}
