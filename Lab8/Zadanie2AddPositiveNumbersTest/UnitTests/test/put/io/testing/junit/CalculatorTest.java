package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddPositiveNumbers(){
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {calculator.addPositiveNumbers(3, -1);});
    }
}