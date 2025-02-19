package annotation.exercise.exercise4;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {

    String priority();
    String assignedTO();
}

public class TaskManager {
    @TaskInfo(priority = "High", assignedTO = "Om Tamrakar")
    public void completedTask(){
        System.out.println("The task completed!");
    }
}
