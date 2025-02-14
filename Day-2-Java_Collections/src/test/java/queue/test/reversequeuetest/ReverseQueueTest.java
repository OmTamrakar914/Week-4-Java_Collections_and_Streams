package queue.test.reverse.queue.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queue.reversequeue.ReverseAQueue;

import java.util.LinkedList;
import java.util.Queue;

class ReverseAQueueTest {

    @Test
    void testReverseQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Queue<Integer> reversedQueue = ReverseAQueue.reverseQueue(queue);

        assertEquals(30, reversedQueue.poll());
        assertEquals(20, reversedQueue.poll());
        assertEquals(10, reversedQueue.poll());
        assertTrue(reversedQueue.isEmpty());
    }

    @Test
    void testReverseSingleElement() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);

        Queue<Integer> reversedQueue = ReverseAQueue.reverseQueue(queue);

        assertEquals(5, reversedQueue.poll());
        assertTrue(reversedQueue.isEmpty());
    }

    @Test
    void testReverseEmptyQueue() {
        Queue<Integer> queue = new LinkedList<>();

        Queue<Integer> reversedQueue = ReverseAQueue.reverseQueue(queue);

        assertTrue(reversedQueue.isEmpty());
    }
}
