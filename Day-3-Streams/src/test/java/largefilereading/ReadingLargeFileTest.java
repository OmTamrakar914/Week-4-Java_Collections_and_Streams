package largefilereading;
import filereading.ReadingFileLineByLine;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ReadingLargeFileTest {

    @Test
    public void testInputFileExists() {
        File inputFile = new File("src/main/java/filereading/input.txt");
        assertTrue(inputFile.exists()); // Check if input file exists
    }

    @Test
    public void testNoExceptionThrown() {
        assertDoesNotThrow(() -> ReadingFileLineByLine.main(new String[]{})); // Ensure main runs without errors
    }
}
