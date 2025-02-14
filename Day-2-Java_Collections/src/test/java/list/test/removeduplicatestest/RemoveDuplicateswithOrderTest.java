package list.test.remove.duplicates.test;

import static org.junit.jupiter.api.Assertions.*;

import list.remove.duplicates.RemoveDuplicateswithOrder;
import org.junit.jupiter.api.Test;
import java.util.*;

class RemoveDuplicateswithOrderTest {

    @Test
    void testRemoveDuplicatesWithDuplicates() {
        List<Integer> list = Arrays.asList(1, 3, 4, 1, 5, 3, 7, 8, 4);
        LinkedHashSet<Integer> expected = new LinkedHashSet<>(Arrays.asList(1, 3, 4, 5, 7, 8));

        assertEquals(expected, RemoveDuplicateswithOrder.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesWithUniqueElements() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        LinkedHashSet<Integer> expected = new LinkedHashSet<>(list);

        assertEquals(expected, RemoveDuplicateswithOrder.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesWithEmptyList() {
        List<Integer> list = Collections.emptyList();
        LinkedHashSet<Integer> expected = new LinkedHashSet<>();

        assertEquals(expected, RemoveDuplicateswithOrder.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesWithSingleElementList() {
        List<Integer> list = Arrays.asList(42);
        LinkedHashSet<Integer> expected = new LinkedHashSet<>(list);

        assertEquals(expected, RemoveDuplicateswithOrder.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesWithAllSameElements() {
        List<Integer> list = Arrays.asList(5, 5, 5, 5, 5);
        LinkedHashSet<Integer> expected = new LinkedHashSet<>(Arrays.asList(5));

        assertEquals(expected, RemoveDuplicateswithOrder.removeDuplicates(list));
    }
}
