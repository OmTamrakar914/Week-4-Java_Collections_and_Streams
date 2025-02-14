package queue.hospitalpatientprioritysystem;

import java.util.PriorityQueue;
import static java.lang.System.*;

public class HospitalTraigeSystem {
 public static void main(String[]args){

     PriorityQueue<Patient> queue = new PriorityQueue<>(
             (p1,p2) -> Integer.compare(p2.saverity, p1.saverity)
     );

     queue.add(new Patient("John", 3));
     queue.add(new Patient("Alice", 5));
     queue.add(new Patient("Bob", 2));

     out.println("The order of Patient : ");
     while(!queue.isEmpty()){
         out.println(queue.poll());
     }
 }
}
