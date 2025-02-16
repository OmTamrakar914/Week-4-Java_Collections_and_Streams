package annotation.exercise.exercise1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnimalTest {

    @Test
    void testDogMakeSound() {
        // Capture system output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Create Dog object and call makeSound()
        Dog myDog = new Dog();
        myDog.makeSound();

        // Restore original System.out
        System.setOut(originalOut);

        // Assert the expected output
        String expectedOutput = "Dog barks: Woof! Woof!" + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
}
