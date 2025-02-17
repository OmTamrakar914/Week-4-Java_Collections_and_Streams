package trywithresourcestest;

import org.junit.jupiter.api.Test;
import trywithresources.TryWithResources;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TryWithResourceTest {
    @Test
    void testreading(){
        String filepath = "src/main/java/trywithresources/input.txt";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        TryWithResources.trywithResource(filepath);
        //printing thr first line of input file
        assertTrue(outputStream.toString().trim().contains("try-with-resources (Auto-closing Resources)"));
    }

    @Test
    void testnofileReading(){
        String filepath=""; //file doesn't exist
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        TryWithResources.trywithResource(filepath);
        assertTrue(outputStream.toString().trim().contains("Error reading file!"));
    }
}
