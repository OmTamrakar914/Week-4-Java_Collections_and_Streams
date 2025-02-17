package basicsregexproblemstest.validateusernametest;
import static org.junit.jupiter.api.Assertions.*;

import basicregexproblems.validateusername.ValidateAUsername;
import org.junit.jupiter.api.Test;

public class ValidateUsernameTest {
    @Test
    void testvalidUsername(){
        String username = "Ramgopal";
        //checking response on the giving valid username;
        assertTrue(ValidateAUsername.validateAUsername(username));
    }

    @Test
    void testInvalidUsername_1(){
        String username = "2shyam";
        //giving an invalid username starting with number
        assertFalse(ValidateAUsername.validateAUsername(username));
    }
    @Test
    void testInvalidUsername_2(){
        String username = "Om";
        //giving an invalid username size less than 4 characters
        assertFalse(ValidateAUsername.validateAUsername(username));
    }
    @Test
    void testInvalidUsername_3(){
        String username = "Om123*$#";
        //giving an invalid username with special characters
        assertFalse(ValidateAUsername.validateAUsername(username));
    }

}
