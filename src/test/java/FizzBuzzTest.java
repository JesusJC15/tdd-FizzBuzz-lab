import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void fizzbuzz_number1_returns1() {
        String result = FizzBuzz.fizzbuzz(1);
        assertEquals("1", result);
    }

    @Test
    void fizzbuzz_multipleOf3_returnsFizz() {
        String result = FizzBuzz.fizzbuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    void fizzbuzz_multipleOf5_returnsBuzz() {
        String result = FizzBuzz.fizzbuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    void fizzbuzz_multipleOf3And5_returnsFizzBuzz() {
        String result = FizzBuzz.fizzbuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void fizzbuzz_multipleOf3_6_returnsFizz() {
        String result = FizzBuzz.fizzbuzz(6);
        assertEquals("Fizz", result);
    }

    @Test
    void fizzbuzz_multipleOf5_10_returnsBuzz() {
        String result = FizzBuzz.fizzbuzz(10);
        assertEquals("Buzz", result);
    }

    @Test
    void fizzbuzz_zero_returnsZero() {
        String result = FizzBuzz.fizzbuzz(0);
        assertEquals("0", result);
    }

    @Test
    void fizzbuzz_negativeMultipleOf3_returnsNegative3() {
        String result = FizzBuzz.fizzbuzz(-3);
        assertEquals("-3", result);
    }

    @Test
    void fizzbuzz_negativeMultipleOf5_returnsNegative5() {
        String result = FizzBuzz.fizzbuzz(-5);
        assertEquals("-5", result);
    }

    @Test
    void fizzbuzz_negativeMultipleOf3And5_returnsNegative15() {
        String result = FizzBuzz.fizzbuzz(-15);
        assertEquals("-15", result);
    }
}