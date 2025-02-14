package queue.hospitalpatientprioritysystem;

public class Patient {

    public String patienName;
    public int saverity;

    public Patient(String patienName, int saverity) {
        this.patienName = patienName;
        this.saverity = saverity;
    }

    @Override
    public String toString() {
        return patienName + " (Severity: " + saverity + ")";
    }

}
