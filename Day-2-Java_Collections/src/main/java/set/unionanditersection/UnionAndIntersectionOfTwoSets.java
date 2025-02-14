package set.union.and.intersection;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class UnionAndIntersectionOfTwoSets {
    public static Set<Integer> unionSet(Set<Integer> set1 , Set<Integer> set2){
        Set<Integer> union = new HashSet<>();
        for(Integer i : set1){
            union.add(i);
        }
        for(Integer i : set2){
            if(!(union.contains(i))){
                union.add(i);
            }
        }
        return union;
    }

    public static Set<Integer> intersectionSet(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersection = new HashSet<>();
        for(Integer i : set1){
            if(set2.contains(i)){
                intersection.add(i);
            }
        }
        return intersection;
    }

    public static void main(String[] args){

    Integer arr[] = {1,3,5,7,9,2,4,};
    Integer arr2[] = {3,5,4,10,12,4,18};

    Set<Integer> set1 = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(arr)));

    Set<Integer> set2 = Collections.unmodifiableSet(new HashSet<Integer>(Arrays.asList(arr2)));

    out.println("The two sets are : ");
     for(Integer i : arr)  out.print(i+" ");
     out.println();
     for(Integer i : arr2)  out.print(i+" ");
     out.println();
      System.out.println("The union of two : ");
      out.println(unionSet(set1,set2));
      out.println("The intersection of two set : ");
      out.println(intersectionSet(set1,set2));
    }
}
