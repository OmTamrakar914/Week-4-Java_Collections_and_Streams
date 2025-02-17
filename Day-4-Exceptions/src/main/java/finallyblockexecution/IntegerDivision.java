package finallyblockexecution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerDivision {
    public static void integerdivision(int a, int b){

       try{
           int c = a/b;
           System.out.println("The division of "+a+ "/" +b+" = "+c);
       } catch (ArithmeticException e) {
           System.out.println("Invalid input : Divide by zero");
       }finally {
           System.out.println("Operation completed!");
       }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the first number : ");
            int a = sc.nextInt();
            System.out.println("Enter the second number : ");
            int b = sc.nextInt();

            integerdivision(a,b);
        }catch (InputMismatchException e) {
            System.out.println("Input mismatch : user enter a non numeric value");
        }
    }
}
