package wordcountertest;
import org.junit.jupiter.api.Test;
import wordcount.CountWordinaFile;

import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CountWordInaFileTest {

    @Test
    public void testInputFileExists() {
        File inputFile = new File("src/main/java/filereading/input.txt");
        assertTrue(inputFile.exists()); // Check if input file exists
    }

    @Test
    public void testNoExceptionThrown() {
        assertDoesNotThrow(() -> CountWordinaFile.main(new String[]{})); // Ensure main runs without errors
    }
}
