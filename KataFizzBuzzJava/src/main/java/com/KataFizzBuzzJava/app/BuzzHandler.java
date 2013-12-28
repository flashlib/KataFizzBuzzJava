package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public class BuzzHandler extends FizzBuzzBaseHandler {
    public BuzzHandler(FizzBuzzBaseHandler successor) {
        super(successor);
    }

    @Override
    public String generate(int number) {
        if (isBuzzLikeNumber(number)) return "Buzz";

        return this.successor.generate(number);
    }
}
