package Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue{
    public static void main(String[] args){
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.print(q);
        Stack<Integer> st=new Stack<>();
        while(q.size() > 0){
            st.push(q.remove());

        }


        while(st.size() > 0){
            q.add(st.pop());
        }
        System.out.println();
        System.out.print(q);
    }
}