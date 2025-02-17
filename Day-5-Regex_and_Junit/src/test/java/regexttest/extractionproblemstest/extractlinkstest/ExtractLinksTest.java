package extractionproblemstest.extractlinkstest;

import extractionproblems.extractlinks.ExtractLinksFromWebPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class ExtractLinksTest {
    @Test
    void testextractLinks_1(){
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> list = Arrays.asList("https://www.google.com","http://example.org");
        assertEquals(list, ExtractLinksFromWebPage.extractLinks(text));
    }

    @Test
    void testextractLinks_2(){
        String text = "Visit https://www.google.com, https://www.gmail.com, https://www.apple.com and http://example.org for more info.";
        List<String> list = Arrays.asList("https://www.google.com","https://www.gmail.com","https://www.apple.com", "http://example.org");
        assertEquals(list, ExtractLinksFromWebPage.extractLinks(text));
    }
}
