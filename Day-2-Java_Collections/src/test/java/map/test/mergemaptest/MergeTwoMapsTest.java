package map.test.merge.map.test;

import static org.junit.jupiter.api.Assertions.*;

import map.mergemap.MergeTwoMaps;
import org.junit.jupiter.api.Test;
import java.util.*;

class MergeTwoMapsTest {

    @Test
    void testMergeMapWithOverlappingKeys() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 1);
        expected.put("B", 5);  // 2 + 3 = 5
        expected.put("C", 4);

        assertEquals(expected, MergeTwoMaps.mergeMap(map1, map2));
    }

    @Test
    void testMergeMapWithNonOverlappingKeys() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("X", 10);
        map1.put("Y", 20);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Z", 30);
        map2.put("W", 40);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("X", 10);
        expected.put("Y", 20);
        expected.put("Z", 30);
        expected.put("W", 40);

        assertEquals(expected, MergeTwoMaps.mergeMap(map1, map2));
    }

    @Test
    void testMergeMapWithEmptyFirstMap() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("P", 5);
        map2.put("Q", 15);

        Map<String, Integer> expected = new HashMap<>(map2);

        assertEquals(expected, MergeTwoMaps.mergeMap(map1, map2));
    }

    @Test
    void testMergeMapWithEmptySecondMap() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("R", 25);
        map1.put("S", 35);
        Map<String, Integer> map2 = new HashMap<>();

        Map<String, Integer> expected = new HashMap<>(map1);

        assertEquals(expected, MergeTwoMaps.mergeMap(map1, map2));
    }

    @Test
    void testMergeMapWithBothEmptyMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, MergeTwoMaps.mergeMap(map1, map2));
    }
}
