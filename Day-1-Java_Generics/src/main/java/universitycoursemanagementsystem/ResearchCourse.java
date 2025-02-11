package universitycoursemanagementsystem;

public class ResearchCourse extends CourseType{
    public ResearchCourse(String name, double fees){
        super(name,fees);
    }

    @Override
    public void evaluate(){
        System.out.println(getName() + ", is evaluated based on research.");
    }
}
