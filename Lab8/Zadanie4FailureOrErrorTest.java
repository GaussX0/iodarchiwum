package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FailureOrErrorTest {
    @Test
    public void test1(){
        assertEquals(0, 1);
    }
    @Test
    public void test2(){
        assertEquals(2, new Calculator().addPositiveNumbers(-1, 3));
    }

    @Test
    public void test3(){
        try{
            assertEquals(0, 1);
        } catch(Throwable exception){
            System.out.println(exception);
            exception.getStackTrace();
        }
    }
}
