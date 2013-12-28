package com.KataFizzBuzzJava.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 13-12-28
 * Time: 下午3:14
*/
public class FizzBuzzWhizzHandler extends FizzBuzzBaseHandler {
    public FizzBuzzWhizzHandler(FizzBuzzBaseHandler successor) {
        super(successor);
    }

    @Override
    public String generate(int number) {
        if (isFizzLikeNumber(number) && isBuzzLikeNumber(number) && isWhizzLikeNumber(number)) return "FizzBuzzWhizz";

        return this.successor.generate(number);
    }

}
