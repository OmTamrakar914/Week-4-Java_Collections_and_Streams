package ai_drivenresumescreeningsystem;

public class Resume<T extends JobRole>{
    private T jobRole;

    public Resume(T joRole){
        this.jobRole=joRole;
    }

    public void processResume(){
        System.out.println("Processing Resume.");
        jobRole.displayDetails();
    }
}
