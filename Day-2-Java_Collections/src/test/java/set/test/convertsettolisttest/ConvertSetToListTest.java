package set.test.convert.set.to.list.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import set.convert.set.to.list.ConvertASetToASortedLIst;

import java.util.*;

class ConvertASetToASortedListTest {

    @Test
    void testSortedList() {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 6, 3, 4, 0, 7, 1, 2));
        List<Integer> expectedList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7);

        assertEquals(expectedList, ConvertASetToASortedLIst.sortedList(set));
    }

    @Test
    void testSortedListWithDuplicates() {
        Set<Integer> set = new HashSet<>(Arrays.asList(3, 3, 1, 2, 2, 4, 4));
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4);

        assertEquals(expectedList, ConvertASetToASortedLIst.sortedList(set));
    }

    @Test
    void testSortedListEmptySet() {
        Set<Integer> set = new HashSet<>();
        List<Integer> expectedList = new ArrayList<>();

        assertEquals(expectedList, ConvertASetToASortedLIst.sortedList(set));
    }

    @Test
    void testSortedListSingleElement() {
        Set<Integer> set = new HashSet<>(Collections.singleton(9));
        List<Integer> expectedList = Collections.singletonList(9);

        assertEquals(expectedList, ConvertASetToASortedLIst.sortedList(set));
    }
}
