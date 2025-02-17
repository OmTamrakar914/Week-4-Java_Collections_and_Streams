package extractionproblemstest.capitalizedwordstest;

import extractionproblems.capitalizedwords.RetrieveCapitalizedWords;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalizedWordsTest {
    @Test
    void testCapitalizedWords_1(){
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> words = new ArrayList<>(Arrays.asList("The", "Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"));
        assertEquals(words, RetrieveCapitalizedWords.retrieveCapitalWords(text));
    }

    @Test
    void testCapitalizedWords_2(){
        String text = "The Eiffel tower is in paris and the statue of liberty is in New York.";
        List<String> words = new ArrayList<>(Arrays.asList("The", "Eiffel", "New", "York"));
        assertEquals(words, RetrieveCapitalizedWords.retrieveCapitalWords(text));
    }
}
