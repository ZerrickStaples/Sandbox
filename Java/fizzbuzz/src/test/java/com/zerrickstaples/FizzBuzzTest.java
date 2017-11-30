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

    @Test
    public void returnsFizzInPlaceOfThree() {
        Assert.assertEquals("Fizz", FizzBuzz.calc(3));
    }

    @Test
    public void returnsFizzForMultiplesOfThree() {
        Assert.assertEquals("Fizz", FizzBuzz.calc(6));
    }

    @Test
    public void returnsBuzzInPlaceOfFive() {
        Assert.assertEquals("Buzz", FizzBuzz.calc(5));
    }

    @Test
    public void returnsFizzForMultiplesOfFive() {
        Assert.assertEquals("Buzz", FizzBuzz.calc(10));
    }

    @Test
    public void returnsFizzBuzzInPlaceOf15() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.calc(15));
    }

    @Test
    public void returnsFizzBuzzForMultiplesOf15() {
        Assert.assertEquals("FizzBuzz", FizzBuzz.calc(30));
    }
}
