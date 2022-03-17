import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int expected = 15;
        int result = calculator.add(10, 5);
        assertEquals(expected, result);

        Calculator calculator1 = new Calculator();
        int expected1 = 150;
        int result1 = calculator.add(100, 50);
        assertEquals(expected1, result1);
    }
}