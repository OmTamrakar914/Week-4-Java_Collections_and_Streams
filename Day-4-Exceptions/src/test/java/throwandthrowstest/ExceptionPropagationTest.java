package throwandthrowstest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import throwandthrows.ExceptionPropagation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ExceptionPropagationTest {

    @Test
    void testValidArguments(){
        double actualvalue = ExceptionPropagation.calculateInterest(1000,12,3);
        assertEquals(36.0,actualvalue);
    }


    @Test
    void testInValidArguments(){
        Exception exception = assertThrows(Exception.class,()-> ExceptionPropagation.calculateInterest(-1000,3,3));
        assertEquals(exception.getMessage(),"Amount and rate must be positive!");
    }
}
