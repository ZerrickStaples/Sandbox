package com.zerrickstaples;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzReturnsANumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.calc(1));
    }

    @Test
    public void fizzBuzzReturnsInputNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("2", fizzBuzz.calc(2));
    }
}
