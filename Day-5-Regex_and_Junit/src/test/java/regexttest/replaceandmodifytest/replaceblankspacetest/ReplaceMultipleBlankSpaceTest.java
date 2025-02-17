package replaceandmodifytest.replaceblankspacetest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import replaceandmodify.replacemultipleblankspace.ReplaceAndModifyStrings;

public class ReplaceMultipleBlankSpaceTest {
    @Test
    void testreplaceBlankSpace_1(){
        String text = "This    is  an     example   with  multiple spaces.";
        String newString = "This is an example with multiple spaces.";
        assertEquals(newString, ReplaceAndModifyStrings.modifyString(text));
    }
    @Test
    void testreplaceBlankSpace_2(){
        String text = "This    is  an   example   with  multiple                           spaces.";
        String newString = "This is an example with multiple spaces.";
        assertEquals(newString, ReplaceAndModifyStrings.modifyString(text));
    }
}
