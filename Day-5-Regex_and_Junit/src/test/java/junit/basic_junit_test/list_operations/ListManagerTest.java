package junit.basic_junit_test.list_operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListManagerTest {
    private ListManager listManager;
    List<Integer> list;

    @BeforeEach
    void setUp(){
        listManager=new ListManager();
        list=new ArrayList<>();
    }

    @Test
    @DisplayName("Test: for addition method")
    void testCase1(){
        listManager.addElement(list,1);
        listManager.addElement(list,10);
        listManager.addElement(list,20);

        List<Integer> expected= Arrays.asList(1,10,20);
        assertEquals(expected,list);
    }

    @Test
    @DisplayName("Test: for remove method")
    void testCase2(){
        list.addAll(Arrays.asList(1,20,10));
        listManager.removeElement(list,10);

        List<Integer> expected= Arrays.asList(1,20);
        assertEquals(expected,list);
    }

    @Test
    @DisplayName("Test: for getSize method")
    void testCase3(){
        list.addAll(Arrays.asList(1,10,20,30,40));
        int actual=listManager.getSize(list);
        assertEquals(5,actual);

        listManager.removeElement(list,10);
        actual=listManager.getSize(list);
        assertEquals(4,actual);
    }
}
