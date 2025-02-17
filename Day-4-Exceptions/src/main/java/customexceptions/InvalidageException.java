package customexceptions;

import java.util.Scanner;

public class InvalidageException {

    public static void validateAge(int age) throws CustomExceptions{
         if(age < 18){
             throw new CustomExceptions("Age must be 18 or older!");
         }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the age");
            int age = sc.nextInt();
            validateAge(age);
        }catch (CustomExceptions e){
            System.out.println(e.getMessage());
        }

    }
}
