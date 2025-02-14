package queue.test.circular.buffer.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import queue.circularbuffer.CircularBufferSimulation;

class CircularBufferSimulationTest {
    private CircularBufferSimulation buffer;

    @BeforeEach
    void setUp() {
        buffer = new CircularBufferSimulation(3);
    }

    @Test
    void testAddAndDisplay() {
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);

        assertArrayEquals(new int[]{1, 2, 3}, buffer.getBufferState());
    }

    @Test
    void testCircularBehavior() {
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.add(4); // Overwrites 1

        assertArrayEquals(new int[]{4, 2, 3}, buffer.getBufferState());
    }

    @Test
    void testDelete() {
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        int removed = buffer.delete();

        assertEquals(1, removed);
        assertArrayEquals(new int[]{1, 2, 3}, buffer.getBufferState());
    }

    @Test
    void testDeleteFromEmptyBuffer() {
        assertEquals(-1, buffer.delete());
    }

    @Test
    void testAddingAfterDeletion() {
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        buffer.delete();
        buffer.add(4);

        assertArrayEquals(new int[]{4, 2, 3}, buffer.getBufferState());
    }
}
