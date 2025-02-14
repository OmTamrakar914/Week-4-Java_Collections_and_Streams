package queue.binarynumber;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import static java.lang.System.*;

public class BinaryNoUsingQueue {
    public static Queue<String> binaryqueue(int n){
        Queue<String> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.add(Integer.toBinaryString(i));
        }
        return queue;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        out.println("Enter the number : ");
        int n = sc.nextInt();
        out.println(binaryqueue(n));
    }
}
