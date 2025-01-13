package Stacks;
//copy contents of one stacks to another in same order ;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args){
        //make a empty stack;
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(9000);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Stack<Integer> gt=new Stack<>();
        while(st.size() > 0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt=new Stack<>();
        while(gt.size() > 0){
            rt.push(gt.pop());
        }
        System.out.println(rt);

    }
}
