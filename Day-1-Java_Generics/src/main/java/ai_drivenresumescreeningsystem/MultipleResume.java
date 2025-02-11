package ai_drivenresumescreeningsystem;

import java.util.List;

public class MultipleResume {
    public static <T extends JobRole> void processMultipleResume(List<T> resumes){
        System.out.println("Processing multiple resume.\n");
        for(T resume:resumes){
            resume.displayDetails();
        }
    }
}
