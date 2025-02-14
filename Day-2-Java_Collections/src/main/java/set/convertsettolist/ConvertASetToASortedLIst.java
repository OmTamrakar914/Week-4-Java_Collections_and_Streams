package set.convert.set.to.list;
import java.util.*;

import static java.lang.System.*;

public class ConvertASetToASortedLIst {
    public static List<Integer> sortedList(Set<Integer> set){
      ArrayList<Integer> list = new ArrayList<>(set);
         Collections.sort(list);
         return list;
    }
    public static void main(String[]args){
        Integer []arr = {5,6,3,4,0,7,3,4,2,4,7,2,7,1};

        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        out.println("The Unsorted Set is : ");
        out.println(set);
        out.println("The Sorted List : ");
        out.println(sortedList(set));

    }
}
