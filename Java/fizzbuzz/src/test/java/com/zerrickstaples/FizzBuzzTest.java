package com.zerrickstaples;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzReturnsANumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzBuzz.calc(1));
    }
}
