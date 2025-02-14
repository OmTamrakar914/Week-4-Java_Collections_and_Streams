package set.insurance.policy.management;
import java.util.*;

public class PolicyManager {
    public Set<Policy> hashSet = new HashSet<>();
    public Set<Policy> linkedHashSet = new LinkedHashSet<>();
    public Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Policies (HashSet): " + hashSet);
        System.out.println("All Policies (LinkedHashSet): " + linkedHashSet);
        System.out.println("All Policies (TreeSet - Sorted by Expiry Date): " + treeSet);
    }

    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = calendar.getTime();

        System.out.println("Policies Expiring Soon (Next 30 Days):");
        for (Policy policy : treeSet) {
            if (policy.getExpiryDate().after(today) && policy.getExpiryDate().before(threshold)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        for (Policy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        Set<Policy> duplicates = new HashSet<>();
        for (Policy policy : hashSet) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        System.out.println("Duplicate Policies: " + duplicates);
    }
}
