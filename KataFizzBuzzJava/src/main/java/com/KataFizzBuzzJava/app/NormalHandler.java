package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public class NormalHandler extends FizzBuzzBaseHandler {
    public NormalHandler(FizzBuzzBaseHandler successor) {
        super(successor);
    }

    @Override
    public String generate(int number) {
        return Integer.valueOf(number).toString();
    }
}
