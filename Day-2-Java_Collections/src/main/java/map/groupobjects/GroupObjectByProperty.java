package map.groupobjects;

import java.util.*;

public class GroupObjectByProperty {

    public static Map<String,List<String>> groupObjects(List<Employee> list){

        Map<String,List<String>> map = new HashMap<>();


        for(Employee employee : list){
            if(map.containsKey(employee.getDepartment())){
                map.get(employee.getDepartment()).add(employee.getName());
            }
            else{
                ArrayList<String> newlist = new ArrayList<>();
                newlist.add(employee.getName());
                map.put(employee.getDepartment(),newlist);
            }
        }

        return map;
    }

    public static void main(String[]args){
        GroupObjectByProperty group = new GroupObjectByProperty();

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice","HR"));
        list.add(new Employee("Bob","IT"));
        list.add(new Employee("Carol","HR"));

        System.out.println("The List of Employees : ");
        for(Employee i : list )System.out.print(" ["+i.getDepartment()+" = "+i.getName()+" ]");
        System.out.println();

        System.out.println("The list of grouped employees : ");
        System.out.println(group.groupObjects(list));
    }
}
