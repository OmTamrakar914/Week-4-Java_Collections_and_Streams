package advanceproblemstest.extractlanguagestest;

import advancedproblems.extractcurrencynumbers.ExtractCurrencyNumbers;
import advancedproblems.extractlanguagenames.ExtractProgramLangNames;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractLanguagesTest {
    @Test
    void testextractlang_1(){
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> lang = Arrays.asList("Java", "Python","JavaScript","Go");
        assertArrayEquals(lang.toArray(), ExtractProgramLangNames.extractNames(text).toArray());
    }
    @Test
    void testextractlang_2(){
        String text = "I love Java, Ruby, and C++, but I haven't tried Go yet.";
        List<String> lang = Arrays.asList("Java", "Ruby","C++","Go");
        assertArrayEquals(lang.toArray(), ExtractProgramLangNames.extractNames(text).toArray());
    }
}
