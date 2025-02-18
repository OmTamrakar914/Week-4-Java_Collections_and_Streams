package reflection.intermediate_level.dynamic_method_invocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class dynamicMethodInvocation {

    public static void callingSpecificMethod(String methodName,int a,int b) throws Exception {
        String classPath="reflection.intermediate_level.dynamic_method_invocation.MathOperations";
        try{
            MathOperations mo=new MathOperations();
            Class<?> cls=Class.forName(classPath);

            Method method = cls.getMethod(methodName,int.class,int.class);
            System.out.println("Answer : " + (int) method.invoke(mo,a,b));
        }catch(Exception e){
            System.out.println("Class not found.");
            throw e;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a=scn.nextInt();

        System.out.println("Enter second number : ");
        int b=scn.nextInt();

        System.out.println("Chose operation to perform:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        int c=scn.nextInt();

        String operation = "";
        if(c==1){
            operation="add";
        }else if(c==2){
            operation="subtract";
        }else if(c==3){
            operation="multiply";
        }else{
            System.out.println("invalid operation.");
        }

        callingSpecificMethod(operation,a,b);
    }
}
