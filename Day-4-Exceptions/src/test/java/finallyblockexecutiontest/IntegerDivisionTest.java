package finallyblockexecutiontest;
import static org.junit.jupiter.api.Assertions.*;

import finallyblockexecution.IntegerDivision;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class IntegerDivisionTest {
    @Test
    void testnonZeroArguments(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        IntegerDivision.integerdivision(10,2);
        String actualResult = "The division of 10/2 = 5"+ System.lineSeparator() +"Operation completed!" +System.lineSeparator();
        assertEquals(outputStream.toString(),actualResult);
    }

    @Test
    void testdividingByZero(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        IntegerDivision.integerdivision(10,0);
        assertTrue(outputStream.toString().trim().contains("Invalid input : Divide by zero"));
    }
}
