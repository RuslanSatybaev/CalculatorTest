import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorOperationTest {
    private CalculatorOperation calculatorOperation;

    @Before
    public void setUp() {
        calculatorOperation = new CalculatorOperation();
    }

    @Test
    public void add() {
        int expected = 15;
        int result = calculatorOperation.add(10, 5);
        assertEquals(expected, result);

        int expected2 = 150;
        int result2 = calculatorOperation.add(100, 50);
        assertEquals(expected2, result2);
    }

    @Test
    public void subtract() {
        int expectedSubtract = 5;
        int resultSubtract = calculatorOperation.subtract(15, 10);
        assertEquals(expectedSubtract, resultSubtract);
    }

    @Test
    public void multiply() {
        int expectedMultiplied = 12;
        int resultMultiplied = calculatorOperation.multiply(3, 4);
        assertEquals(expectedMultiplied, resultMultiplied);
    }

    @Test
    public void divide() {
        int expectedDivided = 2;
        int resultDivided = calculatorOperation.divide(30, 15);
        assertEquals(expectedDivided, resultDivided);
    }

    @After
    public void close() {
        calculatorOperation = null;
    }
}
