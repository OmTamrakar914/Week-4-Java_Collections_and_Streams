package reflection.basic_level.invoke_private_method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokePrivateMethod {

    public static void invokingPrivateMethod() throws Exception{
        String classPath="reflection.basic_level.invoke_private_method.Calculator";
        try{
            Calculator calc=new Calculator();
            Class<?> cls=Class.forName(classPath);

            //getting private method
            Method method=cls.getDeclaredMethod("multiply",int.class,int.class);
            method.setAccessible(true);
            int result= (int) method.invoke(calc,5,2);
            System.out.println("Result: " + result);
        }catch (ClassNotFoundException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e){
            System.out.println("Error occurred.");
            throw e;
        }
    }

    public static void main(String[] args) throws Exception {
        invokingPrivateMethod();
    }
}
