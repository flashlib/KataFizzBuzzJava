package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public abstract class FizzBuzzBaseHandler {
    protected FizzBuzzBaseHandler successor;

    public FizzBuzzBaseHandler(FizzBuzzBaseHandler successor)
    {
        this.successor = successor;
    }

    public abstract String generate(int number);
}
