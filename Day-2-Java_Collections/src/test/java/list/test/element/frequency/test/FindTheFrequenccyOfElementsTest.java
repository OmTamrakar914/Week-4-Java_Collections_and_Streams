package list.test.element.frequency.test;

import static org.junit.jupiter.api.Assertions.*;

import list.elementfrequency.FindTheFrequenccyOfElements;
import org.junit.jupiter.api.Test;
import java.util.*;

class FindTheFrequenccyOfElementsTest {

    @Test
    void testCountFrequencyWithRepeatedElements() {
        List<String> list = Arrays.asList("apple", "banana", "orange", "apple", "orange");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 2);

        assertEquals(expected, FindTheFrequenccyOfElements.countFrequency(list));
    }

    @Test
    void testCountFrequencyWithUniqueElements() {
        List<String> list = Arrays.asList("mango", "grape", "kiwi");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("mango", 1);
        expected.put("grape", 1);
        expected.put("kiwi", 1);

        assertEquals(expected, FindTheFrequenccyOfElements.countFrequency(list));
    }

    @Test
    void testCountFrequencyWithEmptyList() {
        List<String> list = Collections.emptyList();
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, FindTheFrequenccyOfElements.countFrequency(list));
    }

    @Test
    void testCountFrequencyWithAllSameElements() {
        List<String> list = Arrays.asList("pear", "pear", "pear", "pear");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("pear", 4);

        assertEquals(expected, FindTheFrequenccyOfElements.countFrequency(list));
    }

    @Test
    void testCountFrequencyWithCaseSensitivity() {
        List<String> list = Arrays.asList("Apple", "apple", "APPLE");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Apple", 1);
        expected.put("apple", 1);
        expected.put("APPLE", 1);

        assertEquals(expected, FindTheFrequenccyOfElements.countFrequency(list));
    }
}
