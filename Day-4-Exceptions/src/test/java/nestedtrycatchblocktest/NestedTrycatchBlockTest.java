package nestedtrycatchblocktest;

import nestedtrycatchblock.NestedTrycatchBlock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NestedTrycatchBlockTest {
    int arr[] = {10,20,30,40,50};
    @Test
    void testAccessingvalidIndex(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        NestedTrycatchBlock.nestedTryarrDivision(arr,5,3);
        assertTrue(output.toString().trim().contains("The Division result of 40 and 5 : 8"));
    }

    @Test
    void testInvalidIndex(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        NestedTrycatchBlock.nestedTryarrDivision(arr,5,6);
        assertTrue(output.toString().trim().contains("Invalid array index!"));
    }

    @Test
    void testDivideByZero(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        NestedTrycatchBlock.nestedTryarrDivision(arr,0,2);
        assertTrue(output.toString().trim().contains("Cannot Divide by zero!"));
    }
}
