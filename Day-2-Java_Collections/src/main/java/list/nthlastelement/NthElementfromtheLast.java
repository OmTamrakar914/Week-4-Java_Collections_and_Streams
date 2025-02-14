package list.last.nth.element;
import static java.lang.System.*;

import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;

public class NthElementfromtheLast {

    public static int nthLastElement(LinkedList<Integer> list,int position){
        int i=0;
        LinkedList<Integer> temp = new LinkedList<>();
                temp.addAll(list);
        while(!temp.isEmpty()){
            if(i==position-1){
                return temp.getLast();
            }
            temp.pollLast();
            i++;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        out.println("Enter the Elements of LinkedList : ");
        for(int i=0; i<5; i++){
            int n = sc.nextInt();
            list.add(n);
        }

        out.println("Enter the nth element from the last to retrieve : ");
        int element = sc.nextInt();
        out.println(nthLastElement(list,element));
    }
}
