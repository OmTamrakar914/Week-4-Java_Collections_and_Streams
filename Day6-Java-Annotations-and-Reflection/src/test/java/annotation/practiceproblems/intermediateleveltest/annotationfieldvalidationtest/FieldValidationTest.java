package annotation.practiceproblems.intermediateleveltest.annotationfieldvalidationtest;

import annotation.practiceproblems.intermediatelevel.annotationforfieldvalidation.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FieldValidationTest {
    @Test
    void testValidUsername() {
        assertDoesNotThrow(() -> new User("OmTamrakar")); // Within max length
    }

    @Test
    void testUsernameTooLong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new User("VeryLongUsernameExceedingLimit"));
        assertEquals("Username exceeds maximum length of 10", exception.getMessage());
    }
}
