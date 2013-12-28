package com.KataFizzBuzzJava.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 13-12-28
 * Time: 下午3:11
*/
public abstract class FizzBuzzBaseHandler {
    protected FizzBuzzBaseHandler successor;

    public FizzBuzzBaseHandler(FizzBuzzBaseHandler successor)
    {
        this.successor = successor;
    }

    public abstract String generate(int number);

    protected boolean isFizzLikeNumber(int number) {
        return number%3 == 0 || Integer.valueOf(number).toString().contains("3");
    }

    protected boolean isBuzzLikeNumber(int number) {
        return number % 5 == 0;
    }

    protected boolean isWhizzLikeNumber(int number) {
        return number % 7 == 0;
    }
}
