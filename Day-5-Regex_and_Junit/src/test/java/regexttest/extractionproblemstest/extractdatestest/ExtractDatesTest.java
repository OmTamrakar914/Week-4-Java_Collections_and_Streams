package extractionproblemstest.extractdatestest;

import extractionproblems.extractdates.ExtractingDates;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ExtractDatesTest {
    @Test
    void testextractDates_1(){
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020, 30/03/2025.";
        List<String> dates = Arrays.asList("12/05/2023", "15/08/2024", "29/02/2020", "30/03/2025");
        assertEquals(dates, ExtractingDates.extractDates(text));
    }
    @Test
    void testextractDates_2(){
        String text = "The events are scheduled for 29/02/2020, 30/03/2025.";
        List<String> dates = Arrays.asList("29/02/2020", "30/03/2025");
        assertEquals(dates, ExtractingDates.extractDates(text));
    }
}
