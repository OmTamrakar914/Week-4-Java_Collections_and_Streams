package reflection.advance_level.method_execution_timing;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MethodExecutionTimerTest {
    @Test
    void testFastMethodExecutionTime() {
        // Capture console output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        SampleClass sample = new SampleClass();
        MethodExecutionTimer.measureExecutionTime(sample, "fastMethod");

        // Capture log output
        String logOutput = outputStreamCaptor.toString().trim();

        // Check if output contains method execution time message
        assertTrue(logOutput.contains("Execution time of fastMethod"), "Log should contain execution time of fastMethod");
    }

    @Test
    void testSlowMethodExecutionTime() {
        // Capture console output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        SampleClass sample = new SampleClass();
        MethodExecutionTimer.measureExecutionTime(sample, "slowMethod");

        // Capture log output
        String logOutput = outputStreamCaptor.toString().trim();

        // Check if output contains method execution time message
        assertTrue(logOutput.contains("Execution time of slowMethod"), "Log should contain execution time of slowMethod");
    }
}
