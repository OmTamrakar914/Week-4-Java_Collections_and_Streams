package list.remove.duplicates;
import static java.lang.System.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateswithOrder {

    public static LinkedHashSet<Integer> removeDuplicates(List<Integer> list){
        int size = list.size();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(Integer i : list){
            set.add(i);
        }
        return set;
    }

    public static void main(String[]args){
        List<Integer> list = Arrays.asList(1,3,4,1,5,3,7,8,4);

        out.println("Original list with duplicates : ");
        out.println(list);
        out.println("List without duplicate preserving order : ");
        out.println(removeDuplicates(list));
    }
}
