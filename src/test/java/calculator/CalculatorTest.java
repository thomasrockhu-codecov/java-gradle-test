package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
  private static final double DELTA = 0.001;

  @Test
  public void testAdd() {
    assertEquals(Calculator.add(1, 2), 3.0, DELTA);
  }
}
