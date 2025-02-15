package userinputtest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import userinput.ReadUserInputfromConsole;

import java.io.*;
import java.nio.file.*;

class ReadUserInputfromConsoleTest {
    private static final String TEST_OUTPUT_FILE = "C:\\Users\\Om\\OneDrive\\Desktop\\CapegeminiPractice\\Week-4-Java_Collections_and_Streams\\Day-3-Streams\\src\\main\\java\\userinput\\user_data.txt";

    @BeforeEach
    void setUp() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_OUTPUT_FILE));
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_OUTPUT_FILE));
    }

    @Test
    void testUserInputAndFileWrite() throws IOException {

        String simulatedInput = "om\n25\nJava\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));


        ReadUserInputfromConsole.main(new String[]{});


        assertTrue(Files.exists(Paths.get(TEST_OUTPUT_FILE)), "Output file was not created!");
        String fileContent = Files.readString(Paths.get(TEST_OUTPUT_FILE));
        assertTrue(fileContent.contains("Name: om"));
        assertTrue(fileContent.contains("Age: 25"));
        assertTrue(fileContent.contains("Favorite Language: Java"));
    }
}

