package advanceproblemstest.validatecreditcardtest;
import static org.junit.jupiter.api.Assertions.*;

import advancedproblems.validatecreditcard.ValidateCreditCard;
import org.junit.jupiter.api.Test;

public class ValidateCreditCardTest {
    @Test
    void testWithValidCardnumber(){
        String cardNumber = "4123456788012345";
        assertTrue(ValidateCreditCard.validateCreditCard(cardNumber));
    }

    @Test
    void testWithValidCardnumber_1(){
        String cardNumber = "9123456788012345";
        assertFalse(ValidateCreditCard.validateCreditCard(cardNumber));
    }
}
