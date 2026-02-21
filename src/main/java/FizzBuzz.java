public class FizzBuzz {

    /**
     * Returns "Fizz" if n is a multiple of 3, "Buzz" if n is a multiple of 5,
     * "FizzBuzz" if n is a multiple of both 3 and 5, and the string representation
     * of n otherwise.
     */
    public static String fizzbuzz(int n) {
        if (n <= 0) {
            return String.valueOf(n);
        }

        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        if (n % 3 == 0) {
            return "Fizz";
        }

        if (n % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(n);
    }
}