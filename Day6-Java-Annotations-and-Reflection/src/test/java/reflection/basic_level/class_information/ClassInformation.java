package reflection.basic_level.class_information;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ClassInformation {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the fully qualified(full path) class name: ");
        String className = scanner.nextLine();
        scanner.close();

        printClassInfo(className);
    }

    public static void printClassInfo(String className) throws ClassNotFoundException {
        try {

            //creating class using reflection
            Class<?> cls = Class.forName(className);

            //display class name
            System.out.println("Class name : " + cls.getName());


            //Displaying fields
            System.out.println("\nFields: ");
            Field[] fields=cls.getDeclaredFields();
            for(Field field:fields){
                System.out.print(Modifier.toString(field.getModifiers()) + " ");   //accessModifiers: public, private, static, final etc.
                System.out.print(field.getType().getSimpleName() + " ");           //variable type:
                System.out.print(field.getName() + "\n");                          //variable name
            }


            //Displaying constructors
            System.out.println("\nConstructor: ");
            Constructor<?>[] constructors=cls.getDeclaredConstructors();
            for(Constructor<?> constructor:constructors){
//                System.out.println(constructor);
                System.out.print( Modifier.toString(constructor.getModifiers())+ " ");
                System.out.print(constructor.getDeclaringClass().getSimpleName() + "(");
                Class<?>[] temp=constructor.getParameterTypes();  //because this method .getParameterType is not in human readable format
                                                            // and there is no .toString method available or getSimpleName method that,s why
                                                            //we store it in Class object so that we can print it.
                for (Class<?> aClass : temp) {
                    System.out.print(aClass.getSimpleName() + ", ");
                }

                if(temp.length!=0){
                   System.out.println("\b\b)");
                }
                else{
                    System.out.println(")");
                }

            }



            //Displaying methods
            System.out.println("\nMethods: ");
            Method[] methods=cls.getDeclaredMethods();
            for(Method method:methods){
//                System.out.println(method);
                System.out.print(Modifier.toString(method.getModifiers()) + " ");
                System.out.print(method.getReturnType().getSimpleName() + " ");
                System.out.print(method.getName() + "(");

                Class<?>[] temp=method.getParameterTypes();  //because this method .getParameterType is not in human readable format
                                                            // and there is no .toString method available or getSimpleName method that,s why
                                                            //we store it in Class object so that we can print it.
                for (Class<?> aClass : temp) {
                    System.out.print(aClass.getSimpleName() + ", ");
                }

                if(temp.length!=0){
                   System.out.println("\b\b)");
                }
                else{
                    System.out.println(")");
                }

            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found : " + className);
        }
    }

}


