package reflection.basic_level.dynamically_create_objects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DynamicCreateObject {

    public static void dynamicObjectCreate() throws Exception {
        String classPath="reflection.basic_level.dynamically_create_objects.Student";
        try {
            Class<?> cls = Class.forName(classPath);
            Constructor<?> constructor=cls.getConstructor(String.class,int.class);

            //creating object
            Student stu=(Student) constructor.newInstance("Anush",20);
            stu.display();

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            System.out.println("Class not found.");
            throw e;
        }
    }

    public static void main(String[] args) throws Exception {
        dynamicObjectCreate();
    }
}
