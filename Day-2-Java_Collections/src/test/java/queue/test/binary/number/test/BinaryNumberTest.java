package queue.test.binary.number.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queue.binarynumber.BinaryNoUsingQueue;

import java.util.*;

class BinaryNoUsingQueueTest {

    @Test
    void testBinaryQueueWithPositiveNumber() {
        Queue<String> expected = new LinkedList<>(Arrays.asList("1", "10", "11", "100", "101"));
        assertEquals(expected, BinaryNoUsingQueue.binaryqueue(5));
    }

    @Test
    void testBinaryQueueWithOne() {
        Queue<String> expected = new LinkedList<>(Collections.singletonList("1"));
        assertEquals(expected, BinaryNoUsingQueue.binaryqueue(1));
    }

    @Test
    void testBinaryQueueWithZero() {
        Queue<String> expected = new LinkedList<>();
        assertEquals(expected, BinaryNoUsingQueue.binaryqueue(0));
    }

    @Test
    void testBinaryQueueWithLargeNumber() {
        Queue<String> queue = BinaryNoUsingQueue.binaryqueue(10);
        assertEquals(10, queue.size());
        assertTrue(queue.contains("1010")); // Binary of 10
    }
}
