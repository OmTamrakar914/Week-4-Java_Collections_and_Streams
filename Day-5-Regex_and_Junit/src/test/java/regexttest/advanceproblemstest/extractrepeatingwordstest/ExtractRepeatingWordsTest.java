package advanceproblemstest.extractrepeatingwordstest;

import advancedproblems.extractcurrencynumbers.ExtractCurrencyNumbers;
import advancedproblems.extractrepeatingwords.ExtractingRepeatingWords;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractRepeatingWordsTest {
    @Test
    void testextractRepeatWords_1(){
        String text = "This is is a repeated repeated word test.";
        List<String> repeat = Arrays.asList("is", "repeated");
        assertEquals(repeat, ExtractingRepeatingWords.extractRepeatedWords(text));
    }

    @Test
    void testextractRepeatWords_2(){
        String text = "This This is is a repeated repeated test word test";
        List<String> repeat = new ArrayList<>();
               repeat.addAll( Arrays.asList("test","This","is","repeated"));
        assertArrayEquals(ExtractingRepeatingWords.extractRepeatedWords(text).toArray(),repeat.toArray());
    }
}
