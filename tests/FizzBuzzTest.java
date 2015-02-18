import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the FizzBuzz class with 4 different tests.
 *
 * @author Eric
 */
public class FizzBuzzTest {

  /**
   * Tests the printFizzBuzz method with all possible cases of multiples of 3, multiples of 5, multiples of 15
   * and non multiples.
   * @throws Exception if a problem occurs during computation.
   */
  @Test
  public void testPrintFizzBuzz() throws Exception {
    assertEquals("Testing number 4", "4", FizzBuzz.printFizzBuzz(4));
    assertEquals("Testing number 45", "FizzBuzz", FizzBuzz.printFizzBuzz(45));
    assertEquals("Testing number 99", "Fizz", FizzBuzz.printFizzBuzz(99));
    assertEquals("Testing number 100", "Buzz", FizzBuzz.printFizzBuzz(100));
  }
}