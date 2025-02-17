package nestedtrycatchblock;

import java.util.Scanner;

public class NestedTrycatchBlock {
    public static void nestedTryarrDivision(int[]arr, int divisor,int index){
      try{
          int result = arr[index];
          try{
              int divison = result/divisor;
              System.out.println("The Division result of "+result+" and "+divisor+" : "+divison);
          }catch (ArithmeticException e){
              System.out.println("Cannot Divide by zero!");
          }
      }catch (IndexOutOfBoundsException e){
          System.out.println("Invalid array index!");
      }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};

        System.out.println("Enter the index");
        int index = sc.nextInt();
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();

        nestedTryarrDivision(arr,divisor,index);

    }
}
