package com.zerrickstaples;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzReturnsANumber(){
        Assert.assertEquals("1", FizzBuzz.calc(1));
    }

    @Test
    public void fizzBuzzReturnsInputNumber() {
        Assert.assertEquals("2", FizzBuzz.calc(2));
    }

}
