package ai_drivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String candidateName, int experience){
        super(candidateName,experience);
    }

    @Override
    public void displayDetails(){
        System.out.println("Software Engineer : " + getName());
        System.out.println("Experience        : " + getExperience() + " years\n");
    }
}
