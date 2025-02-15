package datastreams;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreandRetrievePrimitiveDataTest {

    @Test
    public void testFileCreated() {
        StoreandRetrievePrimitiveData.saveStudent(101, "OM", 9.8);
        File file = new File("studentsdata.txt");
        assertTrue(file.exists()); // Check if file is created
    }

    @Test
    public void testReadStudentDoesNotThrowException() {
        StoreandRetrievePrimitiveData.saveStudent(101, "OM", 9.8);
        StoreandRetrievePrimitiveData.readStudent();
    }
}
