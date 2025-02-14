package map.test.key.with.highest.value.test;

import static org.junit.jupiter.api.Assertions.*;

import map.keywithhighestvalue.KeyWithTheHighestValue;
import org.junit.jupiter.api.Test;
import java.util.*;

class KeyWithTheHighestValueTest {

    @Test
    void testMaxValueKeyWithMultipleEntries() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 15);
        input.put("C", 20);
        input.put("D", 17);

        assertEquals("C", KeyWithTheHighestValue.maxvalueKey(input));
    }

    @Test
    void testMaxValueKeyWithSingleEntry() {
        Map<String, Integer> input = new HashMap<>();
        input.put("X", 50);

        assertEquals("X", KeyWithTheHighestValue.maxvalueKey(input));
    }

    @Test
    void testMaxValueKeyWithEmptyMap() {
        Map<String, Integer> input = new HashMap<>();
        assertEquals("", KeyWithTheHighestValue.maxvalueKey(input));
    }

    @Test
    void testMaxValueKeyWithNegativeValues() {
        Map<String, Integer> input = new HashMap<>();
        input.put("P", -5);
        input.put("Q", -10);
        input.put("R", -2);

        assertEquals("R", KeyWithTheHighestValue.maxvalueKey(input));
    }

    @Test
    void testMaxValueKeyWithDuplicateMaxValues() {
        Map<String, Integer> input = new HashMap<>();
        input.put("M", 30);
        input.put("N", 40);
        input.put("O", 40);  // Duplicate max value

        assertEquals("N", KeyWithTheHighestValue.maxvalueKey(input));  // Returns the first occurrence
    }
}

