package multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void checkIndexOutofBound(int[] arr, int n){
        try{
            int number = arr[n];
            System.out.println("Value at index X: " + arr[n]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You accessing the element beyond the size of array!");

        }catch (NullPointerException e){
            System.out.println("The array is not iniated!");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           System.out.println("Enter the array : ");
            int arr[] = new int[5];
            for(int i=0;i<5;i++) arr[i] = sc.nextInt();
            System.out.println("Enter the index : ");
            int n = sc.nextInt();
          //  arr = null;
        checkIndexOutofBound(arr,n);

    }
}
