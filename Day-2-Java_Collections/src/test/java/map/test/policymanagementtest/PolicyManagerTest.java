package map.test.policy.management.system.test;

import static org.junit.jupiter.api.Assertions.*;

import map.policy.management.system.InsurancePolicy;
import map.policy.management.system.PolicyManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class PolicyManagerTest {
    private PolicyManager manager;
    private Calendar cal;

    @BeforeEach
    void setUp() {
        manager = new PolicyManager();
        cal = Calendar.getInstance();
    }

    @Test
    void testAddAndRetrievePolicy() {
        cal.set(2025, Calendar.MARCH, 10);
        InsurancePolicy policy = new InsurancePolicy("P001", "Alice", cal.getTime(), "Health", 4000);

        manager.addPolicy(policy);
        assertEquals(policy, manager.getPolicyByNumber("P001"));
    }

    @Test
    void testDisplayExpiringSoon() {
        cal.set(2024, Calendar.FEBRUARY, 28); // Close to expiry
        InsurancePolicy policy = new InsurancePolicy("P002", "Bob", cal.getTime(), "Auto", 6000);
        manager.addPolicy(policy);

        cal.set(2025, Calendar.DECEMBER, 31); // Far from expiry
        InsurancePolicy policy2 = new InsurancePolicy("P003", "Charlie", cal.getTime(), "Home", 5000);
        manager.addPolicy(policy2);

        // Capture output (mocking display)
        List<InsurancePolicy> expiringSoon = new ArrayList<>(manager.treeMap.subMap(new Date(), cal.getTime()).values());
        assertTrue(expiringSoon.contains(policy));
        assertFalse(expiringSoon.contains(policy2));
    }

    @Test
    void testDisplayPoliciesByHolder() {
        cal.set(2025, Calendar.JUNE, 15);
        InsurancePolicy policy1 = new InsurancePolicy("P004", "Alice", cal.getTime(), "Health", 8000);
        manager.addPolicy(policy1);

        cal.set(2024, Calendar.SEPTEMBER, 10);
        InsurancePolicy policy2 = new InsurancePolicy("P005", "Alice", cal.getTime(), "Auto", 9000);
        manager.addPolicy(policy2);

        cal.set(2025, Calendar.JANUARY, 20);
        InsurancePolicy policy3 = new InsurancePolicy("P006", "Bob", cal.getTime(), "Home", 7000);
        manager.addPolicy(policy3);

        // Capture Alice's policies
        List<InsurancePolicy> alicePolicies = new ArrayList<>();
        manager.hashMap.values().stream()
                .filter(policy -> policy.getPolicyholderName().equalsIgnoreCase("Alice"))
                .forEach(alicePolicies::add);

        assertEquals(2, alicePolicies.size());
        assertTrue(alicePolicies.contains(policy1));
        assertTrue(alicePolicies.contains(policy2));
    }

    @Test
    void testRemoveExpiredPolicies() {
        cal.set(2023, Calendar.DECEMBER, 15); // Already expired
        InsurancePolicy expiredPolicy = new InsurancePolicy("P007", "David", cal.getTime(), "Life", 5000);
        manager.addPolicy(expiredPolicy);

        cal.set(2025, Calendar.JULY, 30); // Still valid
        InsurancePolicy validPolicy = new InsurancePolicy("P008", "Emma", cal.getTime(), "Auto", 6500);
        manager.addPolicy(validPolicy);

        manager.removeExpiredPolicies();

        assertNull(manager.getPolicyByNumber("P007")); // Expired policy should be removed
        assertNotNull(manager.getPolicyByNumber("P008")); // Valid policy should remain
    }
}
