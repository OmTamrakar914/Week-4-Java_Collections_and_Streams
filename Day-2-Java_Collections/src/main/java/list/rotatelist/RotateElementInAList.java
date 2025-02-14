package list.rotate.list;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementInAList {
    public static List<Integer> rotateList(List<Integer> list,int position){
        List<Integer> newList = new ArrayList<>();
        int n = list.size();

        for(int i=position; i<n ; i++){
            newList.add(list.get(i));
        }
        for(int i=0; i<position; i++){
            newList.add(list.get(i));
        }
        return newList;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        int position = 3;
        out.println("original list :");
        out.println(list);
        out.println("Rotated list with position 3 :");
        out.println(rotateList(list,3));
    }
}
