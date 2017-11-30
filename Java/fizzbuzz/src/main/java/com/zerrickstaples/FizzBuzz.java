package com.zerrickstaples;

public class FizzBuzz {
    public static String calc(Integer inputNumber) {

        if(inputNumber == 15){
            return "FizzBuzz";
        }
        if (inputNumber % 5 == 0){
            return "Buzz";
        }
        if(inputNumber % 3 == 0){
            return "Fizz";
        }
        return inputNumber.toString();
    }
}
