package annotation.exercise.exercise3;

import java.util.ArrayList;

public class Suppresswarning {
    public static void main(String[] args) {

        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList<>();

        list.add(10);
        list.add("Hello");
        list.add(30);

        System.out.println("List items : "+list);
    }
}
