package customexceptionstest;

import customexceptions.CustomExceptions;
import customexceptions.InvalidageException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InvalidAgeExceptiontest {

    @Test
    void testvalidAge() throws CustomExceptions {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        InvalidageException.validateAge(19);
        assertTrue(outputStream.toString().trim().contains("Access granted!"));
    }

    @Test
    void testinvalidage() throws CustomExceptions{

        Exception exception=assertThrows(CustomExceptions.class,()->InvalidageException.validateAge(15));;
        assertEquals(exception.getMessage(),"Age must be 18 or older!");
    }

}
