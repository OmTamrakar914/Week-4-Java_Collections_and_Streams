package reflection.basic_level.access_private_field;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void accessingPrivateFields() throws Exception {
        String className = "reflection.basic_level.access_private_field.Person";
        try {
            Person p=new Person(18);
            Class<?> cls = Class.forName(className);
            //getting private field
            Field field=cls.getDeclaredField("age");

            //setting it accessibility
            field.setAccessible(true);

            System.out.println("Old value: " + field.get(p));
            field.set(p,20);
            System.out.println("New value: " + field.get(p));

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found : " + className);
            throw e;
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found : age");
            throw e;
        }
    }

    public static void main(String[] args) throws Exception {
        accessingPrivateFields();
    }
}
