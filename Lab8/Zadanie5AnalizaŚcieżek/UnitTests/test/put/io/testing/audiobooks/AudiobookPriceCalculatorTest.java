package put.io.testing.audiobooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {

    @Test
    public void test1(){
        Customer customer = new Customer("testowy", Customer.LoyaltyLevel.STANDARD, false);
        Audiobook audiobook = new Audiobook("testowy", 100);
        AudiobookPriceCalculator calc = new AudiobookPriceCalculator();
        assertEquals(100, calc.calculate(customer, audiobook));
    }

    @Test
    public void test2(){
        Customer customer = new Customer("testowy", Customer.LoyaltyLevel.SILVER, false);
        Audiobook audiobook = new Audiobook("testowy", 100);
        AudiobookPriceCalculator calc = new AudiobookPriceCalculator();
        assertEquals(90, calc.calculate(customer, audiobook));
    }

    @Test
    public void test3(){
        Customer customer = new Customer("testowy", Customer.LoyaltyLevel.GOLD, false);
        Audiobook audiobook = new Audiobook("testowy", 100);
        AudiobookPriceCalculator calc = new AudiobookPriceCalculator();
        assertEquals(80, calc.calculate(customer, audiobook));
    }

    @Test
    public void test4(){
        Customer customer = new Customer("testowy", Customer.LoyaltyLevel.STANDARD, true);
        Audiobook audiobook = new Audiobook("testowy", 100);
        AudiobookPriceCalculator calc = new AudiobookPriceCalculator();
        assertEquals(0, calc.calculate(customer, audiobook));
    }
}