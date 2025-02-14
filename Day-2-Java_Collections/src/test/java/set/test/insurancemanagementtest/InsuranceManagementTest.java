package set.test.insurance.manaagement.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import set.insurance.policy.management.Policy;
import set.insurance.policy.management.PolicyManager;

import java.util.Calendar;
import java.util.Date;

class PolicyManagerTest {
    private PolicyManager manager;
    private Calendar cal;

    @BeforeEach
    void setUp() {
        manager = new PolicyManager();
        cal = Calendar.getInstance();
    }

    @Test
    void testAddPolicy() {
        cal.set(2025, Calendar.JANUARY, 15);
        Policy policy = new Policy("P123", "Alice", cal.getTime(), "Health", 5000);
        manager.addPolicy(policy);

        assertFalse(manager.hashSet.isEmpty());
        assertFalse(manager.linkedHashSet.isEmpty());
        assertFalse(manager.treeSet.isEmpty());
    }

    @Test
    void testFindDuplicatePolicies() {
        cal.set(2024, Calendar.FEBRUARY, 28);
        Policy policy1 = new Policy("P124", "Bob", cal.getTime(), "Auto", 7000);
        Policy policy2 = new Policy("P124", "David", cal.getTime(), "Auto", 7000); // Duplicate

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);

        // Capture output using System.out
        manager.findDuplicatePolicies(); // Check console for expected output manually
    }

    @Test
    void testDisplayByCoverageType() {
        cal.set(2024, Calendar.DECEMBER, 20);
        Policy policy = new Policy("P125", "Charlie", cal.getTime(), "Home", 6000);
        manager.addPolicy(policy);

        // Capture output using System.out
        manager.displayByCoverageType("Home"); // Check console for expected output manually
    }

    @Test
    void testDisplayExpiringSoon() {
        cal.add(Calendar.DAY_OF_YEAR, 10);
        Policy policy = new Policy("P126", "Emma", cal.getTime(), "Health", 8000);
        manager.addPolicy(policy);


        manager.displayExpiringSoon();
    }
}
