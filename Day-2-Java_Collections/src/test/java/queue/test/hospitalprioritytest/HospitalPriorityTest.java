package queue.test.hospital.priority.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import queue.hospitalpatientprioritysystem.Patient;

import java.util.*;

class HospitalTriageSystemTest {
    private PriorityQueue<Patient> queue;

    @BeforeEach
    void setUp() {
        queue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.saverity, p1.saverity));
    }

    @Test
    void testPatientPriorityOrder() {
        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        assertEquals("Alice (Severity: 5)", queue.poll().toString());
        assertEquals("John (Severity: 3)", queue.poll().toString());
        assertEquals("Bob (Severity: 2)", queue.poll().toString());
    }

    @Test
    void testEmptyQueuePolling() {
        assertNull(queue.poll()); // Ensures no errors when queue is empty
    }

    @Test
    void testSameSeverityHandling() {
        queue.add(new Patient("Eve", 4));
        queue.add(new Patient("Charlie", 4));
        queue.add(new Patient("Dave", 4));

        List<String> expectedNames = Arrays.asList("Eve", "Charlie", "Dave");
        List<String> actualNames = new ArrayList<>();

        while (!queue.isEmpty()) {
            actualNames.add(queue.poll().patienName);
        }

        assertTrue(expectedNames.containsAll(actualNames)); // Order may vary but must contain all names
    }
}
