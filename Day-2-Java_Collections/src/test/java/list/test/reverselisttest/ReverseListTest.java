package list.test.reverse.list.test;

import static org.junit.jupiter.api.Assertions.*;

import list.reverse.list.ReverseList;
import org.junit.jupiter.api.Test;
import java.util.*;

class ReverseListTest {

    @Test
    void testReverseListWithMultipleElements() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);

        assertEquals(expected, ReverseList.reverseList(list));
    }

    @Test
    void testReverseLinkedListWithMultipleElements() {
        List<Integer> list = Arrays.asList(10, 20, 30);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(30, 20, 10));

        assertEquals(expected, ReverseList.reverseLinkedList(list));
    }

    @Test
    void testReverseListWithEmptyList() {
        List<Integer> list = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();

        assertEquals(expected, ReverseList.reverseList(list));
    }

    @Test
    void testReverseLinkedListWithEmptyList() {
        List<Integer> list = Collections.emptyList();
        LinkedList<Integer> expected = new LinkedList<>();

        assertEquals(expected, ReverseList.reverseLinkedList(list));
    }

    @Test
    void testReverseListWithSingleElement() {
        List<Integer> list = Arrays.asList(42);
        List<Integer> expected = Arrays.asList(42);

        assertEquals(expected, ReverseList.reverseList(list));
    }

    @Test
    void testReverseLinkedListWithSingleElement() {
        List<Integer> list = Arrays.asList(99);
        LinkedList<Integer> expected = new LinkedList<>(Arrays.asList(99));

        assertEquals(expected, ReverseList.reverseLinkedList(list));
    }
}
