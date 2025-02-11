package ai_drivenresumescreeningsystem;

public abstract class JobRole {
    private String candidateName;
    private int experience;

    JobRole(String candidateName, int experience){
        this.candidateName=candidateName;
        this.experience=experience;
    }

    public String getName(){
        return candidateName;
    }

    public int getExperience(){
        return experience;
    }

    abstract void displayDetails();
}
