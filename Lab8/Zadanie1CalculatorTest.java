package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddition(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    public void testMultiplication(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0, 10000));
        assertEquals(6, calculator.multiply(3, 2));
    }
}