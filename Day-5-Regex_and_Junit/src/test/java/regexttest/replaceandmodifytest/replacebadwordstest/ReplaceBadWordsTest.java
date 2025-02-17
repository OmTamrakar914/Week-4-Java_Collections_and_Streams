package replaceandmodifytest.replacebadwordstest;

import org.junit.jupiter.api.Test;
import replaceandmodify.replacebadwords.ReplaceBadWords;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceBadWordsTest {
    @Test
    void testbadwords_1(){
        List<String> badwords = new ArrayList<>(Arrays.asList("damn","stupid"));
        String text = "This is a damn bad example with some stupid words.";
        String withoutBadWords = "This is a **** bad example with some **** words. ";
        assertEquals(withoutBadWords, ReplaceBadWords.replaceBasWords(text,badwords));
    }
    @Test
    void testbadwords_2(){
        List<String> badwords = new ArrayList<>(Arrays.asList("damn","bad","stupid"));
        String text = "This is a damn example bad with some stupid words.";
        String withoutBadWords = "This is a **** example **** with some **** words. ";
        assertEquals(withoutBadWords, ReplaceBadWords.replaceBasWords(text,badwords));
    }
}
