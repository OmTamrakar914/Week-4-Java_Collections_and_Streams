package junit.basic_junit_test.exception_handling;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ExceptionHandlingTest {

    @Test
    @DisplayName("Test: for divide method")
    void testcase1(){
        int div=ExceptionHandling.divide(4,2);
        assertEquals(2,div);
    }

    @Test
    @DisplayName("Test: for divide by zero")
    void testcase2(){
        Exception exception=assertThrows(ArithmeticException.class,()->ExceptionHandling.divide(1,0));
        assertEquals("/ by zero",exception.getMessage());
    }
}
