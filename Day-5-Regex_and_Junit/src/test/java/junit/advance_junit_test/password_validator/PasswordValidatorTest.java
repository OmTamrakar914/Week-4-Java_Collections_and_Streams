package junit.advance_junit_test.password_validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    @DisplayName("Test: password length less than 8")
    void testCase1(){
        String password="abcd123";
        boolean check=PasswordValidator.validator(password);
        assertFalse(check);
    }

    @Test
    @DisplayName("Test: password contain at least 1 uppercase")
    void testCase2(){
        String password="abcd123";
        boolean check=PasswordValidator.validator(password);
        assertFalse(check);
    }

    @Test
    @DisplayName("Test: password contain at least 1 digit")
    void testCase3(){
        String password="abcdcd";
        boolean check=PasswordValidator.validator(password);
        assertFalse(check);
    }

    @Test
    @DisplayName("Test: correct password")
    void testCase4(){
        String password="abcd123AD";
        boolean check=PasswordValidator.validator(password);
        assertTrue(check);
    }
}
