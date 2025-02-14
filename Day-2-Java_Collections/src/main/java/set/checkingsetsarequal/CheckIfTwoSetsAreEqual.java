package set.checking.set.are.equal;
import java.util.*;

import static java.lang.System.*;

public class CheckIfTwoSetsAreEqual {
    public static boolean checkEqual(Set<Integer> set1, Set<Integer> set2){
        for(Integer i : set1){
            if(!set2.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        Integer arr[] = {1,3,5,7,2,4,6,8};

        // Two different ways to initialize set
        // first by Collections.addAll method
        Set<Integer> set1 = Collections.<Integer> emptySet();
        Collections.addAll(set1 = new HashSet<Integer>(Arrays.asList(arr)));

        //second by Making a unmodifiableSet with Collections
        Set<Integer> set2 = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(arr)));

        out.println("Checking the two sets are equal or not :");
        out.println(set1);
        out.println(set2);
        if(checkEqual(set1,set2)){
            out.println("The two sets are equal!");
        }
        else out.println("The two sets are not equal!");

    }
}
