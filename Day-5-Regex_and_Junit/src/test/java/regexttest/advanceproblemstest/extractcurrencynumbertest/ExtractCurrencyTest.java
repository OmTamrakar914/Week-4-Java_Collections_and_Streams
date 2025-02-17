package advanceproblemstest.extractcurrencynumbertest;

import advancedproblems.extractcurrencynumbers.ExtractCurrencyNumbers;
import extractionproblems.extractdates.ExtractingDates;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractCurrencyTest {
    @Test
    void testExtractCurrency_1(){
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> currency = Arrays.asList("$45.99", "10.50");
        assertEquals(currency, ExtractCurrencyNumbers.extractCurrency(text));
    }
    @Test
    void testExtractCurrency_2(){
        String text = "The price is $45.99, 67.99, $5.99, and the discount is 10.50.";
        List<String> currency = Arrays.asList("$45.99","67.99","$5.99","10.50");
        assertEquals(currency, ExtractCurrencyNumbers.extractCurrency(text));
    }
}
