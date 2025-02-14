package map.test.banking.system.test;

import static org.junit.jupiter.api.Assertions.*;

import map.banking.system.BankingSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class BankingSystemTest {
    private BankingSystem bank;

    @BeforeEach
    void setUp() {
        bank = new BankingSystem();
        bank.createAccount("A101", 5000.00);
        bank.createAccount("A102", 3000.00);
    }

    @Test
    void testCreateAccount() {
        bank.createAccount("A103", 7000.00);
        bank.createAccount("A104", 1000.00);

        Map<String, Double> expectedAccounts = new HashMap<>();
        expectedAccounts.put("A101", 5000.00);
        expectedAccounts.put("A102", 3000.00);
        expectedAccounts.put("A103", 7000.00);
        expectedAccounts.put("A104", 1000.00);

        assertEquals(expectedAccounts, bank.getAccounts());
    }

    @Test
    void testDeposit() {
        bank.deposit("A101", 2000.00);
        assertEquals(7000.00, bank.getAccounts().get("A101"));

        bank.deposit("A102", 1000.00);
        assertEquals(4000.00, bank.getAccounts().get("A102"));
    }

    @Test
    void testDepositForNonExistingAccount() {
        bank.deposit("A999", 500.00);
        assertFalse(bank.getAccounts().containsKey("A999"));
    }

    @Test
    void testWithdrawalRequest() {
        bank.requestWithdrawal("A101");
        bank.requestWithdrawal("A102");

        Queue<String> expectedQueue = new LinkedList<>(Arrays.asList("A101", "A102"));
        assertEquals(expectedQueue, bank.getWithdrawalQueue());
    }

    @Test
    void testWithdrawalProcessing() {
        bank.requestWithdrawal("A101");
        bank.requestWithdrawal("A102");

        bank.processWithdrawals();

        assertTrue(bank.getWithdrawalQueue().isEmpty());
    }
}
