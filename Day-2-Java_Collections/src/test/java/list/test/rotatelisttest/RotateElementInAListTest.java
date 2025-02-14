package list.test.rotate.list.test;

import static org.junit.jupiter.api.Assertions.*;

import list.rotate.list.RotateElementInAList;
import org.junit.jupiter.api.Test;
import java.util.*;

class RotateElementInAListTest {

    @Test
    void testRotateListWithValidPosition() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> expected = Arrays.asList(4, 5, 6, 7, 1, 2, 3);

        assertEquals(expected, RotateElementInAList.rotateList(list, 3));
    }

    @Test
    void testRotateListWithZeroRotation() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        List<Integer> expected = Arrays.asList(10, 20, 30, 40);

        assertEquals(expected, RotateElementInAList.rotateList(list, 0));
    }

    @Test
    void testRotateListWithFullRotation() {
        List<Integer> list = Arrays.asList(5, 15, 25, 35);
        List<Integer> expected = Arrays.asList(5, 15, 25, 35); // Full rotation returns same list

        assertEquals(expected, RotateElementInAList.rotateList(list, 4));
    }

    @Test
    void testRotateListWithLargerThanSizeRotation() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(3, 4, 5, 1, 2); // Equivalent to rotating by 2

        assertEquals(expected, RotateElementInAList.rotateList(list, 7)); // 7 % 5 = 2
    }

    @Test
    void testRotateListWithEmptyList() {
        List<Integer> list = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();

        assertEquals(expected, RotateElementInAList.rotateList(list, 3));
    }

    @Test
    void testRotateListWithSingleElement() {
        List<Integer> list = Arrays.asList(42);
        List<Integer> expected = Arrays.asList(42);

        assertEquals(expected, RotateElementInAList.rotateList(list, 1));
    }
}
