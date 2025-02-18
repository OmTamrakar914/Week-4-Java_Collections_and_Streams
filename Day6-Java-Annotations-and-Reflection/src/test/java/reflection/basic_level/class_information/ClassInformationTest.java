package reflection.basic_level.class_information;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ClassInformationTest {

    @Test
    void testPrintClassInfo_ValidClass() throws ClassNotFoundException {
        // Capture console output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Given a valid class
        ClassInformation.printClassInfo(TestClass.class.getName());

        // Capture output
        String output = outputStreamCaptor.toString().trim();

        // Verify class name is printed
        assertTrue(output.contains("Class name : reflection.basic_level.class_information.TestClass"));

        // Verify fields are printed
        assertTrue(output.contains("private int privateField"));
        assertTrue(output.contains("public String publicField"));

        // Verify constructors are printed
        assertTrue(output.contains("public TestClass()"));
        assertFalse(output.contains("public TestClass(String, int)"));

        // Verify methods are printed
        assertTrue(output.contains("public void publicMethod()"));
        assertTrue(output.contains("private int privateMethod()"));
    }

    @Test
    void testPrintClassInfo_InvalidClass() throws ClassNotFoundException {
        // Capture console output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // When calling an invalid class
        ClassInformation.printClassInfo("invalid.ClassName");

        // Capture output
        String output = outputStreamCaptor.toString().trim();

        // Verify error message
        assertTrue(output.contains("Class not found : invalid.ClassName"));
    }
}
