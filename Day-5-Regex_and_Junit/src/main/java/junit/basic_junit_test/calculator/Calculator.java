package junit.basic_junit_test.calculator;

import java.util.Scanner;

public class Calculator {

    public int addition(int a,int b){
        return a+b;
    }

    public int subtraction(int a,int b){
        return a-b;
    }

    public int multiplication(int a,int b){
        return a*b;
    }

    public int divide(int a,int b){
        int div=0;
        try{
            div=a/b;
        }catch (ArithmeticException e){
            throw e;
        }
        return div;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter first number:");
        int first=scn.nextInt();
        System.out.println("Enter second number:");
        int second=scn.nextInt();

        Calculator calc=new Calculator();
        System.out.println("Addition       :" + calc.addition(first,second));
        System.out.println("Subtraction    :" + calc.subtraction(first,second));
        System.out.println("Multiplication :" + calc.multiplication(first,second));
        System.out.println("Division       :" + calc.divide(first,second));
    }
}
