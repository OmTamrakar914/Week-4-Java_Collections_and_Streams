package basicsregexproblemstest.validatehexcodetest;
import static org.junit.jupiter.api.Assertions.*;

import basicregexproblems.hexcode.ValidateAHexColorCode;
import org.junit.jupiter.api.Test;

public class ValidateHexcodeTest {
    @Test
    void testinvalidHexCode(){
        String code = "#123";
        assertFalse(ValidateAHexColorCode.validateHexCode(code));
    }

    @Test
    void testvalidHexCode(){
        String code = "#FFA500";
        assertTrue(ValidateAHexColorCode.validateHexCode(code));
    }
}
