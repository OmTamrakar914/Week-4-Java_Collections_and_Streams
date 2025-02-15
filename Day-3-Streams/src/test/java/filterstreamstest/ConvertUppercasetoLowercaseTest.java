package filterstreamstest;
import filterstreams.ConvertUppercasetoLowercase;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertUppercasetoLowercaseTest {

    @Test
    public void testOutputFileCreated() {
        ConvertUppercasetoLowercase.main(new String[]{});
        File outputFile = new File("src/main/java/filterstreams/output.txt");
        assertTrue(outputFile.exists()); // Check if output file is created
    }

    @Test
    public void testInputFileExists() {
        File inputFile = new File("src/main/java/filterstreams/input.txt");
        assertTrue(inputFile.exists()); // Check if input file exists
    }
}
