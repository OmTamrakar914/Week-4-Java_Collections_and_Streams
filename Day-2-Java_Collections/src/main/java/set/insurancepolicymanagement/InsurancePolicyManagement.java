package set.insurance.policy.management;

import java.util.Calendar;

public class InsurancePolicyManagement {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        Calendar cal = Calendar.getInstance();

        cal.set(2025, Calendar.JANUARY, 15);
        manager.addPolicy(new Policy("P123", "Alice", cal.getTime(), "Health", 5000));

        cal.set(2024, Calendar.FEBRUARY, 28);
        manager.addPolicy(new Policy("P124", "Bob", cal.getTime(), "Auto", 7000));

        cal.set(2024, Calendar.DECEMBER, 20);
        manager.addPolicy(new Policy("P125", "Charlie", cal.getTime(), "Home", 6000));

        cal.set(2024, Calendar.FEBRUARY, 28);
        manager.addPolicy(new Policy("P124", "David", cal.getTime(), "Auto", 7000)); // Duplicate

        manager.displayAllPolicies();
        manager.displayExpiringSoon();
        manager.displayByCoverageType("Auto");
        manager.findDuplicatePolicies();
    }
}
