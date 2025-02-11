package universitycoursemanagementsystem;

public class ExamCourse extends CourseType{

    public ExamCourse(String name, double fees){
        super(name,fees);
    }

    @Override
    public void evaluate(){
        System.out.println(getName() + ", is evaluated based on exam.");
    }

}
