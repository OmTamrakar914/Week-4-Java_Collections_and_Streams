package junit.advance_junit_test.date_formatter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

    @Test
    void testValidDate() {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("15-02-2025");
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("2025/02/15");
        });
        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }

}
