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
        if (isFizzLikeNumber(number)) return "Fizz";

        return this.successor.generate(number);
    }

}
