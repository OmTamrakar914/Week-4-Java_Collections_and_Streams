package list.test.last.nth.element.test;

import static org.junit.jupiter.api.Assertions.*;

import list.last.nth.element.NthElementfromtheLast;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

class NthElementfromtheLastTest {

    @Test
    void testNthLastElementWithValidInput() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        assertEquals(40, NthElementfromtheLast.nthLastElement(list, 2));
        assertEquals(10, NthElementfromtheLast.nthLastElement(list, 5));
    }

    @Test
    void testNthLastElementWithInvalidPosition() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(15);
        list.add(25);

        assertEquals(-1, NthElementfromtheLast.nthLastElement(list, 0));  // Position is zero
        assertEquals(-1, NthElementfromtheLast.nthLastElement(list, 4));  // Out of bounds
    }

    @Test
    void testNthLastElementWithEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(-1, NthElementfromtheLast.nthLastElement(list, 1));
    }

    @Test
    void testNthLastElementWithSingleElementList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(99);
        assertEquals(99, NthElementfromtheLast.nthLastElement(list, 1));
        assertEquals(-1, NthElementfromtheLast.nthLastElement(list, 2));  // Out of bounds
    }
}
