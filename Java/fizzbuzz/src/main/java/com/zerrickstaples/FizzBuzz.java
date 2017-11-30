package com.zerrickstaples;

public class FizzBuzz {
    public static String calc(Integer inputNumber) {

        if(isFizzBuzz(inputNumber)){
            return "FizzBuzz";
        }
        if (isBuzz(inputNumber)){
            return "Buzz";
        }
        if(isFizz(inputNumber)){
            return "Fizz";
        }
        return inputNumber.toString();
    }

    private static boolean isFizzBuzz(Integer inputNumber) {
        return inputNumber % 15 == 0;
    }

    private static boolean isBuzz(Integer inputNumber) {
        return inputNumber % 5 == 0;
    }

    private static boolean isFizz(Integer inputNumber) {
        return inputNumber % 3 == 0;
    }
}
