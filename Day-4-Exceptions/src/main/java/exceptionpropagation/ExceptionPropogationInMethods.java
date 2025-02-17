package exceptionpropagation;

import java.io.IOException;

public class ExceptionPropogationInMethods {
    public static void method1(int a,int b) throws ArithmeticException{

        int c=a/b;
        System.out.println("The Result : "+c);
    }

    public static void method2(int a, int b) throws ArithmeticException{
        method1(a,b);
    }

    public static void main(String[] args) {
        try{
            method2(10,2);
        }catch (ArithmeticException e){
            System.out.println("Handled Exception in Main");
        }
    }
}
