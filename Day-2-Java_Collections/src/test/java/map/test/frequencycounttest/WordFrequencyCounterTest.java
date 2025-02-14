package map.test.frequency.count.test;

import static org.junit.jupiter.api.Assertions.*;

import map.frequencycount.WordFrequencyCounter;
import org.junit.jupiter.api.Test;
import java.util.*;

class WordFrequencyCounterTest {

    @Test
    void testWordFrequencyWithNormalText() {
        String text = "hello world hello";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);


        assertEquals(expected, WordFrequencyCounter.wordFrequency(text));
    }

    @Test
    void testWordFrequencyWithPunctuation() {
        String text = "hello, world! hello.";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("hello,", 1);
        expected.put("hello.", 1);
        expected.put("world!", 1);

        assertEquals(expected, WordFrequencyCounter.wordFrequency(text));
    }

    @Test
    void testWordFrequencyWithEmptyString() {
        String text = "";
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, WordFrequencyCounter.wordFrequency(text));
    }

    @Test
    void testWordFrequencyWithSingleWord() {
        String text = "Java";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Java", 1);

        assertEquals(expected, WordFrequencyCounter.wordFrequency(text));
    }

    @Test
    void testWordFrequencyWithCaseSensitivity() {
        String text = "Java java JAVA";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Java", 1);
        expected.put("java", 1);
        expected.put("JAVA", 1);

        assertEquals(expected, WordFrequencyCounter.wordFrequency(text));
    }
}
