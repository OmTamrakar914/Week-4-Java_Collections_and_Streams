package exceptionpropogationinmethodstest;

import static org.junit.jupiter.api.Assertions.*;
import exceptionpropagation.ExceptionPropogationInMethods;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExceptionPropogationMethodTest {

    @Test
    void testvalidArguments(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        ExceptionPropogationInMethods.method2(10,2);
        assertTrue(outputStream.toString().contains("The Result : 5"));
    }

    @Test
    void testInvalidArguments(){
        Exception exception = assertThrows(Exception.class,()->ExceptionPropogationInMethods.method1(10,0));
        assertEquals(exception.getMessage(),"/ by zero");
    }
}
