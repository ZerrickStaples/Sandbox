import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest
{

    @Test
    public void fizzBuzzReturnsANumber()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void fizzBuzzReturnsInputNumber()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void returnsFizzForMultiplesOf3()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.fizz(3));
        assertEquals("Fizz", fizzBuzz.fizz(6));
    }

    @Test
    public void returnsBuzzFor5AndMultiples()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.fizz(5));
        assertEquals("Buzz", fizzBuzz.fizz(10));
    }

    @Test
    public void returnsFizzBuzzForMultiplesOf3And5()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.fizz(15));
    }

}
