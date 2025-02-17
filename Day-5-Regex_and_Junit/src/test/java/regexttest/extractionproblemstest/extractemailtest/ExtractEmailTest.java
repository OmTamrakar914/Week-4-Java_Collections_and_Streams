package extractionproblemstest.extractemailtest;

import extractionproblems.extractemailsfromtext.ExtractAllEmailsfromText;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExtractEmailTest {
    @Test
    void testextractMails_1(){
        String text = "Contact us at support@example.com and info@company.org";
        List<String> dates = Arrays.asList("support@example.com", "info@company.org");
        assertEquals(dates, ExtractAllEmailsfromText.extractEmails(text));
    }
    @Test
    void testextractMails_2(){
        String text = "Contact us at omtamrakar@gmail.com, support@example.com and info@company.org";
        List<String> dates = Arrays.asList("omtamrakar@gmail.com", "support@example.com", "info@company.org");
        assertEquals(dates, ExtractAllEmailsfromText.extractEmails(text));
    }

}
