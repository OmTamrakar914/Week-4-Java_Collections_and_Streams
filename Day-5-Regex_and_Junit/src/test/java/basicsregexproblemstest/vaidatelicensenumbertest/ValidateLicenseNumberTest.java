package basicsregexproblemstest.vaidatelicensenumbertest;
import static org.junit.jupiter.api.Assertions.*;

import basicregexproblems.validatelicenseplatenumber.ValidateLicensePlateNumber;
import basicregexproblems.validateusername.ValidateAUsername;
import org.junit.jupiter.api.Test;

public class ValidateLicenseNumberTest {
    @Test
    void testValidNumber_1(){
        String number = "MP2835";
        assertTrue(ValidateLicensePlateNumber.validateLicenseNumber(number));
    }

    @Test
    void testInvalidNumber_2(){
        String number = "Mp1234"; // Invalid : first two character should be Capital
        assertFalse(ValidateLicensePlateNumber.validateLicenseNumber(number));
    }
    @Test
    void testInvalidNumber_3(){
        String number = "MP1234765";// Invalid : numbers are more than four
        assertFalse(ValidateLicensePlateNumber.validateLicenseNumber(number));
    }


}
