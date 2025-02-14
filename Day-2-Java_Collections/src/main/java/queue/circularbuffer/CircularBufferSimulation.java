package queue.circularbuffer;

import java.util.Queue;

public class CircularBufferSimulation {
    int buffer[];
    int front, rear, size, capacity;

    // initializing front, rear, size, buffer array
    public CircularBufferSimulation(int capacity){
         this.capacity=capacity;
         this.buffer = new int[capacity];
         this.rear = -1;
         this.front = 0;
         this.size = 0;
     }

     public void add(int value){

         rear = (rear + 1) % capacity;
         buffer[rear] = value;

         if(size < capacity){
             size++;
         }
         else {
             front = (front + 1) % capacity;
         }
     }
     public int delete(){
         if(size == 0){
             System.out.println("Queue is Empty! ");
             return -1;
         }
           int  removedElement =  buffer[front];
             front = (front + 1) % capacity;
             size--;

         return removedElement;
     }

     public void display(){
         for (int i = 0; i < size; i++) {
             System.out.print(buffer[(front + i) % capacity] + " ");
           }
         }

     public static void main(String[]args){

         CircularBufferSimulation bufferQ = new CircularBufferSimulation(3);

         bufferQ.add(1);
         bufferQ.add(2);
         bufferQ.add(3);
         bufferQ.display();

         System.out.println();
         System.out.println("Insertion after capacity is full ");
         bufferQ.add(4);
         bufferQ.display();

         System.out.println();
         System.out.println("Deleting element :");
         bufferQ.delete();
         bufferQ.display();
     }


    public int[] getBufferState() {
        return buffer;
    }
}
