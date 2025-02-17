package junit.basic_junit_test.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator=new Calculator();
    }

    @Test
    @DisplayName("Test1: for add method")
    void testAddition(){
        assertEquals(5,calculator.addition(2,3));
    }

    @Test
    @DisplayName("Test2: for sub method")
    void testSubtraction(){
        assertEquals(-1,calculator.subtraction(2,3));
    }

    @Test
    @DisplayName("Test3: for mul method")
    void testMultiplication(){
        assertEquals(6,calculator.multiplication(2,3));
    }

    @Test
    @DisplayName("Test4: for div method")
    void testDivision(){
        assertEquals(2,calculator.divide(4,2));
    }

    @Test
    @DisplayName("Test5: for div by zero")
    void testDivideByZero(){
        Exception exception=assertThrows(ArithmeticException.class,()->calculator.divide(2,0));
        String expected="/ by zero";
        assertEquals(exception.getMessage(),expected);
    }

}
