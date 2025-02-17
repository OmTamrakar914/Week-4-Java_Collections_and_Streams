package uncheckedexceptions;
import java.util.*;

public class RunTimeExceptions {
    public static void dividingbyzero(int a , int b){
        try{
            int c = a/b;
            System.out.println("The result is : "+c);
        }catch (ArithmeticException e){
            System.out.println("Invalid expression : Dividing by zero!");
        }
    }
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the two numbers : ");
            int a = sc.nextInt();
            System.out.println("Enter second number : ");
            int b = sc.nextInt();
            dividingbyzero(a,b);
        }catch (InputMismatchException e1){
            System.out.println("Wrong input given!");
        }
    }
}
