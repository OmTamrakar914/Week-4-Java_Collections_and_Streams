package bothcheckanduncheckexceptiontest;

import bothcheckedanduncheckedexception.BankTransactionSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BankTransactionSystemTest {

    @Test
    void testvalidWithdrawl(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        BankTransactionSystem.withdraw(500);
        assertTrue(output.toString().contains("Withdrawal successful, new balance: 500"));
    }

    @Test
    void testInvalidAmount(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        BankTransactionSystem.withdraw(-100);
        assertTrue(output.toString().contains("Invalid amount!"));
    }

    @Test
    void testLessBalance(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        BankTransactionSystem.withdraw(2000);
        assertTrue(output.toString().contains("Insufficient balance!"));
    }
}
