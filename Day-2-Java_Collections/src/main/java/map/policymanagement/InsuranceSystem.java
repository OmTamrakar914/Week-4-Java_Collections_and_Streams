package map.policy.management.system;

import java.util.Calendar;

public class InsuranceSystem {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.JANUARY, 15);
        manager.addPolicy(new InsurancePolicy("P123", "Alice", cal.getTime(), "Health", 5000));

        cal.set(2024, Calendar.FEBRUARY, 28);
        manager.addPolicy(new InsurancePolicy("P124", "Bob", cal.getTime(), "Auto", 7000));

        cal.set(2024, Calendar.DECEMBER, 20);
        manager.addPolicy(new InsurancePolicy("P125", "Charlie", cal.getTime(), "Home", 6000));

        manager.displayExpiringSoon();
        manager.displayPoliciesByHolder("Bob");
        manager.removeExpiredPolicies();
    }
}
