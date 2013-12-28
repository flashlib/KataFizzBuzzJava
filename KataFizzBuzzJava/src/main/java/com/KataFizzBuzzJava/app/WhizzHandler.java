package com.KataFizzBuzzJava.app;

/**
 * Created by IntelliJ IDEA.
 * User: Jacky
 * Date: 13-12-28
 * Time: 下午3:13
*/
public class WhizzHandler extends FizzBuzzBaseHandler {
    public WhizzHandler(FizzBuzzBaseHandler successor) {
        super(successor);
    }

    @Override
    public String generate(int number) {
        if (isWhizzLikeNumber(number))
        {
            return "Whizz";
        }

        return this.successor.generate(number);
    }
}
