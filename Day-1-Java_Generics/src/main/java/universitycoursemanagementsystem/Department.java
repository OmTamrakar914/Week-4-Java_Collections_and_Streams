package universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Course> courses;

    public Department(){
        courses=new ArrayList<>();
    }

    public void addCourse(Course course){
      courses.add(course);
    }

    public void displayDetails(){
        System.out.println("-----Department Course Details-----\n");
        for(Course course: courses) {
            System.out.println("name   :" + course.getName());
            System.out.println("Fees   :" + course.getFees());
            course.getEvaluation();
            System.out.println();
        }
    }



}
