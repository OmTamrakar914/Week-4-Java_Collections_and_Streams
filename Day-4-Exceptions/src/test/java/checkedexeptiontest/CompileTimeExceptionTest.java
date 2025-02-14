package checkedexeptiontest;

import checkedexceptions.CompileTimeExceptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CompileTimeExceptionTest {
    @Test
    void readingFileTest(){
        String filePath="src/main/java/checked_exception/Data.txt";
        assertDoesNotThrow(()-> CompileTimeExceptions.readingFile(filePath));
    }
}
