import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest
{

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void fizzBuzzReturnsANumber()
    {
        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void fizzBuzzReturnsInputNumber()
    {
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void returnsFizzForMultiplesOf3()
    {
        assertEquals("Fizz", fizzBuzz.fizz(3));
        assertEquals("Fizz", fizzBuzz.fizz(6));
    }

    @Test
    public void returnsBuzzFor5AndMultiples()
    {
        assertEquals("Buzz", fizzBuzz.fizz(5));
        assertEquals("Buzz", fizzBuzz.fizz(10));
    }

    @Test
    public void returnsFizzBuzzForMultiplesOf3And5()
    {
        assertEquals("FizzBuzz", fizzBuzz.fizz(15));
        assertEquals("FizzBuzz", fizzBuzz.fizz(30));
    }

}
