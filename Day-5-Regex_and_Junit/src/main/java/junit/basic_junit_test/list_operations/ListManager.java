package junit.basic_junit_test.list_operations;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    public void addElement(List<Integer> list, int element){
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==element){
                list.remove(i);
                return;
            }
        }
        System.out.println("List does not contain that element.");
    }

    public int getSize(List<Integer> list){
         return list.size();
    }

    public static void main(String[] args) {
        ListManager obj=new ListManager();
        List<Integer> list=new ArrayList<>();

        obj.addElement(list,1);
        obj.addElement(list,5);
        obj.addElement(list,3);
        obj.addElement(list,9);
        obj.addElement(list,7);

        obj.removeElement(list,7);
        System.out.println("size of list : " + obj.getSize(list));
    }
}
