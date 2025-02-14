package set.subsets;
import static java.lang.System.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    public static boolean checkSubset(Set<Integer>set1, Set<Integer>set2){
        return set2.containsAll(set1);
    }
    public static void main(String[] args){
        Integer arr[] = {2,3};
        Integer arr1[] = {1,2,3,4};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr1));

        out.println("The Two set are : ");
        out.println(set1);
        out.println(set2);
        out.println("The Set1 is a subset of Set2 : "+checkSubset(set1,set2));
    }
}
