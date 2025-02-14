package queue.test.implementing.stack.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import queue.implementingstack.ImplementStackUsingQueues;

class ImplementStackUsingQueuesTest {
    private ImplementStackUsingQueues stack;

    @BeforeEach
    void setUp() {
        stack = new ImplementStackUsingQueues();
    }

    @Test
    void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
    }

    @Test
    void testPushAndTop() {
        stack.push(5);
        stack.push(10);
        stack.push(15);
        assertEquals(15, stack.top());
    }

    @Test
    void testPopUntilEmpty() {
        stack.push(7);
        stack.push(14);
        stack.push(21);
        assertEquals(21, stack.pop());
        assertEquals(14, stack.pop());
        assertEquals(7, stack.pop());
        assertEquals(-1, stack.pop()); // Expect -1 since stack is empty
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(9);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testDisplay() {
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.display(); // Manually check console output for validation
    }
}

