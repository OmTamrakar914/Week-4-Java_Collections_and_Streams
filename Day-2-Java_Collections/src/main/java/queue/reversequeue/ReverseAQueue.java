package queue.reversequeue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> st = new Stack<>();

        while (!queue.isEmpty()){
            st.push(queue.remove());
        }

        while(!st.isEmpty()){
            queue.add(st.pop());
        }
        return queue;
    }
    public static void main(String[]args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
