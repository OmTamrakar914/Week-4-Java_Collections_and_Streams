package set.symmetricdiiference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.*;

public class SymmetricDifference {
    public static Set<Integer> symmetricSet(Set<Integer>set1, Set<Integer>set2){
        Set<Integer> newSet = new HashSet<>();

        for(Integer i : set1){
            if(!set2.contains(i)){
                newSet.add(i);
            }
        }
        for(Integer i: set2){
            if(!set1.contains(i)){
                newSet.add(i);
            }
        }
        return newSet;
    }

    public static void main(String[]args){
        Integer arr[] = {1,2,3};
        Integer arr2[] = {3,4,5};

        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(arr));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(arr2));
        out.println("The two sets are : ");
        out.println(set1);
        out.println(set2);
        out.println("The Symmetric set : ");
        out.println(symmetricSet(set1,set2));

    }
}
