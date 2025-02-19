package annotation.exercise.exercise5;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class RepeatableAnnotationExampleTest {

    @Test
    void testBugReportAnnotationsPresenceAndValues() throws NoSuchMethodException {
        Method method = TaskBug.class.getMethod("checkReport");
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        assertEquals(2, bugReports.length, "There should be exactly 2 BugReport annotations");

        assertEquals("Null pointer exception occurs when input is null", bugReports[0].description(),
                "First bug report description should match");

        assertEquals("InputMismatchException occurs when wrong type of input is given", bugReports[1].description(),
                "Second bug report description should match");
    }
}
