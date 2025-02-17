package advanceproblemstest.validateipaddresstest;
import static org.junit.jupiter.api.Assertions.*;

import advancedproblems.validateanipaddress.ValidateAnIPAddress;
import org.junit.jupiter.api.Test;

public class ValidateIPAddressTest {
    @Test
    void testWithValidAddress(){
        String text = "123.345.456.345";
        assertTrue(ValidateAnIPAddress.validateIPAddress(text));
    }
    @Test
    void testWithInValidAddress(){
        String text = "1275843.345.456.345";
        assertFalse(ValidateAnIPAddress.validateIPAddress(text));
    }
}
