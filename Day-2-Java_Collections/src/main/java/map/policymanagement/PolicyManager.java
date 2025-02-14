package map.policy.management.system;

import java.util.*;

public class PolicyManager {

    public Map<String, InsurancePolicy> hashMap = new HashMap<>();
    private Map<String, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();
    public TreeMap<Date, InsurancePolicy> treeMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = calendar.getTime();

        System.out.println("Policies Expiring Soon (Next 30 Days):");
        treeMap.subMap(today, threshold).values().forEach(System.out::println);
    }

    public void displayPoliciesByHolder(String holderName) {
        System.out.println("Policies for: " + holderName);
        hashMap.values().stream()
                .filter(policy -> policy.getPolicyholderName().equalsIgnoreCase(holderName))
                .forEach(System.out::println);
    }

    public void removeExpiredPolicies() {
        Date today = new Date();
        treeMap.headMap(today).clear();
        hashMap.values().removeIf(policy -> policy.getExpiryDate().before(today));
        linkedHashMap.values().removeIf(policy -> policy.getExpiryDate().before(today));
        System.out.println("Expired policies removed.");
    }
}
