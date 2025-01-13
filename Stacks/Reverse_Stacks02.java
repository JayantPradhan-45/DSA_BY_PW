package Stacks;
//print at bottom
import java.util.Stack;
public class Reverse_Stacks02 {
    public static void PushAtBottom(Stack<Integer> st,int x){
        if(st.size() ==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        PushAtBottom(st,x);
        st.push(top);

    }
    public static void Reverse(Stack<Integer> st){
        if(st.size() ==0 ){
            return;
        }
        int top=st.pop();
        Reverse(st);
        PushAtBottom(st,top);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
}
