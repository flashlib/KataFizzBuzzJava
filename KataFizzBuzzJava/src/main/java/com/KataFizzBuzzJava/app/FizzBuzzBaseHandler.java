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

    protected boolean isFizzLikeNumber(int number) {
        if (number%3 == 0)
        {
            return true;
        }

        String strNumber = Integer.valueOf(number).toString();
        if (strNumber.contains("3"))
        {
            return true;
        }
        return false;
    }

    protected boolean isBuzzLikeNumber(int number) {
        if (number%5 == 0)
        {
            return true;
        }
        return false;
    }
}
