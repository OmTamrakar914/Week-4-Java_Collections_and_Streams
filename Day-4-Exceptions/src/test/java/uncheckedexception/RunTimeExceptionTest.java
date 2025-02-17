package uncheckedexception;

import org.junit.jupiter.api.Test;
import uncheckedexceptions.RunTimeExceptions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class RunTimeExceptionTest {

    @Test
     void testDivideTwoNumber(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        RunTimeExceptions.dividingbyzero(10,2);
        assertTrue(outputStream.toString().contains("The result is : 5"));
    }

    @Test
    void testDivideByzero(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        RunTimeExceptions.dividingbyzero(10,0);
        assertTrue(outputStream.toString().contains("Invalid expression : Dividing by zero!"));
    }
}
