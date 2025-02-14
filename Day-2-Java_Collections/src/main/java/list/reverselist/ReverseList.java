package list.reverse.list;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class ReverseList {
    public static List<Integer> reverseList(List<Integer> list){
        List<Integer> reversedlist = new ArrayList<>();

        int size = list.size();

        for(int i = size-1; i>=0; i--){
            reversedlist.add(list.get(i));
        }
        return reversedlist;
    }

    public static LinkedList<Integer> reverseLinkedList(List<Integer> list){
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();

        int size = list.size();

        for(int i=0;  i<size; i++){
            reversedLinkedList.addFirst(list.get(i));
        }
        return reversedLinkedList;
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        out.println("List before reversing order: ");
        out.println(list);

        List<Integer> newReturnedList = reverseList(list);
        out.println("Reversed ArrayList : ");
        out.println(newReturnedList);

        LinkedList<Integer> newReturnLinkedList = reverseLinkedList(list);
        out.println("Reversed LinkedList : ");
        out.println(newReturnLinkedList);
    }
}
