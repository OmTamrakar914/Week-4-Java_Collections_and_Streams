package multiplecatchblockstest;

import multiplecatchblocks.MultipleCatchBlocks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MultipleCatchBlocksTest {
    int arr[] = {1,2,3,4,5,6};
    @Test
    void testindexInbound(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        MultipleCatchBlocks.checkIndexOutofBound(arr,2);
        assertTrue(outputStream.toString().trim().contains("Value at index X: 3"));
    }

    @Test
    void testindexOutOfBound(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        MultipleCatchBlocks.checkIndexOutofBound(arr,7);
        assertTrue(outputStream.toString().trim().contains("You accessing the element beyond the size of array!"));
    }

    @Test
    void testnullArraycheck(){
        arr = null;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        MultipleCatchBlocks.checkIndexOutofBound(arr,2);
        assertTrue(outputStream.toString().trim().contains("The array is not iniated!"));
    }
}
