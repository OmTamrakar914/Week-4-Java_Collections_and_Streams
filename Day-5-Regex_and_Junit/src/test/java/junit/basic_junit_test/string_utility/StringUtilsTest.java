package junit.basic_junit_test.string_utility;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    @DisplayName("Test: for reverse method")
    void testCase1(){
        String str="hello";
        String actual=StringUtils.reverse(str);
        String expected="olleh";
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test: for is palindrome method(true)")
    void testCase2(){
        String str="abba";
        boolean check=StringUtils.isPalindrome(str);
        assertTrue(check);
    }

    @Test
    @DisplayName("Test: for is palindrome method(false)")
    void testCase3(){
        String str="hello";
        boolean check=StringUtils.isPalindrome(str);
        assertFalse(check);
    }

    @Test
    @DisplayName("Test: for to uppercase method")
    void testCase4(){
        String str="hello";
        String actual=StringUtils.toUpperCase(str);
        String expected="HELLO";
        assertEquals(expected,actual);
    }

}
