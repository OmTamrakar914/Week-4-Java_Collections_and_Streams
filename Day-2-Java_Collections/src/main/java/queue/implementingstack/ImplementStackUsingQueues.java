package queue.implementingstack;
import java.util.LinkedList;
import java.util.Queue;
import static java.lang.System.*;

public class ImplementStackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int n){
        q2.add(n);

        while(!q1.isEmpty()){
         q2.add(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop(){
        if(q1.isEmpty()){
            out.println("Stack is empty!");
            return -1;
        }
          return  q1.poll();
    }
    public int top(){
        if(q1.isEmpty()){
            out.println("Stack is empty!");
            return -1;
        }
        return q1.peek();

    }
    public boolean isEmpty(){
        if(!q1.isEmpty()){
            return false;
        }
        return true;
    }
    public void display(){
        Queue<Integer> temp = new LinkedList<>(q1);
        while(!temp.isEmpty()){
            out.println(temp.poll());
        }
    }

    public static void main(String[]args){

        ImplementStackUsingQueues st = new ImplementStackUsingQueues();

        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);

        st.display();

       int pop =  st.pop();
        out.println("Poping element : "+pop);

        st.display();

        int top = st.top();
        out.println("Getting the Top element : "+top);



    }
}
