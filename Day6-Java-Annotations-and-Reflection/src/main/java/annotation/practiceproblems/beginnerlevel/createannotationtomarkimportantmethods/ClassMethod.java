package annotation.practiceproblems.beginnerlevel.createannotationtomarkimportantmethods;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class ClassMethod {

    @ImportantMethod(importance = "High")
    public void processOne() {
        System.out.println("Method is Important");
    }
    @ImportantMethod(importance = "Low")
    public void processTwo() {
        System.out.println("Method is not very Important");
    }
}
