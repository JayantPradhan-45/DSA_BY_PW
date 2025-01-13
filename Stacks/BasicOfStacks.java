package Stacks;
import java.util.Stack;
import java.util.Stack;
public class BasicOfStacks {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(34);
        st.push(23);
        st.push(12);  // push is uses for adding ;
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());



    }
}
