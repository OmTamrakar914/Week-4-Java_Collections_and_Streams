package junit.basic_junit_test.exception_handling;

import java.util.Scanner;

public class ExceptionHandling {
    public static int divide(int a, int b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            throw e;
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the first number");
        int a=scn.nextInt();

        System.out.println("Enter the second number");
        int b=scn.nextInt();

        System.out.println("Divide : "+divide(a,b));
    }
}
