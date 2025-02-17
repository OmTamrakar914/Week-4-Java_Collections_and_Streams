package advanceproblemstest.socialsecuritynumbertest;
import static org.junit.jupiter.api.Assertions.*;

import advancedproblems.socialsecuritynumber.ValidateSocialSecurityNumber;
import org.junit.jupiter.api.Test;

public class ValidateSecurityNumberTest {
    @Test
    void testWithValidnumber(){
        String text = "My SSN is 123-45-6789.";
        assertTrue(ValidateSocialSecurityNumber.validateSecurityNumber(text));
    }

    @Test
    void testWithInvalidnumber(){
        String text = "My SSN is 12563-45-6789.";
        assertFalse(ValidateSocialSecurityNumber.validateSecurityNumber(text));
    }
}
