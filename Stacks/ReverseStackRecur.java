package Stacks;

import java.util.Stack;
public class ReverseStackRecur {
    public static void DisplayReverse(Stack<Integer> st){
        //base case
        if(st.size()==0) return;
        int top=st.pop();
        DisplayReverse(st);
        System.out.print(top +" ");
        //DisplayReverse(st);
        st.push(top);
    }
    public static void main(String[] args){
        //make empty stack
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        DisplayReverse(st);
    }
}
