package com.KataFizzBuzzJava.app;

/**
 * Created by Jacky on 13-12-28.
 */
public class FizzBuzzHander extends FizzBuzzBaseHandler {
    public FizzBuzzHander(FizzBuzzBaseHandler successor) {
        super(successor);
    }

    @Override
    public String generate(int number) {
        if (number%15 == 0)
        {
            return "FizzBuzz";
        }

        if (number%5 == 0)
        {
            String strNumber = Integer.valueOf(number).toString();
            if (strNumber.contains("3"))
            {
                return "FizzBuzz";
            }
        }

        return this.successor.generate(number);
    }
}
