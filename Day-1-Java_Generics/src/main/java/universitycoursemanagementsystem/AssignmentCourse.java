package universitycoursemanagementsystem;

public class AssignmentCourse extends CourseType{
    public AssignmentCourse(String name, double fees){
        super(name,fees);
    }

    @Override
    public void evaluate(){
        System.out.println(getName() + ", is evaluated based on assignment.");
    }
}
