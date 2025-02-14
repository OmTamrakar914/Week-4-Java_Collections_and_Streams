package map.test.invert.map.test;

import static org.junit.jupiter.api.Assertions.*;

import map.invertmap.InvertaMap;
import org.junit.jupiter.api.Test;
import java.util.*;

class InvertaMapTest {

    @Test
    void testInvertMapWithUniqueValues() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 3);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, Arrays.asList("A"));
        expected.put(2, Arrays.asList("B"));
        expected.put(3, Arrays.asList("C"));

        assertEquals(expected, InvertaMap.invertMap(input));
    }

    @Test
    void testInvertMapWithDuplicateValues() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        input.put("D", 2);
        input.put("E", 3);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, Arrays.asList("A", "C"));
        expected.put(2, Arrays.asList("B", "D"));
        expected.put(3, Arrays.asList("E"));

        assertEquals(expected, InvertaMap.invertMap(input));
    }

    @Test
    void testInvertMapWithEmptyInput() {
        Map<String, Integer> input = new HashMap<>();
        Map<Integer, List<String>> expected = new HashMap<>();

        assertEquals(expected, InvertaMap.invertMap(input));
    }

    @Test
    void testInvertMapWithSingleEntry() {
        Map<String, Integer> input = new HashMap<>();
        input.put("X", 5);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(5, Arrays.asList("X"));

        assertEquals(expected, InvertaMap.invertMap(input));
    }
}

