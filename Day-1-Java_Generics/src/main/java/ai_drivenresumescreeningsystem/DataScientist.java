package ai_drivenresumescreeningsystem;

public class DataScientist extends JobRole{
    public DataScientist(String candidateName, int experience){
        super(candidateName,experience);
    }

    @Override
    public void displayDetails(){
        System.out.println("Data Scientist  : " + getName());
        System.out.println("Experience      : " + getExperience() + " years\n");
    }
}
