package universitycoursemanagementsystem;

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        ExamCourse examCourse1=new ExamCourse("AIML",100000);
        ResearchCourse researchCourse=new ResearchCourse("Disaster management",12000);
        AssignmentCourse assignmentCourse=new AssignmentCourse("Cyber security",15000);

        Course<ExamCourse> course1=new Course<>(examCourse1);
        Course<ResearchCourse> course2=new Course<>(researchCourse);
        Course<AssignmentCourse> course3=new Course<>(assignmentCourse);

        Department department=new Department();
        department.addCourse(course1);
        department.addCourse(course2);
        department.addCourse(course3);

        department.displayDetails();

    }

}
