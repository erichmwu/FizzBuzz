/**
 * Solution to FizzBuzz, which prints out Fizz for multiples of 3 and Buzz for multiples of 5
 * and FizzBuzz for multiples of 15 up to 100.
 *
 * @author Eric
 */
public class FizzBuzz {
  /**
   * Does FizzBuzz from the number 1 to 100.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    System.out.println(printFizzBuzz(100));
  }

  /**
   * Runs the FizzBuzz problem on the number given.
   * @param number the number for the FizzBuzz problem.
   * @return return Fizz if multiple of 3, Buzz if multiple of 5, FizzBuzz if multiple of 15 or just number.
   */
  public static String printFizzBuzz(int number) {
    if (number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    }
    else if (number % 5 == 0) {
      return "Buzz";
    }
    else if (number % 3 == 0) {
      return "Fizz";
    }
    else {
      return "" + number;
    }
  }
}
