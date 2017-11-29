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

}